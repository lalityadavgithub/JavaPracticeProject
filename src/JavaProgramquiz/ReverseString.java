package JavaProgramquiz;

public class ReverseString {
    public static void main(String[] args) {

        // reverse String
        String name="teet";
        String orgname=name;
        String rev="";
        int len=name.length();
        System.out.println(len);
        for (int i=len-1; i >= 0; i-- ){

            rev=rev+name.charAt(i);
        }
        System.out.println(rev);

        // check String is palindrome

        if (orgname.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }
}
