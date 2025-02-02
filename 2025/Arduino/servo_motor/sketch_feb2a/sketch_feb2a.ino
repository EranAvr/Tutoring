const int motorPin = 3;
const int delayTime = 1500;

void setup() {
  pinMode(motorPin, OUTPUT);
}

void loop() {
  /*
    תדירות גבוהה או נמוכה נקבעת לפי זמן השהייה בין פולסים.
    נוכל ליצור זמן השהייה כרצוננו בעזרת הפונקציה-
    delayMicroseconds()
    הפונ' הזאת עדיפה כי היא יוצרת השהייה קצרה שמתאימה יותר לפולסים.

    אם נשנה את זמן ההשהייה בין כיבוי והדלקה,
    נקבל תדירוץת אחרת, וכל תדירות מתפרשת לזווית אחרת במעלות.
  */
  for (int i=500; i<=2500; i += 500){ // החלף זמן השהייה

    for(int j=0; j<1000; j++){  // הישאר במשך 1000 איטרציות על הכיוון הנוכחי
      digitalWrite(motorPin, HIGH);
      delayMicroseconds(i);

      digitalWrite(motorPin, LOW);
      delayMicroseconds(i);
    }

  }
  
}
