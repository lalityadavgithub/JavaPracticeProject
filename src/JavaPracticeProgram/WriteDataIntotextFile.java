package JavaPracticeProgram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntotextFile {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("C:\\Users\\lalit.pmloyal\\Desktop\\TestTextFile.txt");
        BufferedWriter  bw=new BufferedWriter(fw);

        bw.write("Selenium with Java");
        bw.write("Selenium with python");

        bw.close();
    }
}
