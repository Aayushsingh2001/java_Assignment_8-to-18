package Assignments;

public class A14 {
    public void driver(){
        /*person p1= new person();
        p1.setName("Aayush Singh");
        p1.setAge(23);
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());        **/

        Box b=new Box();
        b.setLength(8);
        b.setBreadth(6);
        b.setHeight(4);
        b.calculateVolume();
        b.calculateArea();
        System.out.println("Volume= "+b.volume);
        System.out.println("Area= "+b.surfaceArea);
    }

    class person{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    class A1{              //Question 2
        B1 a=new B1();
        B2 b=new B2();
    }

    class B1{
        public void f1(){
         System.out.println("This is the class B1 function.");
        }
    }

    class B2{
        public void f2(){
            System.out.println("This is the class B2 function.");
        }
    }

    class Box{                              //Question 2
        private int length, breadth, height;
        protected int volume, surfaceArea;

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getBreadth() {
            return breadth;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void calculateVolume(){
            volume = length*breadth*height;
        }
        public void calculateArea(){
            surfaceArea=2*(length*breadth+breadth*height+length*height);
        }
    }
}
