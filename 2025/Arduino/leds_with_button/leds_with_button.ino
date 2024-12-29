int ledRed = 2;
int ledBlue = 3;
int ledYellow = 4;

int buttonPin = 13;
int counter = 0;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);

}

void loop() {
  // read button preesing into 'value' variable-
  int value = digitalRead(buttonPin);
  // count number of pressings-
  if (value == 1){
    counter++;
    delay(200); // delay program, to count 1 at a time
  }

  // Light up leds:
  if (counter % 3 == 0){
    digitalWrite(ledRed, HIGH);
    digitalWrite(ledBlue, LOW);
    digitalWrite(ledYellow, LOW);
  }
  if (counter % 3 == 1){
    digitalWrite(ledRed, LOW);
    digitalWrite(ledBlue, HIGH);
    digitalWrite(ledYellow, LOW);
  }
  if (counter % 3 == 2){
    digitalWrite(ledRed, LOW);
    digitalWrite(ledBlue, LOW);
    digitalWrite(ledYellow, HIGH);
  }


  Serial.println(counter);
}
