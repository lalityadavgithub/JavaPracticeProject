package JavaProgramquiz;

public class Pattern {
    public static void main(String[] args) {

        int n=4;
        //1
//        for(int i=4;i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

