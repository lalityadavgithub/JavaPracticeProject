package JavaDailyPractice;

public class day3 {
    public static void main(String[] args) {
        String str="Testing test";
        String [] words=str.split(" ");
        String rev="";

        for (int i=0;i< words.length;i++){
            String revword=words[i];
            String rev1="";
            for (int j=revword.length()-1;j>=0;j--){
                rev1=rev1+revword.charAt(j);
            }
            rev=rev+rev1+" ";

        }
        System.out.println(rev);




    }
}
