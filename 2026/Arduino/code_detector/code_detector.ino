/*
 *  Code Detector
 *  A code combination detector, using a DIP switch
 *  and state variables to remember last state of switches.
 *  The goal is to read only switches that lit up,
 *  hence we need to detect LOW-to-HIGH changes.
 */

const String GOOD_CODE = "1234";
String code = "";

const int switch1 = 2;
int prevS1 = LOW;
const int switch2 = 3;
int prevS2 = LOW;
const int switch3 = 4;
int prevS3 = LOW;
const int switch4 = 5;
int prevS4 = LOW;

void setup() {
  Serial.begin(9600);
  pinMode(switch1, INPUT_PULLUP);
  pinMode(switch2, INPUT_PULLUP);
  pinMode(switch3, INPUT_PULLUP);
  pinMode(switch4, INPUT_PULLUP);
}
void loop() {
  int val1 = !digitalRead(switch1);
  if(val1 == HIGH && prevS1 == LOW){
    Serial.println("s1 on");
    code += "1";
    //Serial.println(code);
  }

  int val2 = !digitalRead(switch2);
  if(val2 == HIGH && prevS2 == LOW){
    Serial.println("s2 on");
    code += "2";
    //Serial.println(code);
  }

  int val3 = !digitalRead(switch3);
  if(val3 == HIGH && prevS3 == LOW){
    Serial.println("s3 on");
    code += "3";
    //Serial.println(code);
  }

  int val4 = !digitalRead(switch4);
  if(val4 == HIGH && prevS4 == LOW){
    Serial.println("s4 on");
    code += "4";
    //Serial.println(code);
  }

  if(code.length() == GOOD_CODE.length()){  // if enough digits were read
    if(code == GOOD_CODE){
      Serial.println("Code correct!");  // do something for correct code
    }
    else {
      Serial.println("Wrong! Start over..."); // do something for error
    }
    code = "";  // reset either way...
  }

  prevS1 = val1;
  prevS2 = val2;
  prevS3 = val3;
  prevS4 = val4;
}
