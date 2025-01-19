/*
  ANALOG INPUT
*/
const int analogIn = A0;
const int ledPin = 2;

void setup() {
  // put your setup code here, to run once:
  pinMode(analogIn, INPUT);
  pinMode(ledPin, OUTPUT);
  Serial.begin(9600);

}

void loop() {
  // put your main code here, to run repeatedly:
  int analogSignal = analogRead(analogIn);
  Serial.println(analogSignal);

  int limit = 30;  // this should be calculated according to the analog signal we read (btween highest and lowest)
  if (analogSignal > limit){ // light, so resistence is low and electricity can flow
    digitalWrite(ledPin, LOW);
  }
  else {  // its dark outside, so resistnce is high
    digitalWrite(ledPin, HIGH);
  }

}
