const int a = 7;
const int b = 6;
const int c = 5;
const int d = 11;
const int e = 10;
const int f = 8;
const int g = 9;
const int dp = 4;



void clearDisplay(){
  for(int i=4; i<12; i++){
    digitalWrite(i, LOW);
  }
}

void digit0() {
  digitalWrite(a, HIGH);
  digitalWrite(b, HIGH);
  digitalWrite(c, HIGH);
  digitalWrite(d, HIGH);
  digitalWrite(e, HIGH);
  digitalWrite(f, HIGH);
}
void digit1() {
  digitalWrite(b, HIGH);
  digitalWrite(c, HIGH);
}
void digit2() {
  digitalWrite(a, HIGH);
  digitalWrite(b, HIGH);

  digitalWrite(g, HIGH);
  digitalWrite(e, HIGH);
  digitalWrite(d, HIGH);
}
void digit3() {
  digitalWrite(a, HIGH);
  digitalWrite(b, HIGH);
  digitalWrite(c, HIGH);
  digitalWrite(d, HIGH);
  digitalWrite(g, HIGH);
}
void digit4() {
  digitalWrite(f, HIGH);
  digitalWrite(b, HIGH);
  digitalWrite(g, HIGH);
  digitalWrite(c, HIGH);
}
void digit5() {
  digitalWrite(a, HIGH);
  digitalWrite(f, HIGH);
  digitalWrite(g, HIGH);
  digitalWrite(c, HIGH);
  digitalWrite(d, HIGH);
}
void digit6() {
  digitalWrite(a, HIGH);
  digitalWrite(f, HIGH);
  digitalWrite(g, HIGH);
  digitalWrite(c, HIGH);
  digitalWrite(d, HIGH);
  digitalWrite(e, HIGH);
}
void digit7() {
  digitalWrite(a, HIGH);
  digitalWrite(b, HIGH);
  digitalWrite(c, HIGH);
}
void digit8() {
  digitalWrite(a, HIGH);
  digitalWrite(b, HIGH);
  digitalWrite(g, HIGH);
  digitalWrite(c, HIGH);
  digitalWrite(d, HIGH);
  digitalWrite(e, HIGH);
  digitalWrite(f, HIGH);
}
void digit9() {
  digitalWrite(a, HIGH);
  digitalWrite(b, HIGH);
  digitalWrite(g, HIGH);
  digitalWrite(c, HIGH);
  digitalWrite(d, HIGH);
  digitalWrite(f, HIGH);
}

void autoProgram(int delayBetweenDigits){
  clearDisplay();
  digit0();
  delay(delayBetweenDigits);

  clearDisplay();
  digit1();
  delay(delayBetweenDigits);

  clearDisplay();
  digit2();
  delay(delayBetweenDigits);

  clearDisplay();
  digit3();
  delay(delayBetweenDigits);

  clearDisplay();
  digit4();
  delay(delayBetweenDigits);

  clearDisplay();
  digit5();
  delay(delayBetweenDigits);

  clearDisplay();
  digit6();
  delay(delayBetweenDigits);

  clearDisplay();
  digit7();
  delay(delayBetweenDigits);

  clearDisplay();
  digit8();
  delay(delayBetweenDigits);

  clearDisplay();
  digit9();
  delay(delayBetweenDigits);
}






void setup() {
  // put your setup code here, to run once:
  
  for(int i=4; i<12; i++){
    pinMode(i, OUTPUT);
  }
}

void loop() {
  // put your main code here, to run repeatedly:
  
  autoProgram(1000);

}
