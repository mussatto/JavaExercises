package mussatto.com.strings;

public class FizzBuzz {

    public static void fizBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if(i%3 ==0 && i % 5==0){
                System.out.println("FizzBuzz");
            }if(i % 3==0){
                System.out.println("Fizz");
            }else if(i % 5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.println(Integer.toString(i));
            }
        }
    }
}
