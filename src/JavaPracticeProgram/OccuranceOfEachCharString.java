package JavaPracticeProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharString {

//    public static void getCharCount(String name){
//
//        Map<Character,Integer> charMap=new HashMap<>();
//
//        char strArray[]=name.toCharArray();
//        for (char c:strArray){
//            if(charMap.containsKey(c)){
//                charMap.put(c,charMap.get(c)+1);
//            }else {
//                charMap.put(c,1);
//            }
//        }
//        System.out.println(name +" : "+ charMap);
//    }

    public static void main(String[] args) {

        //test --> t=2,e=1,s=1
        //HashMap --><key,value> --> <Charactor, Inyteger>
//1. FIRST METHOD
//        getCharCount("Lalit Yadav");
//        getCharCount("testing java");
//        getCharCount("pick");

  /*      //2. SECOND METHOD
        String name="testt";
        Map<Character,Integer> charMap=new HashMap<>();

        char strArray[]=name.toCharArray();
        for (char c:strArray){
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else {
                charMap.put(c,1);
            }
        }
        System.out.println(name +" : "+ charMap);
    }*/


        // 3. third method without using function
       String str="programming";

        int[] count=new int[256];

        for (int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for (int i=0;i<256;i++){
            if (count[i]>0){
                System.out.println((char)i + " : " + count[i]);
            }
        }

    }

}
