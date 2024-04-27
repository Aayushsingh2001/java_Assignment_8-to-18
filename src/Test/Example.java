package Test;

class Chicken{
    private int eggNo;
    private boolean eggSetFlag=false;
    public synchronized void setEggNo(int i){
        while (eggSetFlag){
            try{wait();}catch (Exception e){}
        }
        eggNo=i;
        eggSetFlag=true;
        System.out.println("set egg no= "+eggNo);
        notify();
    }
    public synchronized int getEggNo(){
        while (!eggSetFlag){
            try{wait();}catch (Exception e){}
        }
        System.out.println("get egg no= "+eggNo);
        eggSetFlag=false;
        notify();
        return eggNo;
    }
}
class Producer implements Runnable{
    Chicken chick;
    public Producer(Chicken chick){
        this.chick=chick;
    }
    public void run(){
        int i=1;
        while (true){
            chick.setEggNo(i++);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class Consumer implements Runnable{
    Chicken chick;
    public Consumer(Chicken chick){
        this.chick=chick;
    }
    public void run(){
        int i;
        while(true) {
            i = chick.getEggNo();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
public class Example {
    public static void Driver2(){
        /*C obj1=new C();
        D obj2=new D();
        obj1.start();
        obj2.start();*/
        Chicken chick= new Chicken();
        Producer p= new Producer(chick);
        Consumer c=new Consumer(chick);
        Thread t1=new Thread(p,"Producer Thread");
        Thread t2=new Thread(c,"Consumer Thread");
        t1.start();
        t2.start();
    }
    public static void Driver1(){   //implementing thread using Runnable interface

        Thread t1=new Thread(new Runnable(){
            public void run(){
            for (int i=1;i<=10;i++){
                try{Thread.sleep(1000);}catch (Exception e){}
                System.out.println("i="+i+Thread.currentThread().getName());
            }}
        },"meri thread");
        Thread t2=new Thread(new Runnable(){
            public void run(){
            for (int j=1;j<=10;j++){
                try{Thread.sleep(2000);}catch (Exception e){}
                System.out.println("j="+j+Thread.currentThread().getName());
            }}
        },"teri thread");
        t1.start();
        t2.start();
    }
}
class C extends Thread{
    public void run(){
        f1();
    }
    public void f1(){
        for (int i=1;i<=10;i++)
            System.out.println("i="+i);
    }
}
class D extends Thread{
    public void run(){
        f2();
    }
    public void f2(){
        for (int j=1;j<=10;j++)
            System.out.println("j="+j);
    }
}
class B implements Runnable{
    public void run(){
        for (int j=1;j<=10;j++)
            System.out.println("j="+j);
    }

}