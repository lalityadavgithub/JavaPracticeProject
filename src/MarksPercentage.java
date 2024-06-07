import java.util.Scanner;

public class MarksPercentage {

    public static void main(String[] args) {

        System.out.println("Calculating Marks Percentage");

        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Marks for Subject 1");
        float a=scr.nextFloat();
        System.out.println("Enter Marks for Subject 2");
        float b=scr.nextFloat();
        System.out.println("Enter Marks for Subject 3");
        float c=scr.nextFloat();
        System.out.println("Enter Marks for Subject 4");
        float d=scr.nextFloat();
        System.out.println("Enter Marks for Subject 5");
        float e=scr.nextFloat();
        float sum=a+b+c+d+e;
        float percentage=(sum/500)*100;
        System.out.println("Percentage of these numbers is: ");
        System.out.println(percentage);


    }
}
