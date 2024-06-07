package JavaDailyPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) throws IOException {
        String str="test";
        String rev ="";

        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);



    }
}
