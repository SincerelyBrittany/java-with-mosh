public class IfStatements {
     public static void main(String[] args) {
         int temp = 32; 
         if (temp > 30){
           System.out.println("It is a hot day");
           System.out.println("Drink Water");
        } else if(temp > 20 && temp <= 30){
            System.out.println("beautiful day");
        }else{
            System.out.println("cold day");
        }
    }
}
