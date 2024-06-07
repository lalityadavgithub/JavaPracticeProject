package AdvancedJava;

import java.util.ArrayList;

public class ch02_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>(5);
        l2.add(22);
        l2.add(54);
        l2.add(67);

        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(7);
        l1.add(9);
        l1.add(0,4);
        l1.add(0,3);

        l1.addAll(l2);
        System.out.println(l1.contains(0));
        System.out.println(l1.indexOf(6)); //indexing of output number
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.isEmpty());


        l1.set(1,566);

        for(int i=0; i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
