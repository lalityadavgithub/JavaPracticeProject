package JavaPracticeProgram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {


      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt(); */

        //1. Using Algorithm
        int num=1234;
        int rev=0;

        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println(rev);

        //2. Using String Buffer class

     /*   StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev= sb.reverse();

        System.out.println(rev); */

        //3. Using String Builder Class

     /*   StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev); */

    }
}
