// constants pin numbers:
const int buttonPin = 2;
const int ledPin = 8;

// variable to read button state:
int val = 0;

void setup() {
  // open serial communication for values test
  Serial.begin(9600);
  // setting input/output pins:
  pinMode(buttonPin, INPUT);
  pinMode(ledPin, OUTPUT);

}

void loop() {
  val = digitalRead(buttonPin);
  Serial.println(val);
  digitalWrite(ledPin, val);

}
