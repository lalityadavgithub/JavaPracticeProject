package JavaProgramquiz;

public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int rev=0;

        int orgnum=num;

        while (num!=0){
            rev=rev*10+num%10;

            num=num/10;


        }
        System.out.println(rev);

        if(orgnum==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("not Palindrome");
        }
    }
}
