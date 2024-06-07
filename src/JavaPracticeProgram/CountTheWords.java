package JavaPracticeProgram;

import java.util.Scanner;

public class CountTheWords {
    public static void main(String[] args) {

//        System.out.println("Enter the String");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine(); //Welcome to java
        String s="Qa Test QA";
   /*     int count = 1;

        for(int i=0;i<s.length()-1;i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in a string: "+ count); */

        String[] words=s.split(" ");
        int count=words.length;
        System.out.println("Number of words in a string: "+ count);
    }

}
