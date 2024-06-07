package JavaPracticeProgram;

public class CountCharctorOccurance {
    public static void main(String[] args) {


        String str = "Java Programming Java Opps";
//    int totalCount=str.length();
//    int totalCountAfterRemoving_a=str.replace("a","").length();
//
//    int count=totalCount-totalCountAfterRemoving_a;
//        System.out.println("Number of Occurance of a is: "+count);

        int totalCount=str.length();
        int  totalcountAfterRemoving_a=str.replace("a","").length();

        int count=totalCount-totalcountAfterRemoving_a;
        System.out.println(count);
    }
}
