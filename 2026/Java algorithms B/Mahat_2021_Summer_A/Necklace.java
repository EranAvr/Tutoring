package Mahat_2021_Summer_A;

public class Necklace {
    private int red;
    private int yellow;
    private int green;

    public Necklace(int r, int y, int g){
        this.red = r;
        this.yellow = y;
        this.green = g;
    }

    /*public int necklaceType(){
        if (red > 0 && yellow == 0 && green == 0 ||
                red == 0 && yellow > 0 && green == 0 ||
                red == 0 && yellow == 0 && green > 0 )
            return 1;
//            נמשיך באותו האופן לכל הבדיקות.
//            נבדוק לכל סעיף את כל המקרים
        return 4;
    }*/
    public int necklaceType(){
        int countColors = 0;
        if (red > 0) countColors++;
        if (yellow > 0) countColors++;
        if (green > 0) countColors++;

        if (countColors == 1) return 1;
        if (red == yellow && red == green) return 2;
        if (countColors == 2) return 3;
        return 4;
    }

    public int countBorings(Necklace[] necklaces, int num){
        int count = 0;

        for (int i = 0; i < necklaces.length; i++) {
            int len = necklaces[i].red + necklaces[i].yellow + necklaces[i].green;
            if (len > num && necklaces[i].necklaceType() == 3)
                count++;
        }
        return count;
    }
}
