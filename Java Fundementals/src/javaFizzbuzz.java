import java.util.*;

public class javaFizzbuzz{
    public static void main(String[] args) {
        int[] array = new int[100];

       /* for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
            System.out.println(array[i]);
        }*/

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;

            int num = array[i];
            if ((num % 3 == 0) && (num % 5 == 0)){
                System.out.println(num + ": FizzBuzz");
            }else if(num % 3 == 0){
                System.out.println(num + ": Fizz");
            }else if(num % 5 == 0){
                System.out.println(num + ": Buzz");
            }else{
                System.out.println(num + ": " + num);
            }
        }
    //end of main
    }
}