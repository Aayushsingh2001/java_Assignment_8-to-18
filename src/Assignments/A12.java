package Assignments;
import java.util.Scanner;

public class A12 {
    Scanner sc;
    public void driver(){
        Q10();
    }

    public void Q1(){                 //Question 1 and Question 2
        sc=new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }

    public void Q3(){               //Question 3
        sc=new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
    public void Q4(){                 //Question 4
        sc= new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    public void Q5(){                        //Question 5
        sc= new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    public void Q6(){              //Question 6
        sc=new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public void Q7(){               //Question 7
        sc=new Scanner(System.in);
        System.out.println("Enter a number:"+sc);
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public void Q8(){                //Question 8
        sc=new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n=sc.nextInt();
        int a;
        for (int i=1;i<=n;i++){
            a=i*i;
            System.out.println("Square of "+i+"= "+a);
        }
    }

    public void Q9(){                 //Question 10
        sc=new Scanner(System.in);
        System.out.println("Enter a numbers: "+sc);
        int n=sc.nextInt();
        int a;
        for (int i=1;i<=n;i++){
            a=i*i*i;
            System.out.println("cube of "+i+"= "+a);
        }
    }

    public void Q10(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number: "+sc);
        int n = sc.nextInt();
        System.out.println("TABLE OF "+n+" is: ");
        int a;
        for (int i=1;i<=10;i++){
            a=n*i;
            System.out.println(n+" x "+i+" = "+a);
        }
    }
}

