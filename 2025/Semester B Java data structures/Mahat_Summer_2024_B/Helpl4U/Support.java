package Mahat_Summer_2024_B.Helpl4U;

public class Support {
    public final int N = 15;
    private Service[] stands = new Service[N];


    /*
        1. מקבלים פרטי מתקשר ויוצרים אובייקט חדש של Caller
        2. לחפש עמדה עם מינימום ממתינים
        3. להוסיף מתקשר חדש אל סוף תור הממתינים
     */
    void startSupport (String name, String phone){
        // 1.
        Caller c = new Caller(name, phone);
        // 2.
        //int min = stands[0].getNumOfCallers();
        int idx = 0;
        for (int i = 0; i < stands.length; i++) {
            /*
            if (stands[i].getNumOfCallers() < min){
                min = stands[i].getNumOfCallers();
                idx = i;
            }*/
            if (stands[i].getNumOfCallers() < stands[idx].getNumOfCallers()){
                idx = i;
            }
        }
        // 3.
        stands[idx].addCaller(c);
    }


    public int theBest(){
        /*int maxIdx = 0;
        for (int i = 0; i < stands.length; i++) {
            if (stands[i].getCount() > stands[maxIdx].getCount())
                maxIdx = i;
        }
        return maxIdx;*/
        return Service.maxStand;
    }
}
