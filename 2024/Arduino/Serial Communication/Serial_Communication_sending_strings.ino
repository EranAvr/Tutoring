/*
  This example code shows Serial-Communication.
  We use the Serial library to send text (as strings) from
  computer to Arduino-board, and then return it as text
  from board to computer.
*/

String inputBytes = "";

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  if(Serial.available() > 0) {
    inputBytes = Serial.readString();
  }
  Serial.println(inputBytes);
}
