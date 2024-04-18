package exercises;

import java.util.Random;

public class Functions180424 {
    static int state = 0;
    static int id = 1;
    public static void main(String[] args) {
        /*
        checkStatic();
        checkStatic();
        checkStatic();
        */

        testUsers(5);
    }



    static public void checkStatic(){
        int x = 0;
        System.out.println("x: " + x + " state: " + state);
        x++; state++;
        System.out.println("x: " + x + " state: " + state);
    }

    static public void testUsers(int limit){
        Random rnd = new Random();
        int ag = rnd.nextInt();
        for (int i=0; i< limit; i++){
            createUser("Eran", ag % 121);
        }
    }
    static public void createUser(String name, int age){
        // int id = 0; -> we don't want it here
        System.out.println("{\n Id: " + id + "\nUser Name: " + name + "\nAge:" + age + "\n}");
        id++;
    }
}
