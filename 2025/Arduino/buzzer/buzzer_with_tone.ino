// constants:
#define NOTE_C5  523
#define NOTE_CS5 554
#define NOTE_D5  587
#define NOTE_DS5 622
#define NOTE_E5  659
#define NOTE_F5  698
#define NOTE_FS5 740
#define NOTE_G5  784
#define NOTE_GS5 831
#define NOTE_A5  880
#define NOTE_AS5 932
#define NOTE_B5  988
#define NOTE_C6  1047


// control variables:
int buzzerPin = 2;
int button1 = 4;


void setup() {
  pinMode(buzzerPin, OUTPUT);
  
}

void loop() {
  tone(buzzerPin, NOTE_C5);
  delay(500);
  noTone(buzzerPin);

  delay(1000);

  tone(buzzerPin, NOTE_D5);
  delay(500);
  noTone(buzzerPin);

  delay(1000);

}
