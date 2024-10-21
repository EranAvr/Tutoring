package MoedC;

class Student{
    // תכונות
    private String userName;
    private String ID;
    private String email;

    // בנאי
    public Student(String username, String id, String email){
        this.userName = username;
        this.ID = id;
        this.email = email;
    }

    // getters and setters:
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String username){
        this.userName = username;
    }

}

public class Ex211024_a {
    public static void main(String[] args) {
        // ex1
        // Write a class Student, with the following attributes:
        // userName, ID, email
        Student u = new Student("Hajar", "1", "haj@mail");
        Student u2 = new Student("Reuven", "2", "ruv @mail");

//        u.userName = "Hajar";
//        u2.userName = "Reuven";
        System.out.println(u.getUserName());
        System.out.println(u2.getUserName());

        u.setUserName("245");
        System.out.println(u.getUserName());
    }
}
