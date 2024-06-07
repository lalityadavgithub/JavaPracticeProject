package PracticeSet;

public class Ch14_String_Methods {
    public static void main(String[] args) {

//        String name=new String("LALIT");
//        System.out.println(name);
//
//        //Find the length of string
//        int value=name.length();
//        System.out.println(value);
//
//        String lstring=name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring=name.toUpperCase();
//        System.out.println(ustring);

// Trim method
//        String nonTrimmedString="     Lalit     ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString=nonTrimmedString.trim();
//        System.out.println(trimmedString);

        //Substring method
//        String myString="LalitYadav";
//        System.out.println(myString.substring(2)); //String print from index 2
//
//        System.out.println(myString.substring(2,5)); //String print from index 2 to 5

   // Replace method

//        System.out.println(myString.replace('L','K'));
//        System.out.println(myString.replace("Lalit","Kumar"));
//
//        System.out.println(myString.startsWith("Lalit"));
//        System.out.println(myString.endsWith("Yadav"));

// indexOf method
//        System.out.println(myString.charAt(3));
//
//        System.out.println(myString.indexOf("Yadav"));
//        System.out.println(myString.indexOf("Y",6));
//
//        //lastIndexOf method
//        System.out.println(myString.lastIndexOf("a"));
//        System.out.println(myString.lastIndexOf("a",5));

        //equals method

        String str="Automation";
        System.out.println(str.equals("Automation"));
        System.out.println(str.equals("automation"));
        System.out.println(str.charAt(5));
        System.out.println(str.equalsIgnoreCase("Automation"));

        //Escape sequence character
        System.out.println("I am Lalit Yadav \" I am a Software Engineer");

    }
}
