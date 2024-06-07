package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {
     //   Hashtable t=new Hashtable(); //Initial capacity is 11,load factor 0.75
     //   Hashtable t=new Hashtable(); //create hashtable object with some capacity

        //Hashtable t=new Hashtable(initial capacity,fill ratio/load factor);

        Hashtable<Integer,String> t=new Hashtable<Integer,String>();
        t.put(1,"test");
        t.put(2,"QA");
        t.put(3,"jk");
        t.put(4,"banner");
        t.put(5,"print");


        System.out.println(t);
       // t.put(null,"x");
//        t.put(6,null);
//        System.out.println(t);

        System.out.println(t.get(2));
        t.remove(4);
        System.out.println(t);

        System.out.println(t.containsKey(3)); //true
        System.out.println(t.containsKey(4)); //false

        System.out.println(t.containsValue("jk")); //true
        System.out.println(t.containsValue("m")); //false

        System.out.println(t.isEmpty());

        System.out.println(t.keySet());
        System.out.println(t.values());

        for (int k:t.keySet()){
            System.out.println(k+"  "+t.get(k));
        }
        System.out.println(t.entrySet());

        //Entry specific method
        for (Map.Entry entry:t.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        //Iterator
        Set s=t.entrySet();
        Iterator itr=s.iterator();
         while (itr.hasNext()){
             Map.Entry entry=(Map.Entry) itr.next();
             System.out.println(entry.getKey()+"  "+entry.getValue());
         }




    }
}
