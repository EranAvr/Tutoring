package ex220726.orders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ניצור מסעדה יחידה לניהול ההזמנות שלה
        String name = s.nextLine();
        Restaurant rst = new Restaurant(name, 20);
        System.out.println(rst);


        System.out.println("Enter order time:");
        int t = s.nextInt();
        System.out.println("Enter order price:");
        double p = s.nextDouble();
        Order o = new Order("", false, t, p);

        rst.addOrder(o);
        System.out.println(rst);



    }

    // פונ' לקליטת הזמנה מלקוח/בנאדם
    // לשיפור וקיצור פונ' ה-main
    public static Order takeOrder(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter order time:");
        int t = s.nextInt();
        System.out.println("Enter order price:");
        double p = s.nextDouble();
        Order o = new Order("", false, t, p);
        return o;
    }
}
