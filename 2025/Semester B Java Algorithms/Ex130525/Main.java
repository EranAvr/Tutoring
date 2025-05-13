package Ex130525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Class exercises
        // url: https://www.w3resource.com/java-exercises/oop/index.php

        // ex2
        /*
            Write a Java program to create a class called
            "Dog" with a name and breed attribute.
            Create two instances of the "Dog" class, set their
            attributes using the constructor and modify the
            attributes using the setter methods and print the updated values
            כתבו מחלקה בשם Dog עם השדות name ו-breed
            יש לכתוב למחלקה בנאי ומתודות getter/seeter.
            יש ליצור ב-main שני אובייקטים מטיפוס Dog
            לאתחל אותם ולשנות את התכונות שלהם.
         */
        Dog dog1 = new Dog("Rexi", "Shitzu");
        Dog dog2 = new Dog("Lassi", "Border-Cooley");
        System.out.println("Dog 1: " + dog1.getName() + " is " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " is " + dog2.getBreed());
        dog1.setName("Rexu");
        System.out.println("Dog 1: " + dog1.getName() + " is " + dog1.getBreed());


        // ex4
        /*
            Write a Java program to create a class called "Circle"
            with a radius attribute (double). You can access and modify this
            attribute. Calculate the area and circumference of the circle
            רשמו מחלקה בשם Circle עם שדה יחיד radius מטיפוס double
            יש לכתוב למחלקה בנאי ומתודות getter ו-setter
            יש לכתוב למחלקה מתודות area המחזירה את שטח המעגל
            ובנוסף מתודה circumference המחזירה את היקף המעגל
            אפשר לקבל את ערכו של הקבוע PI מתוך Math.PI
            PI = 3.14
            area = PI * radius ^ 2
            circumference = 2 * PI * radius
         */
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        System.out.println("Circle 1: radius=" +c1.getRadius()+ " area=" + c1.area() + " circum=" + c1.circumference());
        System.out.println("Circle 2: radius=" +c2.getRadius()+ " area=" + c2.area() + " circum=" + c2.circumference());


        // ex5
        /*
            Write a Java program to create a class called "Book"
            with attributes for title, author, and ISBN, and methods
            to add and remove books from a collection
            שלב א'
            כתבו מחלקה בשם Book המייצג ספר.
            המחלקה מכילה את השדות: title, author, ISBN
            המחלקה תכלול שדות בנאי ומתודות getter/setter
            שלב ב'
            כתבו קוד בתוך פונ' ה-main אשר קולט נתונים מהמשתמש
            עבור 3 השדות של המחקה Book. בסוף קליטת הנתונים,
            יש ליצור אובייקט Book עם הנתונים המתקבלים ולהדפיס מחרוזת
            מייצגת למסך
         */
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String t = s.nextLine();
            String a = s.nextLine();
            String isbn = s.nextLine();
            Book b1 = new Book(t, a, isbn);
            System.out.println("Book " + (i+1) + " details:");
            System.out.println(b1.getTitle() + ", " + b1.getAuthor() + ", " + b1.getISBN());
        }


        // ex6
        /*
            Write a Java program to create a class called "Employee"
            with a name, job title, and salary attributes, and methods
            to calculate and update salary.
            if job_title = worker
                then salary stays the same
            if job_title = manager
                then salary multiplied by 1.5
         */

        // ex7
        /*
            Easy: רמה קלה
            Write a Java program to create a class called "Bank"
            with a collection of accounts and methods to add and
            remove accounts, and to deposit and withdraw money.
            Hard: רמה גבוהה
            Also define a class called "Account" to maintain account
            details of a particular customer
            שלב א': ניתן לפתור את התרגיל באופן פשטני
            בעזרת 2 מערכים שיחזיקו בהתאמה שמות לקוחות ואת
            סכום הכסף שלהם
            שלב ב': ניתן ליצור מחלקת עזר שנקראת Account שתחזיק עבור
            לקוח את שמו ואת סכום הכסף שלו. ואז המחלקה Bank
            מחזיקה מערך יחידה של אובייקטים מטיפוס Account
         */
    }
}
