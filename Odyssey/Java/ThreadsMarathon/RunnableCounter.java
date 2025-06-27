package ThreadsMarathon;

public class RunnableCounter implements Runnable{
    public static int COUNT = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            COUNT++;
        }
    }
}
