package Mahat_Spring_2024_B;

public class Travel {
    private String destination;
    private Traveler[] travelers;
    private int price;
    private Date startDate;

    public void notValidNames(){
        for (int i = 0; i < travelers.length; i++) {
            if (travelers[i].getExpireDate().before(this.startDate))
                System.out.println(travelers[i].getName());
        }
    }

    public boolean isGuaranted(int minNum){
        int countGoing = 0;
        for (int i = 0; i < travelers.length; i++) {
            if ( this.startDate.before(travelers[i].getExpireDate()) )
                countGoing++;
        }
        return countGoing >= minNum;
    }
}
