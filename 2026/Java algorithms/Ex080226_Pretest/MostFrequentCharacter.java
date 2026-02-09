package Ex080226_Pretest;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        System.out.println(findMostFrequent("abc"));
        System.out.println(findMostFrequent("abccde"));
        System.out.println(findMostFrequent("f4$Tf#$TR#$F"));
    }
    
    public static char findMostFrequent(String str){
        int[] counters = new int[256];
        int max = 0;
        // count:
        for (int i = 0; i < str.length(); i++) {
            counters[str.charAt(i)]++;
            // We can search for maximum counting here, during the process,
            // instead of searching for max later at the end.
            if (counters[str.charAt(i)] > counters[max])
                max = str.charAt(i);
        }
        // find max:
        /*int max = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[max])
                max = i;
        }*/
        return (char) max;
    }
}
