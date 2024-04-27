package Assignments;

public class A18 {
    public void Driver(){

    }
}

class A{    //Question 4
    int x;  // Instance variable in super class
    public void f2(){

    }
}
class B extends A{
    private int x;  // Instance variable in sub class
    public void f1(){
        int x=5;      //local variable
        System.out.println(x);  //print local variable
        System.out.println(this.x);  //print instance variable of class B sub class
        System.out.println(super.x);  //print instance variable of class A
    }
    public void f2(){
        super.f2();
    }
}

class Person5{       //Question 3
    private String name;
    private int age;
    public Person5(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person5(){
        this("Anonymous",25);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
class Employee2 extends Person5{
    private double salary;
    public Employee2(){
        this(10000.0);
    }
    public Employee2(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void showEmployee(){
        System.out.println(getName()+" "+getAge()+" "+getSalary());
    }
}
}

class Circle3{   //Question 2
    private float radius;
    private static final double PI;
    {
        radius=5;
    }
    static{
        PI=3.14;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public float getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
}
class Person4{       //Question 1
    private String name;
    private int age;
    public Person4(String name,int age){
        this.name=name;
        this.age=age;
    }
}
