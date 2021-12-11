package com.company;

public class Minimum_value_in_array {

    public static void main(String[] args) {
        int[] array = new int[]{31, 22, 14, 16, 26, 11, 25, 77, 88};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i< array.length; i++){
            if (minValue > array[i]){
                minIndex = i;
                minValue = array[i];
            }
        }
        System.out.println("minIndex: " + minIndex);
        System.out.println("minValue: " + minValue);
    }
}
