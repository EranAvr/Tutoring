package exercises;


public class Classes160524_Exercises {
    // TESTING
    public static void main(String[] args) {

        // Exercises:
        // Link: https://www.w3resource.com/java-exercises/oop/index.php


        // ex1:
        Person person1 = new Person("Bobby", 40);
        Person person2 = new Person("Alex", 25);
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());

        person1.setAge(41);
        System.out.println(person1.getName() + " " + person1.getAge());

        // ex3:
        Rectangle rect1 = new Rectangle(2, 4);
        Rectangle rect2 = new Rectangle(2.5, 4.5);
        System.out.println("Area: " + rect1.calcArea() + " Perimater: " + rect1.calcPerimeter());
        System.out.println("Area: " + rect2.calcArea() + " Perimater: " + rect2.calcPerimeter());


        // ex6:
        Employee employ1 = new Employee("Bobby", "Programmer", 150);
        Employee employ2 = new Employee("Alex", "Programmer", 200);
        System.out.println(employ1.getName() + " " + employ1.calcTotalSalary(10));
        System.out.println(employ2.getName() + " " + employ2.calcTotalSalary(10));


        // ex7:
    }
}

// CLASSES

// ex1:
class Person{
    private String name;
    private int age;

    public Person(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String _name){
        this.name = _name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int _age) {
        this.age = _age;
    }
}

// ex3:
class Rectangle{
    private double width;
    private double height;

    // getters and setters:
    public Rectangle(double _width, double _height){
        this.width = _width;
        this.height = _height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // methods:
    public double calcArea(){
        return width * height;
    }
    public double calcPerimeter(){
        return (2 * this.width) + (2 * this.height);
    }
}

// ex6:
class Employee{
    private String name;
    private String job;
    private double salary;

    public Employee(String _name, String _job, double _salary){
        this.name = _name;
        this.job = _job;
        this.salary = _salary;
    }

    // getters and setters:
    public String getName(){
        return name;
    }
    public void setName(String _name){
        this.name = _name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String _job) {
        this.job = _job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double _salary) {
        this.salary = _salary;
    }

    // methods:
    public double calcTotalSalary(int numOfDays){
        return this.salary * numOfDays;
    }
}

// ex7:
class Account{
    private String accountName;
    private int sumOfMoney;
    public Account(String _name){
        this.accountName = _name;
        this.sumOfMoney = 0;
    }

    public int getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(int sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }
}
class Bank{
    private Account[] accounts;

    public Bank(){
        this.accounts = new Account[10];
    }
}