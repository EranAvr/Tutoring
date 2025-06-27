package ThreadsMarathon;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();

        // ----------- Thread class -----------

        /*
        c1.run();     // הפעלה סינכרונית. רגילה. לא מקבילה
        System.out.println("End of counting");
        */

        // הפעלה אסינכרונית.
        // פועלת במקביל לתוכנית הראשית
        // ובמקביל לכל חוט אחר
        /*
        // המתודה start מריצה למעשה את המתודה run
        // אבל באופן אסינכרוני, ובמקביל לתוכנית הראשית
        // ולחוטים אחרים
        c1.start();
        System.out.println("End of counting");*/

        /*CounterWithName cwn1 = new CounterWithName("Bobby");
        CounterWithName cwn2 = new CounterWithName("Jamie");
        cwn1.start();
        cwn2.start();
        */

        // ----------- Runnable interface -----------
        /*
        MyRunnable mr1 = new MyRunnable();
        Thread t = new Thread(mr1);

        MyRunnable mr2 = new MyRunnable();
        Thread t2 = new Thread(mr2);
        */

        // לא חוקי ללא מנגנון סנכרון מסודר
        // אם נפעיל חוט פעם נוספת, בלי שהוא סיים לעבוד
        // אנחנו מכניסים אותו למצב לא חוקי
        // אי אפשר להפעיל את אותו החוט שוב, בלי שהוא סיים
        /*
        t.start();
        t.start();
        */

        /*
        t.start();
        t2.start();
        */


        //  ניתן להריץ Runnable יחיד על שני חוטים נפרדים
        // הדבר יעבוד.
        // אבל! אותו האובייקט (כתובת) רץ מבצע את אותה
        // המשימה באופן כפול.
        // קשה להבדיל בין החוטים.
        // גרוע מכך! אם שני החוטים פונים אל אותו זכרון משותף
        // בתוך האובייקט - הם דורסים זה את זה.
        /*
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.start();
        t2.start();
        */

        /*
        RunnableCounter rc = new RunnableCounter();
        Thread rct1 = new Thread(rc);
        Thread rct2 = new Thread(rc);
        */

//            שני החוטים מפעילים את אותו הקוד,
//            ופונים אל משאב משותף (המשתנה COUNT).
//            שני החוטים מריצים לולאה להגדלת הערך של COUNT,
//            אבל (!!) בגלל שאין שום מנגנון סנכרון ביניהם -
//            החוטים דורסים זה את זה!
//            כלומר, כאשר שני החוטים פונים אל COUNT בדיוק באותו הרגע,
//            ההתנגשות מבטל את אחד מהם.
//
//            התוצאה- המשתנה COUNT היה אמור לגדול 200,000 פעמים,
//            אבל בגלל ההתנגשויות התפספסו אלפי פעולות עליו!

        /*
        rct1.start();
        rct2.start();

        try {
            rct1.join();
            rct2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(RunnableCounter.COUNT);
        */


        // ----------- Lambda thread -----------
        /*
        LambdaIter li = () -> {
            System.out.println("Custom interface lambda");
        };
        li.func1();

        Runnable r = () -> {
            System.out.println("Lambda code is running...");
        };

        r.run();    // הפעלה סינכרונית

        Thread t = new Thread(r);
        t.start();  // הפעלה אסינכרונית


        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "Bobby thread");
        t.start();

         */
    }
}
