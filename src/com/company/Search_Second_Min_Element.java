package com.company;

public class Search_Second_Min_Element {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 11, 53, 16, 24, 57, 42, 74, 55, 36, 14};

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            } else if (array[i] < min2 && array[i] != min) {
                min2 = array[i];
            }
        }

        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Второй по минимальности элемент в массиве: " + min2);
        } else {
            System.out.println("Второго по минимальности элемента нет");
            System.out.println("--------------------------------------");
        }

        System.out.println("Минимальный элемент в массиве: " + min);
        System.out.println("--------------------------------------");
        main2();
    }

    //-----------------------------------Второй вариант---------------------------//

        public static void main2(){
            int[] array2 = new int[]{1, 1, 1, 1, 1, 1};

            int min3 = Integer.MAX_VALUE;
            int min4 = Integer.MAX_VALUE;

            for (int i = 0; i < array2.length; i++) {
                if (array2[i] < min3) {
                    min4 = min3;
                    min3 = array2[i];
                } else if (array2[i] < min4 && array2[i] != min3) {
                    min4 = array2[i];
                }
            }

            if (min4 != Integer.MAX_VALUE) {
                System.out.println("Второй по минимальности элемент в массиве: " + min4);
            } else {
                System.out.println("Второго по минимальности элемента нет");
            }

            System.out.println("Минимальный элемент в массиве: " + min3);
        }
}
