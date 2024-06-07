package JavaPracticeProgram;

public class ReverseString {
    public static void main(String[] args) {

        //1-Using +(String concatenation) operator

        String str="ABCD";
        String rev="";
        int len=str.length();
        System.out.println(len);

        for(int i=len-1; i>=0; i--)
        {
            rev =rev+str.charAt(i);
        }
        System.out.println(rev);

        //2-Using charactor array

      /*  char a[]=str.toCharArray();
        int len=a.length;

        for(int i=len-1;i>=0;i--){
            rev=rev+a[i];

        }

        System.out.println(rev); */

        //3-Using String Buffer class

//        StringBuffer sb= new StringBuffer(str);
//        StringBuffer res=sb.reverse();
//        System.out.println(res);

    }
}
