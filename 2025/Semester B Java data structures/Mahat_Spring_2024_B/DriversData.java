package Mahat_Spring_2024_B;

public class DriversData {
    private Node<Driver> drivers;

    public Node<Driver> deleteDriver(String id){
        if (drivers == null)    // שרשרת ריקה
            return null;

        Node<Driver> temp = drivers;
        if ( drivers.getValue().getId().equals(id) ){   // חוליה ראשונה
            drivers = drivers.getNext();    // עוקפים חוליה ראשונה
            temp.setNext(null); // מנתקים חוליה מהשרשרת
            return temp;    // מחזירים את החוליה עם הנהג הנבחר
        }

        while (temp.getNext() != null &&
                !temp.getNext().getValue().getId().equals(id)){
            temp = temp.getNext();
        }
        if (temp.getNext() == null){    // לא נמצא הנהג
            return  null;
        }
        else {
            Node<Driver> driver = temp.getNext();
            temp.setNext(driver.getNext());
            return driver;
        }
    }

    public int maxOfActives(int age){
        Node<Driver> temp = drivers;
        int max = 0;
        while (temp != null){
            Driver d = temp.getValue();
            if (d.getAge() == age && d.isActive() && d.getCharges() > max)
                max = d.getCharges();
            temp = temp.getNext();
        }
        return max;
    }
    public void deactivateDrivers(){
        for (int a = 18; a <= 120 ; a++){
            int curMax = maxOfActives(a);
            Node<Driver> temp = drivers;
            while (temp != null){
                if (temp.getValue().getAge() == a && temp.getValue().getCharges()==curMax){
                    temp.getValue().setActive(false);
                    System.out.println(temp.getValue());
                }
                temp = temp.getNext();
            }
        }
    }

}
