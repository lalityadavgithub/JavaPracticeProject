package JavaPracticeProgram;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutDuplicateChar {
    public static void main(String[] args) {
        String str="testing";
        Map<Character, Integer>charMap=new HashMap<>();
        String longestOverall="";
        String longestTillNow="";

        char[] charArray=str.toCharArray();
        for(char c:charArray) {
            if (charMap.containsKey(c)){
                longestTillNow="";
                charMap.clear();
            }
            charMap.get(c);
            longestTillNow+=c;
            if(longestTillNow.length()>longestOverall.length()){
                longestOverall=longestTillNow;
            }

        }
        System.out.println(longestTillNow);
    }
}
