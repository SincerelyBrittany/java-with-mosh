import java.util.Scanner;
import java.text.*;

public class MortgageCalcPart2 {
     public static void main(String[] args) {
        final byte MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        Scanner scanner = new Scanner(System.in);


        while(true){
        System.out.println("Principal: ");
        principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1000000){
                break;
            } else{
                System.out.println("Ener a value greater than 1000 but less than 1000000");
            }
        }

        while(true){
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30){
               monthlyInterest = annualInterest/ PERCENT / MONTHS_IN_A_YEAR;
                break;
            }
            System.out.println("Please enter number between 1 and 30");
        }
        

        while(true){
            System.out.println("Period (Years:) ");
                int years = scanner.nextByte();
                if(years >= 1 && years <= 30){
                    numberOfPayments = years * MONTHS_IN_A_YEAR;
                    break;
                }
                System.out.println("Enter a value between 1 & 30 ");
        }
    

        double mortgage = principal 
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1)
        );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage" + mortgageFormatted);
    }
}
