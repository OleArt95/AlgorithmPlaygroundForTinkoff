package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 9, 8, 11, 13, 1, 3};

        Arrays.stream(array).forEach(System.out::println);
        int searchParam = 11;
        System.out.println(String.format("Искомый индекс элемента: %s = %s", searchParam, linearSearch(array, searchParam)));

//        for (int i : array) {
//            System.out.println(i);
//        }
    }

    private static int linearSearch(int[] array, int searchParam) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchParam) {
                return i;
            }
        }
//        return -1;
        throw new IllegalArgumentException(String.format("Не удалось найти индекс элемента: %s", searchParam));
    }
}
