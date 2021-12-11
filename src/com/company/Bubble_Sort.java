package com.company;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = new int[]{31, 22, 14, 16, 26, 11, 25, 77, 88, 74};

        PrintArray(array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temporary = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temporary;
                    isSorted = false;
                }
            }
            PrintArray(array);
        }
    }

    private static void PrintArray (int[] arr){
        System.out.print("[");
        for (int i =0; i< arr.length; i++){
            if (i>0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}
