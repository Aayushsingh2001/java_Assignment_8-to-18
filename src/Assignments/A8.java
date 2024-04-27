package Assignments;
import java.time.LocalDateTime;

public class A8 {
    public void drive() {
        Box b=new Box();
        b.setDimension(12,23,42);
        b.showDimension();
        // SuperCar sc= SuperCar.getInstance();   //SuperCar for (Q2)

        /*Account a = new Account();
        a.setAccountNumber(680913232);
        a.setCustomerName("Aayush Singh");
        a.setBalance(535000);
        a.setRateOfInterest(13);
        System.out.println("Account No: " + a.getAccountNumber());
        System.out.println("Name: " + a.getCustomerName());
        System.out.println("Balance: " + a.getBalance());
        System.out.println("Simple Interest: " + a.getSimpleInterest(3));    */ //for class Account (Q1)
    }
}

/* 1. Define a class Account to represent a bank account. Create accountNumber, customerName,
balance as instance members and rateOfInterest as static variable.
 Provide member functions for the following operations.
 A. Set account number
 B. Set customer name
 C. Set balance
 D. Set rate of interest
 E. Calculate simple interest (take time as an argument)
 F. Get account number
 G. Get balance
 H. Get customer name  */
class Account{
    private int accountNumber;
    private String customerName;
    private double balance;
    private static float rateOfInterest;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }
    public double getSimpleInterest(int time){
        return balance*rateOfInterest*time/100;
    }
}

/* Define a class SuperCar to represent a super car of thr most powerful and richest person of the world.
This cas is specially designed and guaranteed to the only available super car of its kind in the world. Make
sure only one instance can be created of the Supercar. Create instance variables like ownerName, price, colour, brand.
 provide appropriate setters and getters. */
class SuperCar{
    private String ownerName;
    private double price;
    private String colour;
    private String brand;
    private SuperCar(){

    }
    private static SuperCar ref;
    public static SuperCar getInstance(){
        if(ref==null){
            ref=new SuperCar();
            return ref;
        }
        return null;
    }
}

/* Define a class Video to represent a video entity for a popular app like YouTube.
* Create member variable like videoId,title, views, likes and totalVideos.
* provide methods to set and get properties of video. */
class Video{
    private int videoId;
    private String title;
    private int views, likes, totalVideos;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int  getTotalVideos() {
        return totalVideos;
    }

    public void setTotalVideos(int totalVideos) {
        this.totalVideos = totalVideos;
    }
}

/* Define a class Batch for an educational institute with properties
batch code, course name, start date, student count, time,days and total number
of batches. Provide appropriate methods to access properties. */
class Batch {
    private int batchCode, studentCount;
    private String courseName, days;
    private LocalDateTime StartDate;
    private LocalDateTime time;
    private static int totalBatches;

    public int getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String fgetDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public LocalDateTime getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        StartDate = startDate;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public static int getTotalBatches() {
        return totalBatches;
    }

    public static void setTotalBatches(int totalBatches) {
        Batch.totalBatches = totalBatches;
    }
}

/* Define a class Box with length, breadth, height and box count as properties. Provide methods to
set dimensions and show dimensions. Also define a method to display box count. */
class Box{
    private int length, breadth, height;
    private static int boxCount;
    public void setDimension(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("Length= " +length);
        System.out.println("Breadth= "+breadth);
        System.out.println("Height= "+height);
    }
    public static void showBoxCount(){
        System.out.println("Box Count= "+boxCount);
    }
}