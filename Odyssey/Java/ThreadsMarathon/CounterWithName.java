package ThreadsMarathon;

public class CounterWithName extends Thread {

    public String name;

    public CounterWithName(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=1; i <= 500; i++){
            System.out.println(this.name + " " + i);
        }
    }
}
