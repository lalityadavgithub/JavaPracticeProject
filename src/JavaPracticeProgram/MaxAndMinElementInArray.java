package JavaPracticeProgram;

public class MaxAndMinElementInArray {
    public static void main(String[] args) {
        int a[]={50,60,30,47,88};
        int max=a[0];
        int min=a[0];

     /*   for(int i=1;i<a.length;i++){
            if (a[i]>max)
            {
                max=a[i];
            }

        }
        System.out.println("Maximum number is: "+max); */

        for(int i=1; i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum number is: "+min);
    }
}
