package JavaPracticeProgram;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {

        //Approach-1 Using FileReader BufferReader

     /*   FileReader fr=new FileReader("C:\\Users\\lalit.pmloyal\\Desktop\\TestTextFile.txt");
        BufferedReader br=new BufferedReader(fr);

        String str;

        while((str =br.readLine())!=null){
            System.out.println(str);

        }
        br.close(); */

        //Approach 2:Using Scanner & File
        File file=new File("C:\\Users\\lalit.pmloyal\\Desktop\\TestTextFile.txt");
        Scanner sc=new Scanner(file);

        //loop Statement
    /*    while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        } */

        //Approach 3:
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
