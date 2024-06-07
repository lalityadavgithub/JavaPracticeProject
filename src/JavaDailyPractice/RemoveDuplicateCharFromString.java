package JavaDailyPractice;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        // Remove duplicate charactor from a string
        String str="programmingp";

        //1. Using java 8
    /*    StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(c->sb.append((char)c));

        System.out.println(sb); */

        //2. Using IndexOf()

        StringBuilder sb2=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int idx=str.indexOf(ch,i+1);

            if (idx==-1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

    }
}
