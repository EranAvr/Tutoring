/*
  This example code shows simple Serial-Communication.
  We use the Serial library's functions to send ASCII values from
  computer to Arduino-board, and then return it as ASCII
  from board to computer.

  Notice! the print/println functions can work in varying ways.
  By receiveing int-type they will send Decimal values (according to ASCII table),
  by receiveing char-type they will send matching ASCII characters.
*/

char inputByte = 0;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);

}

void loop() {
  // put your main code here, to run repeatedly:
  if(Serial.available() > 0) {
    inputByte = Serial.read();
  }
  Serial.println(inputByte);
}
