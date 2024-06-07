package AdvancedJava;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.add(6);
        dq.add(88);
        dq.add(45);
        dq.addFirst(55);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

    }
}
