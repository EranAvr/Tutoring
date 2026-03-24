package ex240326;

public class Player {
    // fields:
    private String nickname;
    private char team;
    private int playTime;
    private int life;
    private String weapon;
    private int ammo;

    // constructors:
    public Player(String nickname, char team) {
        this.nickname = nickname;
        this.team = team;
    }
    public Player(String nickname, char team, int playTime, int life) {
        this.nickname = nickname;
        this.team = team;
        this.playTime = playTime;
        this.life = life;
    }

    // getters/setters:
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public char getTeam() {
        return team;
    }
    public void setTeam(char team) {
        if (team >= 'A' && team <= 'Z')
            this.team = team;
        else
            System.out.println("Illegal team symbol");
    }
    public int getPlayTime() {
        return playTime;
    }
    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        if (life >=0 && life <= 100)
            this.life = life;
        else
            System.out.println("Illegal life value");
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getAmmo() {
        return ammo;
    }
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    // methods:
    public void attack(){
        System.out.println("Attacking with weapon " +this.weapon+ " and ammunition " + this.ammo);
    }
    public void takeHit(int damage){
        life -= damage;
        if (life < 0)   // בדיקת תקינות שלא חרגנו בטווח
            life = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", team=" + team +
                ", playTime=" + playTime +
                ", life=" + life +
                ", weapon='" + weapon + '\'' +
                ", ammo=" + ammo +
                '}';
    }
}
