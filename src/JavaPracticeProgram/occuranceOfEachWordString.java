package JavaPracticeProgram;

public class occuranceOfEachWordString {
    public static void main(String[] args) {

        String str="Test manual Test Automation test";
        String[] words=str.split("\\s+");
        int[] count=new int[words.length];

        for (int i=0;i< words.length;i++){
            count[i]++;
            for (int j=i+1;j<words.length;j++){

                if (words[j].equals(words[i])){
                    count[i]++;
                    words[j]="";
                }
            }
        }
        System.out.println("count of words: ");
        for (int i=0;i< words.length;i++){
            if (words[i]!=""){
                System.out.println((words[i]+ ":"+ count[i]));
            }
        }
    }
}
