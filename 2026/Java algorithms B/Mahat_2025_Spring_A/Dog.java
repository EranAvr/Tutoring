package Mahat_2025_Spring_A;

public class Dog {
    private String name;
    private String type;
    private char gender;
    private int age;
    private boolean isImmuned;

    public Dog(String name, String type, char gender, int age, boolean isImmuned) {
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.isImmuned = isImmuned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isImmuned() {
        return isImmuned;
    }

    public void setImmuned(boolean immuned) {
        isImmuned = immuned;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isImmuned=" + isImmuned +
                '}';
    }

    // Methods:
    public boolean isItSuitable(char gender, int age){
        return this.gender == gender && this.age > 0 && this.age <= age;
    }

    public static void print(Dog[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isItSuitable('M', 2) && arr[i].isImmuned())
                System.out.println(arr[i].getName() + " " + arr[i].getType());
        }
    }

    public static int countNoAge(Dog[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isImmuned() && arr[i].getAge()==0)
                count++;
        }
        return count;
    }

    // סעיף שלי
    public static Dog[] something(Dog[] arr){
        int count = 0;
        for (Dog d : arr){
            if(d.getAge() == 0)
                count++;
        }

        Dog[] dogs = new Dog[count];

        int k = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i].getAge() == 0){
                dogs[k] = arr[i];
                k++;
            }
        }

        return dogs;
    }
}
