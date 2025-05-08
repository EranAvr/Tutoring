package Ex080525;

public class Player {
    private String name;
    private int damage;
    private int life;

    public Player(String pName, int damage){
        this.name = pName;
        this.damage = damage;
        this.life = 100;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    // methods
    public void attack(Player other){
        // מפעיל הפונ' הוא this
        // לכן ניקח את עוצמת ההתקה שלו damage
        // האובייקט הנפגע הוא other שקיבלנו כפרמטר
        // לכן הוא זה שנוריד לו חיים. אז קוראים למתודה setLife
        // על האובייקט other כדי לעדכן לו את הרעך
        other.setLife(other.getLife() - this.getDamage());
    }
}
