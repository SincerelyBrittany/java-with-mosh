public class TernaryOperator {
    public static void main(String[] args) {
        //VERSION 1

        // int income = 120_000;
        // String className;
        // if(income > 100_000)
        //     className = "First";
        // else 
        //     className = "Economy";
        // System.out.println(className);

        //VERSION 2

        // int income = 120_000;
        // String className = "Economy";
        // if(income > 100_000)
        //     className = "First";
        // System.out.println(className);


        //TERNARY VERSION

        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

        System.out.println(className);

    } 
}
