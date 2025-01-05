int buzzerPin = 2;
int button1 = 4;


// my functions:
void highPitch() {
  digitalWrite(buzzerPin, HIGH);
  delayMicroseconds(100);
  digitalWrite(buzzerPin, LOW);
  delayMicroseconds(100);
}
void middlePitch() {
  digitalWrite(buzzerPin, HIGH);
  delayMicroseconds(200);
  digitalWrite(buzzerPin, LOW);
  delayMicroseconds(200);
}
void lowPitch() {
  digitalWrite(buzzerPin, HIGH);
  delayMicroseconds(250);
  digitalWrite(buzzerPin, LOW);
  delayMicroseconds(250);
}


// Arduino functions:
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(buzzerPin, OUTPUT);
  pinMode(button1, INPUT_PULLUP); // INPUT_PULLUP uses an internal resistor, BUT invert HIGH and LOW
}

void loop() {
  // control variables:
  int count = 0;
  int iter = 100;
  int myDelay = 500;

  // input from buttons:
  int b1_value = digitalRead(button1);
  Serial.println(b1_value);

  if (b1_value == LOW){
    // output to buzzer:
    while (count < iter){
      highPitch();
      count++;
    }
    //delay(myDelay);

    count = 0;
    while (count < iter){
      middlePitch();
      count++;
    }
    //delay(myDelay);

    count = 0;
    while (count < iter){
      lowPitch();
      count++;
    }
    //delay(myDelay);
  }
  
}
