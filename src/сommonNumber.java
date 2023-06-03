import java.util.HashMap;

public class сommonNumber {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 4, 5};
        int[] array2 = {3, 3, 4};
        int[] array3 = {2, 3, 4, 5, 6};
        int num = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++)
                if (array1[i] == array2[j]) {
                    num = array1[i];
                }
        }
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == num) num = array3[i];
        }
        System.out.println(num);
    }
}
