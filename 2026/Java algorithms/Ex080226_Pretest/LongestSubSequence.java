package Ex080226_Pretest;

public class LongestSubSequence {
    public static void main(String[] args) {
        findLongestSubSequence("abcbabb");
    }

    public static boolean isUnique(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static void findLongestSubSequence(String str){
        for (int len = str.length(); len > 0; len--) {
            for (int i = 0; i < str.length() - len; i++) {
                //System.out.println(str.substring(i, i+len+1));
                if (isUnique(str.substring(i, i+len+1))){
                    System.out.println(str.substring(i, i+len+1));
                    return;
                }
            }
        }
    }
}
