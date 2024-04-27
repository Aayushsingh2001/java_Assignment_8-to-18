package Assignments;

public class A17 {
    public void Driver(){
        Coordinate p1=new Coordinate(2,3);
        System.out.println("Distance from origin: "+String.format("%.3f",p1.getDistance()));
        Coordinate p2= new Coordinate(4,-3);
        System.out.println("Distance between two points: "+p1.getDistance(p2));
    }

}
// Question 1
class Circle2{
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
class ThickCircle1 extends Circle2{
    private int thickness;
    public void setThickness(int t){
        thickness=t;
    }
    public int getThickness(){
        return thickness;
    }

    @Override
    public double getArea() {
        return 3.14*(getRadius()+thickness)*(getRadius()+thickness)-super.getArea();
    }
}

//Question 2
class Person2{
    private String name;
    private int age;
    public void setPerson(String n){
        name=n;
    }
    public void setPerson(int a){
        age=a;
    }
    public void setPerson(String n, int a){
        name=n;
        age=a;
    }
}

//Question 3
class Rectangle {
    int length, breadth;
    String borderColor;

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public void setBorderColor(String c) {
        borderColor = c;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public String getBorderColor(){
        return borderColor;
    }
    public void printRectangleColor() {
        System.out.println(borderColor);
    }
}
class FilledRectangleColor extends Rectangle{
    String fillColor;

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }
    public void printRectangleColor(){
        System.out.println("Filled Color: "+fillColor);
        super.printRectangleColor();
    }
}

// Question 4
class Coordinate {
    private int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance() {
        return java.lang.Math.sqrt(x*x+y*y);
    }

    public double getDistance(Coordinate p2) {
        return java.lang.Math.sqrt((x-p2.x)*(x-p2.x)+(y-p2.y)*(y-p2.y));
    }
}
//Question 5
class Person3{
    String name;
    int age;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void showName(){
        System.out.println("Name: "+name);
    }
    public void showName(String title){
        System.out.println(title+" "+name);
    }
}