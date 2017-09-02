package day170830.worker;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {

    static final Runnable POISON_PILL = () -> {
    };

    BlockingQueue<Runnable> tasks = new BlockingQueue<>();
    volatile private boolean stop;

    public Worker() {
        new Thread(this::processTasks).start();
    }

    @Override
    public void execute(Runnable command) {
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
        tasks.put(POISON_PILL);
    }

    public List<Runnable> shutdownNow() {
        stop = true;
        return tasks.getItems();
    }
}
