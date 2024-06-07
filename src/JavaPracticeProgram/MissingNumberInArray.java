package JavaPracticeProgram;

public class MissingNumberInArray {
    public static void main(String[] args) {

        //Array should not  have duplicate
        //Array No need to be sorted
        // Values should be  in range

        int a[]={1,2,4,5};
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("Sum of present element in array: "+sum1);

        int sum2=0;
        for (int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("sum of all numbers b/w 1 to 5: "+sum2);

        int missnum=sum2-sum1;
        System.out.println("Missing number is: "+missnum);


    }
}
