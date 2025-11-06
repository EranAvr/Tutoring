const int redLed = 2;
const int yellowLed = 3;
const int greenLed = 4;


void setup() {
  // put your setup code here, to run once:
  pinMode(redLed, OUTPUT);
  pinMode(yellowLed, OUTPUT);
  pinMode(greenLed, OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(redLed, HIGH);
  delay(500);

  digitalWrite(redLed, LOW);
  digitalWrite(yellowLed, HIGH);
  delay(500);

  digitalWrite(yellowLed, LOW);
  digitalWrite(greenLed, HIGH);
  delay(500);

  digitalWrite(greenLed, LOW);
  delay(500);
}
