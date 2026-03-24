package ex240326;

/*
    מחלקות: דוגמאות מילוליות

    User:
        - username: String
        - password: String
        - age: int
        - role: String  // "admin" or "user"

        + User()
        + User(username, age, role)
        + getters / setters
        + isLegal(): boolean    // האם המשתמש בגיל 18 ומעלה
        + isAdmin(): boolean    // האם המשתמש הוא מסוג admin
        + toString(): String
 */

/*
    DataBaseConnection:
        - type: String
        - connectionString: String
        - connected: boolean

        + DataBaseConnection(type, connectionString)  // בהתחלה לסמן כ"לא מחובר"
        + getters/setters   // רק עבור השדות הראשונים
        + isConnected() // מחזיר ערך נוכחי של connected
        + connect() // ביצוע התחברות
        + disconnect() // ביצוע התנתקות
        + makeQuery(query: String)
        + toString(): String
 */

/*
    Player:
        - nickname: String
        - team: char    // אות לועזית גדולה בלבד
        - playTime: int
        - life: int // ערכים בין 0 ל-100
        - weapon: String
        - ammo: int

        + Player(nickname, team)
        + Player(nickname, team, playTime, life)
        + getters/setters
        + attack() // הדפסת מחרוזת מתאימה
        + takeHit(damage: int) // הורדה מהחיים של השחקן
        + toString

*/
public class Main {
    public static void main(String[] args) {
    }
}
