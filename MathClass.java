public class MathClass {
     public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int ceilResult = (int)Math.ceil(1.1F);
        System.out.println(ceilResult);

        int floorResult = (int)Math.ceil(1.1F);
        System.out.println(floorResult);

        int maxResult = (int)Math.max(2,5);
        System.out.println(maxResult);

        int minResult = (int)Math.min(2,5);
        System.out.println(minResult);

        double randomResult = Math.random();
        System.out.println(randomResult);

        double randomResult2 = Math.random() * 100;
        System.out.println(randomResult2);

        double randomResult3 = Math.round(Math.random() * 100);
        System.out.println(randomResult3);

        int randomResult4 = (int)Math.round(Math.random() * 100);
        System.out.println(randomResult4);

        int randomResult5 = (int) (Math.random() * 100);
        System.out.println(randomResult5);
        
    }
}
