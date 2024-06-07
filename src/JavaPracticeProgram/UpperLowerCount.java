package JavaPracticeProgram;

public class UpperLowerCount {
    public static void main(String[] args) {

        String str="Testing XyZ Field";
        int lowerCount=0;
        int upperCount=0;

        for (int i=0;i<str.length()-1;i++){
            char c=str.charAt(i);
            if (Character.isUpperCase(c)){
                upperCount++;
            }else {
                lowerCount++;
            }
        }
        System.out.println("Upper count is:"+upperCount);
        System.out.println("Lower count is:"+lowerCount);
    }

}
