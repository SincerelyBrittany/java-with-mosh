public class Casting {
      public static void main(String[] args) {
          //one of the values should be converted to the other type so that they are equal
        short x = 1; // a short variable has - 2 bytes
        int y = x + 2; // a integer variable has - 4 bytes

        //any values that you store in a short variable can also be stored in an integer variable
        //first java looks at value of x, then allocate another variable in memory (int)
        //then it will add 

        //implicit casting -- automatic conversion
        //byte > short > int > long > float > double
        System.out.println(y);



        /// dealing with a double and an integer 
        double a = 1.1;
        // int b = a + 2;
        double b = a + 2;
        System.out.println(b);

        // explicit casting

        double l = 1.1;
        // int b = a + 2;
        int m = (int)l + 2;
        System.out.println(m);

    }
}
