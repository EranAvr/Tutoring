package Mahat_Summer_2024_A;

public class TestDestination {

    public static String getNotPopular(Destination[] dest){
        /*int minNum = dest[0].getNum();
        String minName = dest[0].getName();

        for (int i=0; i<dest.length; i++){
            if (dest[i].getNum() < minNum){
                minNum = dest[i].getNum();
                minName = dest[i].getName();
            }
        }

        return minName;*/

        Destination minDest = dest[0];

        for (int i=0; i<dest.length; i++){
            if (dest[i].getNum() < minDest.getNum()){
                minDest = dest[i];
            }
        }

        return minDest.getName();
    }

    public static String[]cheapDests(Destination[] dest, double maxPrice){
        // נספור כמה יעדים טובים לנו לחיפוש
        int count = 0;
        for (int i = 0; i < dest.length; i++) {
            if (dest[i].getPrice() < maxPrice)
                count++;
        }

        // נבנה מערך מחרוזות, ונכניס את אותם יעדים
        String[] arr = new String[count];
        int j = 0;  // אינדקס עזר עבור המערך arr

        for (int i = 0; i < dest.length; i++) {
            if (dest[i].getPrice() < maxPrice){
                arr[j] = dest[i].getName();
                j++;    // נקדם את j באופן ידני רק על כל מציאת יעד תקין
            }
        }

        return arr;
    }
}
