import java.util.Arrays;

public class LearningArrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); //prints the memory space
        System.out.println(Arrays.toString(numbers));

        //example 2

        int[] moreNumbers = {2, 4, 6, 8, 20};
        System.out.println(moreNumbers.length);
        Arrays.sort(moreNumbers);


    }
}

//Arrays have a fixed size - once you create cant add or remove 
//you have to use collection classes to add to an array - 
