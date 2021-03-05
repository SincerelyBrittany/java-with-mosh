
import java.util.Scanner;
public class ReadingInput {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age:? " );
        byte age = scanner.nextByte();
        // float age = scanner.nextFloat();
        String stringAge = scanner.nextLine().trim();
        // are you reading from terminal windoe with scanner (scanner.in)
        System.out.println("You are" + age);
        System.out.println("You are" + stringAge);
    }
    
}
