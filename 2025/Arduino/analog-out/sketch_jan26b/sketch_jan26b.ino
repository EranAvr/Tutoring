const int ledPin = 9;
const int potenPin = A0;

void setup() {
  pinMode(ledPin, OUTPUT);
  pinMode(potenPin, INPUT);
}

void loop() {
  // analogRead give values in range 0-1023
  int value = analogRead(potenPin);
  
  // factor for fixing range is 0.24
  int out = value * 0.24;
  analogWrite(ledPin, out);
}