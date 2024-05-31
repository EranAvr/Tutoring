package exercises.Mahat;

public class Artist {
    // Fields:
    private String name;
    private int numOfFans;
    private MyArt art;

    // Constructors:
    public Artist(String name,int numOfFans,MyArt art){
        this.name = name;
        this.numOfFans = numOfFans;
        this.art = art;
    }
    public Artist(Artist a){
        this.name = a.name;
        this.numOfFans = a.numOfFans;
        this.art = a.art;
    }

    // Getters:
    public String getName() {
        return name;
    }

    public int getNumOfFans() {
        return numOfFans;
    }

    public MyArt getArt() {
        return art;
    }

    // ג2
    public boolean theSame(Artist a){
        /*
        if (this.name.equals( a.name) &&
        this.numOfFans == a.numOfFans &&
        this.art == a.art) {
            return true;
        }
        return false;
        */

        return this.name.equals( a.name) &&
                this.numOfFans == a.numOfFans &&
                this.art == a.art;
    }
}
