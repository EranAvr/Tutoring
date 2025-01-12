void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  if (Serial.available() > 0) {
    //int numOfBytes = Serial.available();
    
    //int nextByte = Serial.read();
    //Serial.println(nextByte);

    char nextChar = Serial.read();
    Serial.print(nextChar);

    if (Serial.available() == 0){
      Serial.println();
    }
  }

}
