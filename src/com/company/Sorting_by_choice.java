package com.company;

public class Sorting_by_choice {

    public static void main(String[] args) {
        int[] array = new int[]{64, 52, 33, 76, 16, 65, 14, 124, 11, 22, 34};

        for (int step = 0; step < array.length; step++) {
            PrintArray(array);
            int index = min(array, step);
            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
        PrintArray(array);
    }

    private static int min(int[] array, int start) {//start - переменная с которой начинается сортировка. (Каждый раз смещается)
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void PrintArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}