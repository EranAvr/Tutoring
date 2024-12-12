// constants pin numbers:
const int buttonPin = 2;
const int ledPin = 8;

// variables to manage button state:
int val = 0;
int count = 0;

void setup() {
  // open serial communication for values test
  Serial.begin(9600);
  // setting input/output pins:
  pinMode(buttonPin, INPUT);
  pinMode(ledPin, OUTPUT);

}

void loop() {
  val = digitalRead(buttonPin);
  delay(200);
  if(val == HIGH){  // detect a single pushdown
    count++;
  }
  Serial.println(count);

  // turn led on/off according to button-press counting
  if(count % 2 == 0)
    digitalWrite(ledPin, LOW);
  else
    digitalWrite(ledPin, HIGH);
}
