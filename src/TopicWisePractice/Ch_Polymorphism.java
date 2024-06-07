package TopicWisePractice;

interface Myamera2{
    void takeSnap();
    void recordVideo();
}
interface  MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MycellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.. ");
    }

}

class MySmartPhone2 extends MycellPhone2 implements MyWifi2, Myamera2{
    public void takeSnap(){

        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    public String[] getNetworks(){

        System.out.println("Getting List of Network");

        String[] networkList={"Lalit","Shiv","Yadav"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {

    }

    public void connectionToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Ch_Polymorphism {
    public static void main(String[] args) {

        Myamera2 cam=new MySmartPhone2(); //This is a smartphone but, use it as camera(we can only get camera property to access)
        cam.takeSnap();
        cam.recordVideo();

        MySmartPhone2  sm=new MySmartPhone2(); //This is a smartphone and use it as smartphone(we can access all property)
        sm.getNetworks();
        sm.takeSnap();
        sm.connectionToNetwork("Test");
        sm.callNumber(124);

    }
}
