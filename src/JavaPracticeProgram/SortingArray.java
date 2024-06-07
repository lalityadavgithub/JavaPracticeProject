package JavaPracticeProgram;

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {


        int a[]={8,9,6,5,4};
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if ( a[i]>a [j]){
                    temp=a[i];
                a[i]=a[j];
                a[j]=temp;


                }
            }

            System.out.print(a[i]+" ");
        }

        //        int a[]=new int[5];
//        int temp;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter the number");
//
//        for(int i=0;i<a.length;i++){
//            sc.nextInt();
//            for(int j=i+1; j<i;j++){
//
//                if(int[i]>int[j]){

    }
}
