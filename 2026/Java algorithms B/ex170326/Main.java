package ex170326;


/*
    מחלקות: דוגמאות מילוליות

    Book:
        - author: String    // סופר
        - title: String     // שם הספר
        - pages: int        // מס' דפים
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str;
        //Point p = new Point();
        Point p = new Point(0, 0);
        System.out.println("Before: " + p.getX() );

        p.setX(5.0);
        System.out.println("After: " + p.getX() );

        System.out.println(p);


        /*Student st1 = new Student();
        System.out.println("ID: " + st1.getId() + " Name: " + st1.getName() + " Grade: " + st1.getGrade());

        st1.setId("123456789");
        st1.setName("John Doe");
        st1.setGrade(99);
        System.out.println("ID: " + st1.getId() + " Name: " + st1.getName() + " Grade: " + st1.getGrade());

         */
        Student st1 = new Student("123456789", "John Doe", 99);
        System.out.println("ID: " + st1.getId() + " Name: " + st1.getName() + " Grade: " + st1.getGrade());

        st1.setGrade(90);
        System.out.println("ID: " + st1.getId() + " Name: " + st1.getName() + " Grade: " + st1.getGrade());

        System.out.println(st1);




    }
}
