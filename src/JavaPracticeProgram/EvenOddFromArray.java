package JavaPracticeProgram;

public class EvenOddFromArray {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6};

        System.out.println("Even number is: ");
     /*   for(int i=0; i<a.length;i++) {
            if (a[i]% 2 == 0)
                System.out.println(a[i]);
        } */
        //Enhanched for loop(for each loop)
        for(int value:a){
            if (value% 2 == 0)
                System.out.println(value);
        }

            System.out.println("Odd number is: ");

        for(int value:a){
            if (value% 2 != 0)
                System.out.println(value);
        }
        /*    for (int i=0;i<a.length;i++) {
                if (a[i]% 2 != 0)
                    System.out.println(a[i]); */

            }

        }


