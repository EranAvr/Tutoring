// constants pin numbers:
const int switchPin1 = 2;
const int ledPin1 = 8;

// variables to manage button state:
int val = 0;
int count = 0;

void setup() {
  // open serial communication for values test
  Serial.begin(9600);
  // setting input/output pins:
  pinMode(switchPin1, INPUT_PULLUP);
  pinMode(ledPin1, OUTPUT);

}

void loop() {
  val = digitalRead(switchPin1);
  Serial.println(val);
  digitalWrite(ledPin1, val == HIGH ? LOW : HIGH);
}
