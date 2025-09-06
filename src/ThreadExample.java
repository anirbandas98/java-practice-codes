public class ThreadExample implements Runnable {
    public static void main(String[] args) {

        Runnable myRunnable = () -> {
            System.out.println("This is running in a new thread created with a lambda.");
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 message: " + i);
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore the interrupted status
                    System.out.println("Thread interrupted.");
                }
            }
        };

        Thread t1 = new Thread(myRunnable);
        t1.start();
        ThreadExample te = new ThreadExample();
        te.run();
        System.out.println("Main thread continues execution.");
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2 message: " + i);
        }
    }
}
