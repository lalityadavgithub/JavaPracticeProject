public class ch26_Array {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store the marks of 500 students
        You have 2 options:
        1. Create 500 variables
        2. Create an array
         */
//int[] marks={100,200,300,400,500};
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        marks[3] = 400;
        marks[4] = 500;
        System.out.println(marks[0]);

    }
}
