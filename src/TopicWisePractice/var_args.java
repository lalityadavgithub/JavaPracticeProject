package TopicWisePractice;

public class var_args {

//    static int sum(int a,int b){
//return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }

    static int sum(int ...arr){
        int result=0;

        for (int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To VarArgs Tutorials");
        System.out.println("The Sum of 4 & 5 is :" +sum(4,5));

        System.out.println("The Sum of 4 ,3 & 5 is :" +sum(4,3,5));

        System.out.println("The Sum of 2, 4 ,3 & 5 is :" +sum(2,4,3,5));
        System.out.println("The Sum of 1, 2, 4 ,3 & 5 is :" +sum(1,2,4,3,5));


    }
}
