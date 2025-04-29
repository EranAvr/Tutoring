import MyClasses.Student;

public class Ex290425 {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("student1=" + student1);

        Student student2 = new Student();
        System.out.println("student2=" + student2);

        student1.setName("Bobby");
        student2.setName("James");
    }
}
