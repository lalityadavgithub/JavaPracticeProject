package JavaPracticeProgram;

public class CountNumberOfDigits {
    public static void main(String[] args) {

        int num=123456;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        System.out.printf("Test");

        int num1 = 23;
        String formattedNum = String.format("%03d", num1);
        System.out.println(formattedNum);
    }
}
