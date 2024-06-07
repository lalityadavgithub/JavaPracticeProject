package PracticeSet;

public class greatestnumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //System.out.println(a);

        if (a > b && a > c) {
            System.out.println("a is greates");

        } else {
            if (b > a && b > c) {
                System.out.println("b is greates");

            } else {
                if (c > a && c > b) {

                    System.out.println("c is greates");
                }
            }
        }
    }}


