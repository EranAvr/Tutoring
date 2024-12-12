
void setup() {
  Serial.begin(9600); // Set up serial communication
  pinMode(A0, INPUT); // Set pin mode to OUTPUT
}


void loop() {
  int reading = analogRead(A0);

  // Linear equation:
  int output = ((float)255)/1024 * reading; // move from input range to output range
  Serial.println("read = "+String(reading)+"\t write = "+String(output));
  analogWrite(3, output);
}
