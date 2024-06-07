package JavaPracticeProgram;

import java.util.Random;

public class GenerateRandomNumbersAndString {
    public static void main(String[] args) {

        //Approach 1
       Random ram=new Random();
        int ram_int=ram.nextInt(10);
        System.out.println(ram_int);


    /*    double ram_db=ram.nextDouble();
        System.out.println(ram_db); */

        //Approach 2 -Math
        System.out.println(Math.random());

        //Approach 3


    }
}
