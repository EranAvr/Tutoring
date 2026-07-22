package Mahat_2026_Spring_A;

public class Parking {
    private CompanyCar[] cars;
    private String[] parkingSpots;
    private int currentCars;
    private CompanyLimit[] limits;

    public Parking(CompanyLimit[] limits){
        this.cars = new CompanyCar[150];
        this.parkingSpots = new String[150];
        this.currentCars = 0;
        this.limits = limits;
    }

    public boolean checkSpot(String spot){
        for (int i = 0; i < parkingSpots.length; i++) {
            if (spot.equals(this.parkingSpots[i]))
                return false;   // החניה לא פנויה
        }
        return true;
    }

    public boolean parkCar(String license, String manufacturer,
                           String company, String spot){
        // בדיקת תפוסה
        if (!checkSpot(spot)){  // החניה כבר תפוסה
            System.out.println("Find another parking you loser");
            return false;
        }
        // בדיקת מגבלה/מכסה של חברה
        // a) מציאת המגבלה של החברה המבוקשת
        int lim = 0;
        for (int i = 0; i < limits.length; i++) {
            if (limits[i].getCompanyName().equals(company))
                lim = limits[i].getCompanyLimit();
        }
        // b) ספירת כמות רכבים של החברה הרצויה
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getCompany().equals(company))
                count++;
        }
        // c) בדיקת כמות מול מכסה
        if (count >= lim){  // המכסה מלאה
            System.out.println("No more cars for this company you loser");
            return false;
        }
        // הכנסת רכב - נעדכן את כל שדות המחלקה הרלוונטים
        // a) שמירת הרכב
        CompanyCar c = new CompanyCar(license, manufacturer, company);
        int i = 0;
        while (i < cars.length && cars[i] != null)
            i++;
        cars[i] = c;
        // b) שמירת מיקום החניה
        i = 0;
        while (i < parkingSpots.length && parkingSpots[i] != null)
            i++;
        parkingSpots[i] = spot;
        // c) עדכון המס' הטוטאלי בחניון
        this.currentCars++;
        // d) החזרת ערך true
        return true;
    }
}
