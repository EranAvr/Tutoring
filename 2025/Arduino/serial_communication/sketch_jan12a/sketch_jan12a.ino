int counter = 0;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);

}

void loop() {
  // put your main code here, to run repeatedly:
  String str = String(counter) + ". All is good!";
  Serial.println(str);
  counter++;

}
