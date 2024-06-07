package JavaDailyPractice;

public class TypesOfVariable {

    static int b=20; //static variable
    int c=30; //intance varible becase it's decared over the all method and under the class

    public static void main(String[] args) {
        int a=10; //Local variable
        System.out.println(a);
        System.out.println(TypesOfVariable.b);

        TypesOfVariable ref=new TypesOfVariable();
        System.out.println(ref.c);
       // System.out.println(c);
    }
}
