package JavaPracticeProgram;

public class PalindromeString {
    public static void main(String[] args) {

        String str="Welcome";
        String org_str=str;
        String rev="";

        int len=str.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(org_str.equals(rev)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }
}
