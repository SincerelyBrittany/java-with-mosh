 import java.util.Scanner;

public class BreakContinue {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        // while(!input.equals("quit")){
        //     System.out.print("Input:  ");
        //     input = scanner.next().toLowerCase();
        //     if(!input.equals("quit"))
        //         System.out.println(input);
        // }

         while(!input.equals("quit")){
            System.out.print("Input:  ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
