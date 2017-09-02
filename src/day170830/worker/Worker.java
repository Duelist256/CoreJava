package day170830.worker;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {

    private static final Runnable POISON_PILL = () -> {
    };

    private BlockingQueue<Runnable> tasks = new BlockingQueue<>();

    volatile private boolean stop;
    volatile private boolean poisoned;

    public Worker() {
        new Thread(this::processTasks).start();
    }

    @Override
    public void execute(Runnable command) {

        if (stop || poisoned) {
            throw new RuntimeException("Worker has been shutdown");
        }

        tasks.put(command);
    }

    private void processTasks() {
        while (!stop) {
            Runnable task = tasks.take();

            if (task == POISON_PILL) {
                return;
            }

            Optional.ofNullable(task).ifPresent(Runnable::run);
        }
    }

    public void shutdown() {
        poisoned = true;
        tasks.put(POISON_PILL);
    }

    public List<Runnable> shutdownNow() {
        stop = true;
        return tasks.getItems();
    }
}
