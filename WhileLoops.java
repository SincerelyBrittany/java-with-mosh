 import java.util.Scanner;

public class WhileLoops {
        public static void main(String[] args) {
        int i = 5;
        while (i > 0){
            System.out.println("Hello, World.");
            i--;
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("quit")){
            System.out.print("Input:  ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        
    }
}
