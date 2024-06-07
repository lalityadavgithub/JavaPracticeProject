package JavaPracticeProgram;

public class RemoveJunk {
    public static void main(String[] args) {

        String s=".?'/theuol*/o@heymaths test";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

        String s1="@#@$%#&#&&Lalit!!@*/**";
        s1=s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}
