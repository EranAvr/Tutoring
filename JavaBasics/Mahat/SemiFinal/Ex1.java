package Mahat.SemiFinal;

public class Ex1 {
    public static void main(String[] args) {
        Website web1 = new Website("Walla", 30, 19, true);
        System.out.println(web1.tostring());

        Website web2 = new Website("Google", 15, 101, false);
        Website web2NewTab = new Website(web2);
        System.out.println(web2.tostring());
        System.out.println(web2NewTab.tostring());
    }
}
