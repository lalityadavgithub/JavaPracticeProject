package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {


      //  HashMap m = new HashMap();

        HashMap<Integer,String>m=new HashMap<>();
        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Scott");
        m.put(104,"Marry");
        m.put(105,"Tye");
        m.put(103,"x"); //here key 103 reapted,in output key 103="x" will be same but value will update with new value
        m.put(106,"David");

        System.out.println(m);

        System.out.println(m.get(105));

        m.remove(106); //remove pair from hashmap
        System.out.println(m);

        System.out.println(m.containsKey(101)); //true
        System.out.println(m.containsKey(106)); //false

        System.out.println(m.containsValue("David")); //true
        System.out.println(m.containsValue("test")); //value

        System.out.println(m.isEmpty()); //false

        System.out.println(m.keySet());  //return all the keys as set [101, 102, 103, 104, 105]

        for(Object i:m.keySet()){
            System.out.println(i);
        }

       // System.out.println(m.values()); //return all the values as Collection [John, David, x, Marry, Tye]
        for(Object i:m.values()){
            System.out.println(i);
        }
        //HashMap method
        for (Object i:m.keySet()){
            System.out.println(i+"   "+m.get(i));
        }
        //System.out.println(m.entrySet()); //return all the entries as set [101=John, 102=David, 103=x, 104=Marry, 105=Tye]

        //Entry Method
        for (Map.Entry entry:m.entrySet()){  //101 John
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        //Iterator()
        Set s=m.entrySet();

        Iterator itr=s.iterator();
        while (itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
