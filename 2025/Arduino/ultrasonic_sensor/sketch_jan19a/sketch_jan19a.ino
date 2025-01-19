// Constants:
const int trigPin = 9;
const int echoPin = 10;
// Variables:
float duration; // variable to store time between sound pulses
float distance; // variable for calculating distance to obstacle


void setup() {
  // setup commands:
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  Serial.begin(9600);
}

void loop() {
  // Creating the output sound wave:
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);

  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);

  digitalWrite(trigPin, LOW);

  // Listening to echo:
  duration = pulseIn(echoPin, HIGH);

  // Calculating distance:
  distance = (duration * 0.0343) / 2;
  if (distance < 5.0) {
    Serial.println("Crash!");
  }
  else {
    Serial.println( "Distance: " + String(distance) );
  }

}
