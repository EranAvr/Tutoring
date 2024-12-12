package MoedC;

import java.util.Scanner;
/*
*   Setters and Getters
*/
class User{
    String password;
    String email;

    public String getPassword(){
        return password;
    }
    public void setPassword(String newPassword){
        if (newPassword.length() >= 8){ // אם תקין
            this.password = newPassword;
        }
        else {  // אם לא תקין
            this.password = "";
        }
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        for (int i=0; i<newEmail.length(); i++){
            if (newEmail.charAt(i) == '@'){ // if valid
                email = newEmail;
                return;
            }
        }
        this.email = "";    // if invalid
    }

}


public class Ex161024_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        User user = new User();
        user.email = "aaa";
        user.password = "111";
        System.out.println(user.email + " " + user.password);

        User u1 = new User();
        u1.setPassword("1234567");  // לא תקין
        u1.setEmail("aaa@");    // תקין
        System.out.println(u1.getEmail() + " " + u1.getPassword());
        if ( u1.getPassword().equals("") ){
            System.out.println("Password lo takin");
        }
    }
}
