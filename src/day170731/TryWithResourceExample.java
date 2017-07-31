package day170731;

public class TryWithResourceExample {

    static class Resource implements AutoCloseable{



        public void use() {
        }

        @Override
        public void close() throws Exception{

        }
    }

    public static void main(String[] args) {



        try (Resource r = new Resource()){
            r.use();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
