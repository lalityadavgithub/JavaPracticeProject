package TopicWisePractice;

interface Myamera{
    void takeSnap();
    void recordVideo();
}
interface  MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MycellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.. ");
    }

}

class MySmartPhone extends MycellPhone implements MyWifi, Myamera{
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

public class ch_DefaultMethod {
    public static void main(String[] args) {

        MySmartPhone ms =new MySmartPhone();
        String [] ar=ms.getNetworks();

        for(String item:ar){
            System.out.println(item);

        }

    }
}
