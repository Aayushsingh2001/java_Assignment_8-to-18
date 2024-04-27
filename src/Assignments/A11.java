package Assignments;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Math;

public class A11 {
     public void driver(){
         A11.printDate();
         A11.printTime();
         A11.printRandom();
         A11.calculateRoots(1,-5,6);
      }
     public static void printDate(){         //Question 1
         LocalDateTime now=LocalDateTime.now();
         DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yy");
         System.out.println(f.format(now));
     }
     public static void printTime(){         //Question 2
         LocalDateTime now=LocalDateTime.now();
         DateTimeFormatter f= DateTimeFormatter.ofPattern("hh:mm:ss");
         System.out.println(f.format(now));
     }
    public static void printRandom(){         //Question 3
        double d1=Math.random()*100+100;
        System.out.println((int)d1);
    }

    public static void calculateRoots(int a,int b, int c){      //Question 4
        double x1,x2;
        x1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("Root x1= "+x1+" Root x2= "+x2);
    }

    /* pakage P1;                         //Question 5
       import P2.B1;
       public class A1{
           public static void main(String[]args){
                B1.obj=new B1();
                obj.fb1();
          }
      }

    *  pakage P2;
       public class B1{
          public void fb1(){
          System.out.println("Hello");
          }
       }*/
}

