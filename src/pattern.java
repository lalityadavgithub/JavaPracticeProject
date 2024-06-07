public class pattern {

    public static void main(String[] args) {

// Problem-1
//        int i, j;
//
//            for (i = 1; i <= 5; i++) {
//                for (j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

            // problem 2 -- sum of even number
//        int sum=0;
//        int n=3;
//        for(int i=0; i<n; i++){
//            sum=sum+(2*i);
//
//        }
//        System.out.println("Sum of first three even number is: ");
//        System.out.println(sum);

        // problem 3 --print table
//        int n=5;
//
//        for(int i=1; i<=10; i++){
//            System.out.printf("%d X %d=%d\n",n, i, n*i);
//        }

        //problem 4 --print table in reverse order

//        int n=5;
//
//        for(int i=10; i>=1; i--){
//            System.out.printf("%d X %d=%d\n",n, i, n*i);
//        }

        // problem 5

//        int n=5;
//
//        //3 factorial=3*2*1
//        int i=1;
//        int factorial=1;
//        while (i<=5){
//            factorial *=i;
//            i++;
//        }
//        System.out.println(factorial);

        //problem 6;
        int n=8;

        int sum=0;
        for(int i=1; i<=10; i++){
           // System.out.printf("%d X %d=%d\n",n, i, n*i);

            sum+=n*i;
        }
        System.out.println(sum);
        }
    }