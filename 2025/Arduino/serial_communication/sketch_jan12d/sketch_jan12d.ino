int redLed = 5;
int yellowLed = 6;
int greenLed = 7;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(redLed, OUTPUT);
  pinMode(yellowLed, OUTPUT);
  pinMode(greenLed, OUTPUT);
}

void loop() {
  // read text from Serial:
  while (Serial.available() == 0) {}
  String command = Serial.readString();
  command.trim();

  // do actions according to text:
  if (command == "red"){
    digitalWrite(redLed, HIGH);
  }
  else if (command == "yellow"){
    digitalWrite(yellowLed, HIGH);
  }
  else if (command == "green"){
    digitalWrite(greenLed, HIGH);
  }
  else {
    digitalWrite(redLed, LOW);
    digitalWrite(yellowLed, LOW);
    digitalWrite(greenLed, LOW);
  }

}
