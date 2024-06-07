package JavaPracticeProgram;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swapping: a="+a+" b="+b);

        // Logic-1 >> Using Third Variable

       /* int t=a; // t=10;
        a=b;  // a=20
        b=t; // b=10
        System.out.println("After Swapping: a="+a+" b="+b); */

        // Logic-2 >> Using + & - without using third  varibale
      /*  a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20

        System.out.println("After Swapping: a="+a+" b="+b); */

        // Logic-3 Using * & / without using third variable
        // here a & b value should not be zero

     /*   a=a*b; //10*20=200
        b=a/b; //200/10=20
        a=a/b; //200/20=10

        System.out.println("After Swapping: a="+a+" b="+b); */

        // Logic-4 Using bitwise XOR (^)

    /*    a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After Swapping: a="+a+" b="+b); */

        //Logic-5 Using Single Statement
        b=a+b-(a=b);  // 10+20-(20)>>30-20=10
        a=a+b-(a=b);

        System.out.println("After Swapping: a="+a+" b="+b);








    }
}
