package PracticeSet;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Ch18_elseIf {
    public static void main(String[] args) {

        //int
        int age;
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch (age){

            case 18:
                System.out.println("You are adult");
                break;

            case 23:
                System.out.println("You are going to join job");
                break;

            case 60:
                System.out.println("You are senior citizen");

                break;

            default:
                System.out.println("Thanks for visit in our Website");

                //String
                String name="Lalit";

                switch (name){
                    case "Mohan":
                        System.out.println("You are big brother");
                        break;

                    case "Tejas":
                        System.out.println("You are Engineer");
                        break;

                    default:
                        System.out.println("Welcome to Noida");
                }
        }

//        if (age>65) {
//            System.out.println("You are experienced");
//        }
//            else if(age>50) {
//            System.out.println("You are semi-experienced");
//
//            }
//            else{
//                System.out.println("You are not experienced");
//
//            }
       }
    }

