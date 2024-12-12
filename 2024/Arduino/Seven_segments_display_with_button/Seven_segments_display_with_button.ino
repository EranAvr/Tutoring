const int inButton = 2;
int counter = 0;
int value = 0;

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

void programWithButton(int counts){
  clearDisplay();
  counts = counts % 10;
  switch(counts){
    case 0:
      digit0();
      break;
    case 1:
      digit1();
      break;
    case 2:
      digit2();
      break;
    case 3:
      digit3();
      break;
    case 4:
      digit4();
      break;
    case 5:
      digit5();
      break;
    case 6:
      digit6();
      break;
    case 7:
      digit7();
      break;
    case 8:
      digit8();
      break;
    case 9:
      digit9();
      break;
  }
}


void setup() {
  // put your setup code here, to run once:
  
  for(int i=4; i<12; i++){
    pinMode(i, OUTPUT);
  }

  Serial.begin(9600);
  pinMode(inButton, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:

  value = digitalRead(inButton);
  delay(200);
  if(value == HIGH){
    counter++;
    programWithButton(counter);
  }
}
