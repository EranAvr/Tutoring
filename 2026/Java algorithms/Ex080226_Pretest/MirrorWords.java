package Ex080226_Pretest;

public class MirrorWords {
    public static void main(String[] args) {
        System.out.println(mirrorWords("Java is fun"));
    }

    // lesser solution:
    /*public static String mirrorWords(String str){
        // Java is fun => avaJ si nuf
        String temp = "";

        int start = 0;
        // take all words without the last one
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' '){
                for (int j = i-1; j >= start ; j--)
                    temp += str.charAt(j);
                temp += ' ';
                start = i+1;
            }
        }

        return temp;
    }*/

    // better solution:
    public static String mirrorWords(String str){
        String temp = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' '){
                temp += word + " ";
                word = "";
            } else {
                word = c + word;
            }
        }
        temp += word;

        return temp;
    }
}
