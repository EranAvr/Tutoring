void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);

}

void loop() {
  // put your main code here, to run repeatedly:
  while (Serial.available() == 0) {/* Empty body. This will create an infinite loop!*/}
  String str = Serial.readString(); // read all bytes as a String.
  str.trim(); // This will cut off the '\n' character at the end of the string.


  Serial.println("----------");
  Serial.println(str);
  Serial.println("----------");

}
