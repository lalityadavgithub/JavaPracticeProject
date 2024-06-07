package JavaPracticeProgram;

public class CountSumOfDigit {
    public static void main(String[] args) {

        int num=12345;
        int sum=0;

        while (num>0){ //1234

            sum=sum+num%10; //0+1234%10=0+4=4+3+2+1

            num=num/10; //1234/10=123,12,1,0
        }

        System.out.println(sum);
    }
}
