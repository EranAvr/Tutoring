package Mahat_2021_Summer_A;

public class Main {
    public static void main(String[] args) {

    }

    static boolean isCopyK(String s1, String s2){
        if (s1.length() % s2.length() != 0) return false;

        int K = s1.length() / s2.length();
        String res = "";
        for (int i = 0; i < K; i++) {
            res += s2;
        }

        return s1.equals(res);
    }
}
