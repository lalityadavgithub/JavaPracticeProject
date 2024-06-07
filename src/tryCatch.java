public class tryCatch {

    public static void main(String[] args) {

        int a=6000;
        int b=0;
      //  int c=6000/0;

       // System.out.println(c);

        try {
            int c=6000/0;
            System.out.println(c);

        }catch ( Exception e){
            System.out.println(e);
        }

        System.out.println("Ok");
    }
}
