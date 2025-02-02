#include <Servo.h>  // ייבוא ספריית קוד בשפת C

const int motorPin = 3;
const int poten = A0;
Servo myservo;  // ניצור משתנה מטיפוס Servo כדי לעבוד עם הפונקציות של הסיפרייה


void setup() {
  Serial.begin(9600);
  myservo.attach(motorPin);
}

void loop() {
  int value = analogRead(poten);  // נקרא ערך אנלוגי מהפוטנציומטר. טווח ערכים 0-1023
  int deg = map(value, 0, 1023, 0, 180);  // הפונ' המובנית map מתאימה ערכי קלט אל ערכי פלט
  /*
    הפונ' תקרא ערך מהמשתנה value
    הגדרנו לה שטווח הערכים של המשתנה הוא 0-1023
    הגדרנו לה להתאים את הטווח אל טווח חדש 0-180
  */
  Serial.println(deg);

  myservo.write(deg); // נכתוב אל המנוע את הזווית הרצויה
  
}
