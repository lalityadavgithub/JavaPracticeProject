package TopicWisePractice;

interface Bicycle{
    int a=5;
    void applyBreak(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle {

    void blowHorn() {
        System.out.println("horn");
    }

    public void applyBreak(int decrement) {

        System.out.println("Apply Break");
    }

    public void speedup(int increment) {
        System.out.println("Apply SpeedUp");

    }
    public void blowHornK3g(){
        System.out.println("Automation Test Engineer");
    }
   public void blowHornmhn(){
        System.out.println("Write the COde for related module");
    }
}
public class ch_Interface {
    public static void main(String[] args) {
        AvonCycle av=new AvonCycle();
        av.applyBreak(1);
        //you can create  properties in Interfaces
        System.out.println(av.a);
        // you can not modify the properties in Interfaces as they are final
           // av.a=454;
      //  System.out.println(av.a);

        av.blowHornK3g();
        av.blowHornmhn();
    }

    }

