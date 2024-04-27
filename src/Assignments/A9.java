package Assignments;

public class A9 {
    public void drive(){
        MarkSheet m=new MarkSheet();
        m.setPhysics(80);
        m.setMathematics(67);
        m.setChemistry(35);
        m.setHindi(87);
        m.setEnglish(85);
        System.out.println("Maximum Marks= "+m.maxMarks());
        System.out.println("Average marks= "+m.average());
        System.out.println("Is pass? "+m.isPass(34));
        /*
        Circle c=new Circle();
        c.setRadius(12.6);
        System.out.println("Radius= "+c.getRadius());
        System.out.println("Area= "+c.getArea());
        System.out.println("Circumference= "+c.getCircumference());  **/
    }
}

/* Define a class Circle with variable radius. Provide methods like, setRadius, getRadius, getArea, getCircumference.
* Use wrapper classes instead of primitives. */
class Circle{
    private Double radius;
    public Double getArea(){
        return 3.14*radius*radius;
    }
    public Double getCircumference(){
        return 3.14*radius;
    }
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}

/* 2. Define a class MarkSheet with properties to hold marks of five subjects(like physics, mathematics, chemistry,
 english and hindi). Provide setters and getters. Use wrapper classes instead of primitives.
   3. In question2 ,provide a method to find maximum marks.
   4. In question2, provide a method to find average of marks in all subjects.
   5. In question2, provide a method to find result as pass or fail. Passing marks is taken as argument. */
class MarkSheet{
    private Integer physics, mathematics, chemistry, hindi, english;
    public Boolean isPass(Integer passingMarks){    //Q5
        Boolean result=true;
        if (physics<passingMarks)
            result=false;
        if (mathematics<passingMarks)
            result=false;
        if (chemistry<passingMarks)
            result=false;
        if (hindi<passingMarks)
            result=false;
        if (english<passingMarks)
            result=false;
        return result;
    }
    public Double average(){    //Q4
        Double avg= (physics+mathematics+chemistry+hindi+english)/5.0;
        return avg;
    }
    public Integer maxMarks(){     //Q3
        Integer max=0;
        if (max<physics)
            max=physics;
        if (max<mathematics)
            max=mathematics;
        if (max<chemistry)
            max=chemistry;
        if (max<hindi)
            max=hindi;
        if (max<english)
            max=english;
        return max;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getHindi() {
        return hindi;
    }

    public void setHindi(Integer hindi) {
        this.hindi = hindi;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }
}
