package JavaPracticeProgram;

public class PrimeNumber {
    public static void main(String[] args) {

//        Natural Number >1
//        which has only 2 factors 1 and iteself
//                19=>1 and 19 =>prime number
//                28 =>1,2,4,7,14,28
        int num=3;
        int count=0;

        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                    count++;
                }
                if(count==2)
                {
                    System.out.println("It is prime Number");
                }
                else
                {
                    System.out.println("It is not prime number");
                }
            }


        else
        {
            System.out.println("Not Prime Number");

        }


    }
}
