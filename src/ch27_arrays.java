public class ch27_arrays {
    public static void main(String[] args) {
        //int[] marks={100,200,300,400,500};
       /* float marks[] = {10.1f,20.47f,3.4f,4.77f,5.66f};
        String [] students={"Tom","Jerry","Donald","Mickey"};
        System.out.println(marks.length);
        System.out.println(students[0]);
        */

        int[] marks={100,200,300,400,500};
      //  System.out.println(marks.length);

        //Displaying the Array (Naive way)
      /*  System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        */
        // Displaying the Array (for loop)

        System.out.println("Using for loop");
        for (int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("In reverse order");
        for (int i=marks.length-1;i>=0;i--)

        {
            System.out.println(marks[i]);
        }

        // Displaying the Array (for each loop)
        System.out.println("Using for each loop");
        for (int mark:marks){
            System.out.println(mark);
        }
    }
}
