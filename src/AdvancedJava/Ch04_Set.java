package AdvancedJava;

import java.util.HashSet;

public class Ch04_Set {
    public static void main(String[] args) {

        HashSet<Integer>myHashset=new HashSet<>();

        myHashset.add(6);
        myHashset.add(8);
        myHashset.add(7);
        myHashset.add(2);
        myHashset.add(47);

        System.out.println(myHashset);

    }
}
