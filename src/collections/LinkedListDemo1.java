package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        //Declare Linked List
//        LinkedList <Integer>l=new LinkedList<>();
//        LinkedList<String>l1=new LinkedList<>();

        LinkedList l=new LinkedList();

        //Add elements into linked list
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);
        System.out.println(l.size());

        //remove
        l.remove(3);
        System.out.println("After removing , new list:"+l);

        //Insert/adding element in the middle of linked list
        l.add(3,"java");
        System.out.println("After inserting element:"+l);

        //retriving value/object

        System.out.println(l.get(3));

        //change the value
        l.set(5, "x");
        System.out.println("After changing the value:"+ l);

        // contains()
        System.out.println(l.contains("java"));
        System.out.println(l.contains("python"));

        //isEmpty()
        System.out.println(l.isEmpty());

        //Reading elements from LinkedList using for loop
      /*  for (int i=0;i<=l.size()-1;i++){
            System.out.println(l.get(i));
        }*/

        //Reading elements from LinkedList using for-each loop
     /*   for (Object e:l){
            System.out.println(e);
        }
        */
        //Interator() method
        Iterator it=l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
