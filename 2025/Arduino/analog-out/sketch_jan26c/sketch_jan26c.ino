/*
  Joystick simple reading
*/

const int yPin = A0;
const int xPin = A1;
const int buttonPin = 7;

void setup() {
  Serial.begin(9600);

  pinMode(yPin, INPUT);
  pinMode(xPin, INPUT);
  pinMode(buttonPin, INPUT);
}

void loop() {
  // read joystick values:
  int yValue = analogRead(yPin);
  int xValue = analogRead(xPin);
  int btnValue = digitalRead(buttonPin);

  // write to serial monitor:
  Serial.println("Y:" + String(yValue) );
  Serial.println("X:" + String(xValue) );
  Serial.println("Button:" + String(btnValue) );

  delay(200);

}
