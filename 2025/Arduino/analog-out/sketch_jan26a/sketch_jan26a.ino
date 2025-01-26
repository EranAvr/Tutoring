/*
  Creating PWM signals manually
*/

const int ledPin = 9;
const int DELAY = 500;
const float ON_PERIOD = 1.0;
const float OFF_PERIOD = 1.0 - ON_PERIOD;


void setup() {
  // put your setup code here, to run once:
  pinMode(ledPin, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(ledPin, HIGH);
  delayMicroseconds(DELAY * ON_PERIOD);
  digitalWrite(ledPin, LOW);
  delayMicroseconds(DELAY * OFF_PERIOD);
}
