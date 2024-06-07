package JavaPracticeProgram;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement {
    public static void main(String[] args) {

//        //Approach 1
//        int a[]={30,50,20,10,60};
//        System.out.println("Array Before Sorting: "+ Arrays.toString(a));
//        Arrays.parallelSort(a);
//
//        System.out.println("Array after Sorting: "+ Arrays.toString(a));

        //Approach 2
//        int a[]={30,50,20,10,60};
//        System.out.println("Array Before Sorting: "+ Arrays.toString(a));
//        Arrays.sort(a);
//
//        System.out.println("Array after Sorting: "+ Arrays.toString(a));

        //In Descending order
        Integer a[]={30,50,20,10,60};
        System.out.println("Array Before Sorting: "+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());

        System.out.println("Array after Sorting: "+ Arrays.toString(a));
    }
}
