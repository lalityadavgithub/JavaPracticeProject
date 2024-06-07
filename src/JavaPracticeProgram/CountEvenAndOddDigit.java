package JavaPracticeProgram;

public class CountEvenAndOddDigit {
    public static void main(String[] args) {
        int num=1234;
        int even_count=0;
        int odd_count=0;

        while (num>0){  //1234,123,12,1
            int rem=num%10; // >reminder rem=4,3,2,1
            if(rem%2==0){   //4%2>>reminder=0 ,1,0,1
                even_count++; //1+1
            }
            else {
                odd_count++;  //1+1
            }
            num=num/10; //1234/10 >>devidend num=123,12,1,0
        }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
