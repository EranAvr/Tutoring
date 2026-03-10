package Ex100326;

public class StringsRecap {
    public static void main(String[] args) {
        /*
            קישור אל אתר התרגילים:
            https://studylib.net/doc/25916676/%D7%9Fidka%D7%9C%D7%92?p=40
         */
    }

    // ex3
    public static int howMany(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

    // ex4
    public static boolean notExist(String str, char c){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                return false;
        }
        return true;
    }

    // ex6
    public static String removeNonLetters(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||
                    str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                s += str.charAt(i);
        }
        return s;
    }

    // ex8
    public static boolean arePermutation(String s, String t){
        int[] counters = new int['z'-'a'+1];
        // increase counting for string s
        for (int i = 0; i < s.length(); i++) {
            counters[s.charAt(i)-'z']++;
        }
        // decrease counting for string t
        for (int i = 0; i < t.length(); i++) {
            counters[t.charAt(i)-'z']--;
        }
        // if permutation, array should contain only zeros.
        // otherwise, some cell must be greater or lesser than 0.
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] != 0)
                return false;
        }
        return true;
    }

    // ex9

    // ex10
}
