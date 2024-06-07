package JavaPracticeProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sortingArryaList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(7);
        list.add(5);

        System.out.println("Original_output- "+ list);

        Collections.sort(list); //Ascending order

        System.out.println("Ascending order- "+ list);

        Collections.sort(list,Collections.reverseOrder()); //Dscending order
        System.out.println("Dscending order- "+list);

    }
}
