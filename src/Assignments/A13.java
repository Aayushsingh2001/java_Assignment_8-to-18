package Assignments;

import java.util.Scanner;

public class A13 {
    Scanner sc;
    public void driver()
    {
        Q10();

    }

    public void Q1(){              //Question 1
        sc= new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n=sc.nextInt();
        if (n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

    public void Q2() {              //Question 2
        sc = new Scanner(System.in);
        System.out.println("Enter numbers: " + sc);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Greatest number is: "+(a>b?a>c?a:c:b>c?b:c));
    }

    public void Q3(){               //Question 3
        sc= new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n=sc.nextInt();
        int count=0;
        while (n!=0){
            n/=10;
            count++;
        }
        System.out.println("No. of digits= "+count);
    }

    public void Q4(){                //Question 4
        sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int x= sc.nextInt();
        int y=0,r;
        while (x!=0){
            r=x%10;
            y=10*y+r;
            x/=10;
        }
        System.out.println("Reverse no: "+y);
    }

    public void Q5(){
        sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int x=0, r;
        while (n!=0){
            r=n%10;
            x=1*x+r;
            n/=10;
        }
        System.out.println(" Addition of all numbers: "+x);
    }

    public void Q6(){
        sc= new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n=sc.nextInt();
        int x=0,r;
        for (int i=1;i<=n;i++){
            r=n%10;
            if (i%2!=0){
                System.out.print(i+" ");
              x=1*x+i;
            }
        }
        System.out.println();
        System.out.println("Addition of odd numbers: "+x);
    }

    public void Q7(){
        sc= new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n=sc.nextInt();
        int x=0,r;
        for (int i=1;i<=n;i++){
            r=n%10;
            if (i%2==0){
                System.out.print(i+" ");
                x=1*x+i;
            }
        }
        System.out.println();
        System.out.println("Addition of odd numbers: "+x);
    }

    public void Q8(){
        sc= new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n=sc.nextInt();
        int x,y=0;
        for (int i=1;i<=n;i++){
            x=i*i;
            System.out.println(i+"^2 = "+x);
            y=1*y+x;
        }
        System.out.println();
        System.out.println("Addition of even numbers: "+y);
    }

    public void Q9(){
        sc= new Scanner(System.in);
        System.out.println("Enter numbers: "+sc);
        int n=sc.nextInt();
        int x=0,r;
        while (n!=0){
            r=n%10;
            x=1*x+r;
            n/=10;
        }
        System.out.println("Sum of digits: "+x);
    }

    public void Q10(){
        sc= new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n=sc.nextInt();
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is: "+f);
    }
}
