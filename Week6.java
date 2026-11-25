import java.util.Arrays;

public class Week6 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 3, 5};

        for(int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] > numbers.length) {
                numbers[i] = numbers[i];
            } else if (numbers[i] < numbers[i + 1]) {
                numbers[i] *= 5; 
            }
        } 
        System.out.println(Arrays.toString(numbers));
    }
}
