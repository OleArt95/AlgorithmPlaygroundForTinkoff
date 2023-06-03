import java.util.Arrays;

public class bubbleSorting {

    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int x = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = x;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
