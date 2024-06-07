package collections;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);

        System.out.println(al_dup);
        al_dup.removeAll(al);
        System.out.println("After removing :"+al_dup);
        System.out.println(al_dup.isEmpty());

        //Sort ---Collection.sort()
        System.out.println("Elements in the array list:"+al);

        System.out.println("After sorting:"+al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After sorting in reverse order:"+al);

        //Shuffling -Collections.suffle()
        Collections.shuffle(al);

        System.out.println("After suffling:"+al);

    }
}
