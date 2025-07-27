package Pre_Moed_B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // https://www.w3resource.com/java-exercises/basic/index.php

        // ex82
        /*
            כתבו פונ' המקבלת מערך מטיפוס int
            הפונ' תבדוק ללא לולאה מי המספר הגדול מבין:
            התא הראשון, האמצעי והאחרון של המערך.
            הפונ' תחזיר את הערך שנמצא.
         */
        // גירסא ראשונה:
        int first=s.nextInt(), middle=s.nextInt(), last=s.nextInt();
        if (first > last){  // ממשיכים עם first
            if (first > middle)
                System.out.println(first);
            else
                System.out.println(middle);
        }
        else {  // ממשיכים עם last
            if (last > middle)
                System.out.println(last);
            else
                System.out.println(middle);
        }
    }
}
