package TopicWisePractice;

class Phone{

    public void greet(){
        System.out.println("Good Morning");
    }
    public void On(){
        System.out.println("Turning on Phone");

    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Namaste");
    }

    public void On(){
        System.out.println("Turning on SmartPhone");
    }
}
public class DynamicMethod_Dispatch {
    public static void main(String[] args) {

//        Phone obj=new Phone();
//        SmartPhone smobj=new  SmartPhone();
//        obj.name();

        Phone obj= new SmartPhone(); //Allowed
       // SmartPhone smpbj=new Phone(); //Not allowed
        obj.greet();
        obj.On();
    }
}
