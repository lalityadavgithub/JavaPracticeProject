package collections;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList l=new LinkedList();
        l.add(1);
        l.add("Test");
        l.add('P');
        l.add(2.54);

        System.out.println(l);
        LinkedList al=new LinkedList();
        al.addAll(l);
        System.out.println(al);

        al.addFirst("Id");
        al.addLast("Test");
        System.out.println(al);

        al.removeFirstOccurrence(al);
        
    }
}
