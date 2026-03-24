package ex240326;

public class User {
    // fields:
    private String username;
    private String password;
    private int age;
    private String role;

    // constructors:
    public User(){
        this.username = "";
        this.password = "";
        this.age = 0;
        this.role = "";
    }
    public User(String username, int age, String role){
        this.username = username;
        this.password = "";
        this.age = age;
        this.role = role;
    }

    // getters/setters
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        // זה המקום לבצע ולידציה על תקינות הסיסמא לפני קליטה סופית
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public boolean isLegal(){
        return this.age >= 18;
    }
    public boolean isAdmin(){
        return this.role.equals("admin");
    }

    public String toString(){
        return this.username + " | " +
                this.password + " | " +
                this.age + " | " +
                this.role;
    }
}
