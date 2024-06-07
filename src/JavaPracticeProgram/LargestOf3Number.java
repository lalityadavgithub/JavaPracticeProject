package JavaPracticeProgram;

import java.util.Scanner;

public class LargestOf3Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=sc.nextInt();

        System.out.println("Enter the Second number");
        int b=sc.nextInt();

        System.out.println("Enter the Third number");
        int c=sc.nextInt();

        //Approach1-Logic

    /*    if(a>b &&a>c){
            System.out.println(a+" largest number");
        } else if (b>a && b>c) {
            System.out.println(b+" largest number");
        }else {
            System.out.println(c+" largest number");
        } */
// Ternary Operator

        int largest1=a>b?a:b; //largest of a & b
       int largest2=c>largest1?c:largest1; //largest of c & largest1

      //  int largest=c>(a>b?a:b)?c:(a>b?a:b); // combine above two line

        System.out.println(largest2+" is Largest Number");


    }
}
