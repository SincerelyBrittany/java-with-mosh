import java.util.Arrays;

public class MultiDimensionalArrays {
        public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        // numbers[1] = 2;
        System.out.println(Arrays.toString(numbers)); //prints the memory space
        System.out.println(Arrays.deepToString(numbers)); 

        int[][] secondNumbers = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(secondNumbers)); 

        //example 2

    }
}
