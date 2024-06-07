package PracticeSet;

abstract class Pen{
   abstract void write();
   abstract void refill();

        }
 class FountainPen extends Pen{
    void write(){
        System.out.println("Write");

    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Change the nib");

    }
 }
 class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("Bitting...");

    }
 }
 interface BasicAnimal{
    void eat();
    void sleep();
 }
 class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir");
    }

     @Override
     public void eat() {
         System.out.println("Eating");

     }

     @Override
     public void sleep() {
         System.out.println("Sleeping");

     }
 }


public class ch11_Psj {
    public static void main(String[] args) {
        //Q1+Q2
        FountainPen pen=new FountainPen();
        pen.changeNib();
        pen.refill();
        pen.write();

        //Q3
        Human harry=new Human();
        harry.eat();

        //Q5
        Monkey m1=new Human();
       // m1.speak(); ///Can not use speak method beacuse  the refrence is monkey which does not have speak method
        m1.bite();
        m1.jump();

        BasicAnimal ba=new Human();
       // ba.speak();//error
        ba.eat();
        ba.sleep();

    }
}
