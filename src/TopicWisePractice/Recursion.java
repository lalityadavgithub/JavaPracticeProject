package TopicWisePractice;

public class Recursion {

       //factorial(0)=1
        //factorial(n)=n*n-1 *....1
        //factorial(5)=5*4*3*2*1
        //factorial(n)=n* factorial(n-1)
        static int factorial(int n){
            if (n==0||n==1){
                return 1;
            }else {
                return n*factorial(n-1);
            }


        }
    public static void main(String[] args) {
            int x=4;
        System.out.println("Value of factorial x is: " + factorial(4));
    }


}
