// constants pin numbers:
const int switchPin = 2;
const int ledPin = 8;

void setup() {
  // open serial communication for testing values:
  Serial.begin(9600);
  // setting input/output pins:
  pinMode(switchPin, INPUT_PULLUP);
  pinMode(ledPin, OUTPUT);
}

void loop() {
  int value = digitalRead(switchPin);
  Serial.println(value);

  //digitalWrite(ledPin, value == HIGH ? LOW : HIGH);  // the long way
  digitalWrite(ledPin, !value);  // the short way
}
