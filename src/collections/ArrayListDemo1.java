package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static <object> void main(String[] args) {


        //Declare ArrayList
        //ArrayList al=new ArrayList(); //store all type element(Heterogeneous)
        //ArrayList<Integer>al=new ArrayList<>(); // Store only integer type element (Homogeneous)
        //ArrayList<String>al=new ArrayList<>(); //Store only String type element (Homogeneous)
        //List al=new ArrayList<>(); //List is parent of ArrayList we can create object using List as well

        ArrayList al = new ArrayList();
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);
        //size()
        System.out.println("Number of elements in array list:"+al.size());
        //remove
        al.remove(1); //here 1 is index

        System.out.println("After removing element from array list:"+al);

        //insert a new element
        //add(index,object)
        al.add(2,"python");
        System.out.println("After insertion:"+al);

        //retreive specific element
        System.out.println(al.get(2)); //python, here 2 is index of element/object

        //change element /replace
        al.set(2,"C#");
        System.out.println("After replacing element:"+al);

        //search - contains() -Return true/false
        System.out.println(al.contains("C#")); //true
        System.out.println(al.contains("C++")); //false

        //isEmpty
        System.out.println(al.isEmpty());

        //read data from ArrayList
        //1.using for loop
        System.out.println("Reading element using for loop....");
        for (int i=0;i<=al.size()-1;i++){
            System.out.println(al.get(i));
        }
        //2.using for each loop
        System.out.println("reading element using for each loop");
        for(Object e:al){
            System.out.println(e);

        }
        System.out.println("Reading elements using iterator method");

        //3. using iterator
        Iterator it =al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }


    }
}
