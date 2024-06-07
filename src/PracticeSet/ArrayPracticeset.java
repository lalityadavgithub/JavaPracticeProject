package PracticeSet;

public class ArrayPracticeset {
    public static void main(String[] args) {

        //problem-1

      /*  float[]marks={10.22f,54.14f,88.7f,69.44f,78.14f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println(sum); */

        //problem-2
    /*    float[]marks={10.22f,54.14f,88.7f,69.44f,78.14f};
        float num=69.44f;
        boolean isInarray=false;
        for(float element:marks) {
            if (num == element) {
                isInarray = true;
                break;
            }
        }
            if(isInarray){
                System.out.println("This is present is array");
            }else {
                System.out.println("This is not present is array");
            } */

        //problem-3
      /*  float[]marks={10.22f,54.14f,88.7f,69.44f,78.14f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println(sum/marks.length); */

        //problem-4

     /*   int[][]mat1={{1,2,3},{5,6,8}};
        int[][]mat2={{9,2,8},{2,4,0}};

        int[][]result={{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++) { //row number of time
            for (int j = 0; j < mat2[i].length; j++) { //column number of time
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
               result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //printing ths element of 2-D array
            for(int i=0;i<mat1.length;i++){ //row number of time
                for (int j=0;j<mat2[i].length;j++) { //column number of time
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            System.out.println(""); */

        //problem-5

      /*  int [] arr={1,2,3,4,5,6};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        System.out.println(n);
        int temp;

        for(int i=0; i<n;i++){
            temp=arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1]=temp;

        }
        for (int element:arr){
            System.out.print(element  +" "); */

        //problem-6
   /*     int[] arr={1,10,2,87,30};
        int max=0;

        for (int element:arr){
            if (element>max){
                max=element;
            }

        }
        System.out.println("The value of the maximum element in this array is: "+max); */

        //problem-7
        int[] arr={1,2,3,4,5};
        boolean isSorted=true;
            for (int i=0;i<arr.length-1;i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
                if (isSorted){
                    System.out.println("Array is sorted");
                }else{
                    System.out.println("Array is not sorted");
                }
            }

    }



