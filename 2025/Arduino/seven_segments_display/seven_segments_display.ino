// Global variables:
int a = 0;
int b = 1;
int c = 2;
int d = 3;
int e = 4;
int f = 5;
int g = 6;

// Helper functions:
void resetDisplay(){
  // this function turn off all the led lights
  digitalWrite(a, LOW);
  digitalWrite(b, LOW);
  digitalWrite(c, LOW);
  digitalWrite(d, LOW);
  digitalWrite(e, LOW);
  digitalWrite(f, LOW);
  digitalWrite(g, LOW);
}
void digitOne(){
  // light up only 'b' and 'c' leds
  digitalWrite(b, HIGH);
  digitalWrite(c, HIGH);
}
void digitTwo(){
  digitalWrite(a, HIGH);
  digitalWrite(b, HIGH);
  digitalWrite(g, HIGH);
  digitalWrite(e, HIGH);
  digitalWrite(d, HIGH);
}



// Main functions:
void setup() {
  // put your setup code here, to run once:
  pinMode(a, OUTPUT);
  pinMode(b, OUTPUT);
  pinMode(c, OUTPUT);
  pinMode(d, OUTPUT);
  pinMode(e, OUTPUT);
  pinMode(f, OUTPUT);
  pinMode(g, OUTPUT);
}

void loop() {
  /*
    For each digit we do the same procedure:
    1. turn off all leds on the display
    2. turn on only the proper light
    3. wait for 1 second
  */
  
  resetDisplay();
  digitOne();
  delay(1000);

  resetDisplay();
  digitTwo();
  delay(1000);

}
