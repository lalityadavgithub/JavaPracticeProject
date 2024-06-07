import java.util.Scanner;

public class TakingInput_05 {

    public static void main(String[] args) {
        System.out.println("It works");

        Scanner scr=new Scanner(System.in);
//        System.out.println("Enter Number 1");
//        float a=scr.nextFloat();
//        System.out.println("Enter Number 2");
//        float b=scr.nextInt();
//        float sum=a+b;
//        System.out.println("Sum of these numbers is: ");
//        System.out.println(sum);
//        boolean b1=scr.hasNextInt();
//        System.out.println(b1);

        String str=scr.nextLine();
        System.out.println(str);
    }
}
