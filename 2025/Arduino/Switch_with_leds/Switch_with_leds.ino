int switchIn1 = 7;
int switchIn2 = 6;
int switchIn3 = 5;
int switchIn4 = 4;


int ledGreen = 11;
int ledRed = 10;
int ledBlue = 9;
int ledYellow = 8;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  // Define switch pins:
  pinMode(switchIn1, INPUT_PULLUP);
  pinMode(switchIn2, INPUT_PULLUP);
  pinMode(switchIn3, INPUT_PULLUP);
  pinMode(switchIn4, INPUT_PULLUP);
  // Define led pins:
  pinMode(ledGreen, OUTPUT);
  pinMode(ledRed, OUTPUT);
  pinMode(ledBlue, OUTPUT);
  pinMode(ledYellow, OUTPUT);

}

void loop() {
  int s1 = digitalRead(switchIn1);
  int s2 = digitalRead(switchIn2);
  int s3 = digitalRead(switchIn3);
  int s4 = digitalRead(switchIn4);

  //Serial.println(s1);

  if (s1 == 0){
    // 0 means turn on
    digitalWrite(ledGreen, HIGH);
    digitalWrite(ledRed, LOW);
    digitalWrite(ledBlue, LOW);
    digitalWrite(ledYellow, LOW);
  }
  if (s2 == 0){
    // 0 means turn on
    digitalWrite(ledGreen, HIGH);
    digitalWrite(ledRed, HIGH);
    digitalWrite(ledBlue, LOW);
    digitalWrite(ledYellow, LOW);
  }
  if (s3 == 0){
    // 0 means turn on
    digitalWrite(ledGreen, HIGH);
    digitalWrite(ledRed, HIGH);
    digitalWrite(ledBlue, HIGH);
    digitalWrite(ledYellow, LOW);
  }
  if (s4 == 0){
    // 0 means turn on
    digitalWrite(ledGreen, HIGH);
    digitalWrite(ledRed, HIGH);
    digitalWrite(ledBlue, HIGH);
    digitalWrite(ledYellow, HIGH);
  }
  else {
    digitalWrite(ledGreen, LOW);
    digitalWrite(ledRed, LOW);
    digitalWrite(ledBlue, LOW);
    digitalWrite(ledYellow, LOW);
  }
  

}
