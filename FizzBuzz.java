public class FizzBuzz {
     public static void main(String[] args) {

        //if number divisible by 5 === fizz
        //if divisible by 3 === buzz
        // if divisible by both == fizzbuzz
        // else return the number

        int num = 5;
        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("fizzbuzz");
        } else if (num % 5 == 0){
            System.out.println("fizz");
        } else if(num % 3 == 0){
            System.out.println("buzz");
        } else{
            System.out.println(num);
        }
        
    }
}
