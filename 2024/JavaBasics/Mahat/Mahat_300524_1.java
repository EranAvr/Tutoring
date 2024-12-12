package exercises.Mahat;


public class Mahat_300524_1 {
    public static void main(String[] args) {

        Artist a1 = new Artist("Eran", 0, null);
        Artist a11 = new Artist(a1);

        System.out.println(a1);
        System.out.println(a11);

        System.out.println("I am calling a function " + saySome());

    }
    public static String saySome(){
        return "Something to say";
    }
}
