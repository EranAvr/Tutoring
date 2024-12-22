/*
  This program uses two separate circuits,
  first one uses button to give us input and the second
  one uses leds as output.

  We use a 'counter' variable to count button pressings,
  and switch between the two leds.
*/

// Constants:
int buttonPin = 7;
int redLed = 2;
int blueLed = 3;

// Variables:
int counter = 0;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);

}

void loop() {
  // put your main code here, to run repeatedly:
  int value = digitalRead(buttonPin);

  if (value == HIGH){
    counter++;
    delay(200);
  }
  Serial.println(counter);
  
  if (counter % 2 == 0) {
    digitalWrite(redLed, HIGH);
    digitalWrite(blueLed, LOW);
  }
  else {
    digitalWrite(blueLed, HIGH);
    digitalWrite(redLed, LOW);
  }

}
