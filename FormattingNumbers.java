import java.text.*;

public class FormattingNumbers {
      public static void main(String[] args) {
         //numberFormat is abstract - cant use new NumberFormat() 
        // NumberFormat currency = new NumberFormat();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(123456.891);

        System.out.println(currencyResult);

        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String percentageResult = percent.format(0.1);

        // System.out.println(percentageResult);


        //CHAINING METHODS to get the same result.
        String percentageResult= NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percentageResult);
    }
}
