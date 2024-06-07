package PracticeSet;

public class Ch15_practiceSet {
    public static void main(String[] args) {

        // Problem 1: Write a Java program to convert a string to lowercase.
        String name=new String("Jack Parker");
        System.out.println(name.toLowerCase());

        // Problem 2: Write a Java program to replace spaces with underscores.
        String str="This is a string with spaces";
        System.out.println(str.replace(" ","_"));

        // Problem 3: Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear <|name|>, Thanks a lot!”
        // Replace <|name|> with a string (some name)
        String letter="Dear <|name|>, Thanks a lot!";
       String ltr= letter.replace("<|name|>", "Konda Reddy");
        System.out.println(ltr);

        // Problem 4: Write a Java program to detect double and triple spaces in a string.
        String myString="This string  contains double  and triple spaces";
        System.out.println(myString.indexOf("  "));

        // Problem 5: Write a program to format the following letter using escape sequence characters.
        // letter = “Dear Harry, This Java Course is nice. Thanks”

        String letter1="Dear Harry, This Java Course is nice. Thanks";
        System.out.println(letter1);
        String letter2="Dear Harry,\n This Java Course is nice.\n Thanks";
        System.out.println(letter2);



    }
}
