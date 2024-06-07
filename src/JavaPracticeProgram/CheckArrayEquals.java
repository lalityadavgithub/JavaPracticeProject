package JavaPracticeProgram;

import java.util.Arrays;

public class CheckArrayEquals {
    public static void main(String[] args) {

        int a1[]={1,2,3,4,5,6};
            int a2[]={1,2,3,4,5,6};

        //Approach 1

   /*     boolean status=Arrays.equals(a1,a2);
        if (status==true){
            System.out.println("Arrys are equal");
        }
        else {
            System.out.println("Arrya are not equal");
        } */

        //Approach 2

        boolean status=true;
        if(a1.length==a2.length){
            for (int i=0;i< args.length;i++){
                if ((a1[i]!=a2[i])){
                    status=false;
                }
            }

        }
        else {
            status=false;
        }

        if (status==true){
            System.out.println("Arrays are Equal");
        }
        else {
            System.out.println("arrays are not Equal");
        }
    }
}
