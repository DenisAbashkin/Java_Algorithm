package com.company.search;

public class Linear_Search {
    public static void main(String[] params){
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 66, 71, 22, 34, 55, 36, 16};

        System.out.println(arrayToString(array));

        System.out.println(searchLinear(array, 16));
    }

    private static int searchLinear(int[] array, int elementToFind) {
        for (int i =0; i <array.length; i++){
            System.out.println("searching at index: " + i +", value" + array[i]);
            if (array[i]==elementToFind){
                System.out.println("found at index: "+ i +", value " + array[i]);
                return i;
            }
        }
        System.out.println("not found: " + elementToFind);
        return -1;
    }


    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}


