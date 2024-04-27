package Assignments;
import p1.Account;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class A16 {
    public void Driver(){
        ThickCircle c=new ThickCircle();
        c.setRadius(5);
        c.setThickness(2);
        System.out.println("Hollow Area: "+c.getHollowArea());
        System.out.println("Thickness Area: "+c.getThicknessArea());
    }
}
//Question 1
class Person1{
    private String name;
    private int age;
    protected void setName(String n){
        name=n;
    }
    protected void setAge(int a){
        age=a;
    }
    protected String getName(){
        return name;
    }
    protected int getAge(){
        return age;
    }
}
class Employee1 extends Person1{
    private double salary;
    public void inputEmployee(){
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Enter Name, Age and Salary of Employee");
        setName(sc.nextLine());
        setAge(sc.nextInt());
        salary=sc.nextDouble();
    }
    public void displayEmployee(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary: "+salary);
    }
}
//Question 2
class Customer1{
    private Account account;
    private String customerName;
    public Customer1(int acc, double initialBalance, String n){
        account=new Account();
        account.setAccountNumber(acc);
        account.setBalance(initialBalance);
        customerName=n;
    }
    public void deposit(double amt){
        account.setBalance(account.getBalance()+amt);
    }
    public void withdraw(double amt){
        if (account.getBalance()-amt>0)
            account.setBalance(account.getBalance()-amt);
        else
            System.out.println("Insufficient Balance");
    }
    public void checkBalance(){
        System.out.println("Name: "+customerName);
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Balance: "+account.getBalance());
    }
}
//Question 3
class User{
    private String name;
    private String mobile;
    public void setName(String n){
        name=n;
    }
    public void setMobile(String m){
        mobile=m;
    }
    public String getName(){
        return name;
    }
    public String getMobile(){
        return mobile;
    }
}
class Learner extends User{
    private int enrollmentNo;
    public void setEnrollmentNo(int Eno){
        enrollmentNo=Eno;
    }
    public int getEnrollmentNo(){
        return enrollmentNo;
    }
}
class Admin extends User{
    private int numberOfMembers;
    public void setNumberOfMembers(int totalLearner){
        numberOfMembers=totalLearner;
    }
    public int getNumberOfMembers(){
        return numberOfMembers;
    }
}
//Question 4
class Circle1{
    private int radius;
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class ThickCircle extends Circle1{
    private int thickness;
    public void setThickness(int t){
        thickness=t;
    }
    public int getThickness(){
        return thickness;
    }
    public double getThicknessArea(){
        return 3.14*(getRadius()+thickness)*(getRadius()+thickness)-getArea();
    }
    public double getHollowArea(){
        return getArea();
    }
}
// Question 5
class Contact{
    private String name;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
class DetailedContact extends Contact{
    private String email;
    private LocalDateTime DOB;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDOB() {
        return DOB;
    }

    public void setDOB(LocalDateTime DOB) {
        this.DOB = DOB;
    }
}