package MoedC;

import java.util.Scanner;

public class Ex170924 {
    public static void main(String[] args) {

        // Recap:
        System.out.println("Hello");
        System.out.println("World");

        {System.out.print("Hello");
        System.out.print("World");}
        System.out.println("Another Text");

        System.out.println(true);
        System.out.println('a');
        System.out.println(3);
        System.out.println(3.14);

        System.out.println('b' - 'a');

        int x;
        /*Scanner s;
        s = new Scanner(System.in);*/
        Scanner s = new Scanner(System.in);

        //System.out.println( s.nextInt() );
        //System.out.println( s.nextInt() + s.nextInt() );


        int a = 10;
        if (a < 20){
            System.out.println("Smaller than 20");
        }
        else if (a % 2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Some text..");
        }


        // Exercises:
        // ex11
        System.out.println("Enter radius:");
        double r = s.nextDouble();
        double PI = 3.14;

        double area = PI * r * r;
        System.out.println(area);

        double p = 2 * PI * r;
        System.out.println(p);


        // ex10 - Daniel's exercises
        System.out.println("Enter code:");
        int code = s.nextInt();

        int rightDigit = code % 10;

        if (rightDigit == 0 || rightDigit == 1){
            System.out.println("discount is 20%");
        }
        if (rightDigit == 2){
            System.out.println("discount is 30%");
        }
        if (rightDigit == 3 || rightDigit ==4){
            System.out.println("discount is 50%");
        }
        if (rightDigit == 5){
            System.out.println("discount is 60%");
        }
        if (rightDigit == 6){
            System.out.println("discount is 70%");
        }
        if (rightDigit == 7){
            System.out.println("discount is 80%");
        }
        else {
            System.out.println("discount is 80%");
        }


        // ex71
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String newStr = ""; // ניתן, לשם הנוחות, להשתמש במשתנה שעליו נשמור את חיבור המחרוזות
        newStr = str1.substring(1) + str2.substring(1);
        System.out.println(newStr);


        // ex75
        int[] arr = {1, 5, 78, 299, 23, 60, 80};
        // תזכורת על חישוב מיקומים מיוחדים במערך-
        //System.out.println(arr[0]); // first element
        //System.out.println(arr[arr.length / 2]);    // middle element
        //System.out.println(arr[arr.length - 1]);    // last element

        if(arr[0] == arr[arr.length - 1]){
            System.out.println("Elements are equal");
        } else {
            System.out.println("Elements are different");
        }


        // ex78
        int[] arr2 = {4, 7};
        // נעדיף שני if-ים, כי צריך גם לבדוק את שני תאי המערך
        // ולכל תא צריך לבדוק שני מספרים שונים (4 ו-7)
        if(arr2[0] == 4 || arr2[1] == 4){
            System.out.println("Found 4");
        }
        // חשוב להשתמש בelse-if כי אחרת יכולנו למצוא 4 ולא 7, שזה תקין, ובכל זאת הelse יעבוד למרות שהוא לא אמור
        else if (arr2[0] == 7 || arr2[1] == 7){
            System.out.println("Found 7");
        }
        else {
            System.out.println("Not Found 4 or 7");
        }


        // ex80
        int[] arr3 = {20, 30, 20};
        if(arr3[0] > arr3[2]){  // אם תא ראשון גדול מהאחרון
            System.out.println("First is bigger");
        }
        else if (arr3[0] < arr3[2]){    // אם תא אחרון גדול מהראשון
            System.out.println("Last is bigger");
        }
        // תוספת שלנו כדי להתייחס לשיוויון בין ערכים-
        else {
            System.out.println("Equals");
        }
    }
}
