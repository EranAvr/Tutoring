package exercises.Mahat;

public class Emi {
    public static void main(String[] args) {
        // objects for testing:
        MyArt myArt = new MyArt("painter" ,100000);

        Artist a1 = new Artist("Picasso",1000, myArt);
        Artist a2 = new Artist("Dalli",1000, myArt);



        // actual tests:
        // ג4
        System.out.println( a1.theSame(a2) );
        // ג5
        System.out.println( sameRating(a1, a2) );
    }
    // ג3
    static public boolean sameRating(Artist a1, Artist a2){
        return a1.getNumOfFans() == a2.getNumOfFans() &&
                a1.getArt().getArtType().equals(a2.getArt().getArtType());
    }
}
