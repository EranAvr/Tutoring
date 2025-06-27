package ThreadsMarathon;

public class Counter extends Thread {

    @Override
    public void run() {
        for(int i=1; i <= 500; i++){
            System.out.println(i);
        }
    }
}
