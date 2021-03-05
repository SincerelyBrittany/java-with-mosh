public class LogicalOperators {
    public static void main(String[] args) {
        int temp = 12;

        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

      

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;

        System.out.println(isEligible);


    }
}
