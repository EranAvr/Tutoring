package Ex080525;

public class Main {
    public static void main(String[] args) {
        // create objects-
        Car car1 = new Car("SLK", 3000, "red", 250);
        Car car2 = new Car("Mustang", 4000, "blue", 300);

        // use object methods-
        car1.setColor("black");

        // Game simulation:
        Player p1 = new Player("Johnson", 30);
        Player p2 = new Player("Bobby", 25);

        while (p1.getLife() > 0 && p2.getLife() > 0){
            p1.attack(p2);

            if (p2.getLife() <= 0){
                break;
            }

            p2.attack(p1);
        }

        System.out.println("p1 life = " + p1.getLife());
        System.out.println("p2 life = " + p2.getLife());
    }
}
