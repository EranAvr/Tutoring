// Global variables:
const int trigPin = 9;
const int echoPin = 10;
float duration=0, distance=0;

void setup() {
  // Program setup settings:
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  Serial.begin(9600);
}

void loop() {
  // Transmiting (sending out) a sonic wave:
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);

  // Using built-in function 'pulseIn()' to detect
  // the returning echo:
  // pulseIn() will measure time between transmiting sound
  // and receiving echo, and will return the value in micro-seconds.
  duration = pulseIn(echoPin, HIGH);

  // Simple math to calculate distance:
  // Distance = Time * Time
  distance = (duration * 0.0343) / 2;

  // Printing result to Serial Monitor:
  Serial.println("Distance is: " + String(distance));
}
