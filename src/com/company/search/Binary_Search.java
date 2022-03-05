package com.company.search;

public class Binary_Search {
    public static void main(String[] params){
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 66, 71, 22, 34, 55, 36, 16, 52};
        System.out.println(arrayToString(array));
        quickSort(array, 0, array.length-1);
        System.out.println("После быстрой сортировки: " + arrayToString(array));

        System.out.println(numberOfGames(7));
        System.out.println(searchBinary(array, 42));
    }

    public static int searchBinary(int[] array, int elementToFind){
        int startIndex = 0;
        int endIndex = array.length-1;
        int middleIndex;

        while (startIndex <= endIndex){
            middleIndex = startIndex +(endIndex - startIndex)/2;

            if(array[middleIndex] == elementToFind){
                return middleIndex;
            }

            if(array[middleIndex]>elementToFind){
                endIndex = middleIndex -1;
            }else {
                startIndex =middleIndex +1;
            }
        }
        return -1;
    }

    public static int searchBinaryRecursive(int array[], int startIndex, int endIndex, int elementToFind){
        if(endIndex>=startIndex){
            int middleIndex=startIndex + (endIndex - startIndex)/2;

            if (array[middleIndex]==elementToFind){
                return middleIndex;
            }
            if(array[middleIndex]>elementToFind){
                return searchBinaryRecursive(array,startIndex,middleIndex -1, elementToFind);
            } else {
                return searchBinaryRecursive(array,middleIndex +1, endIndex, elementToFind);
            }
        }
        return -1;
    }


    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);//Подмассив слева без индекса перегородки

            quickSort(arr, divideIndex, to);//Подмассив справа и элемент перегородки
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;//Идем (от) (From) по массиву

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {//Пока слева нет элемента больше перегородки
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {//Пока справа нет элемента меньше перегородки
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {//Поменять их
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


    public static int numberOfGames(int x) {
        x =3;
        int AllRound = 0;

       while (x>1){
            if ((x%2) == 0) {
                AllRound = AllRound + x/2;
                x = x / 2;
            }else {
                AllRound = AllRound + (x-1)/2;
                x = (x-1)/2 +1;
            }
        }
        //System.out.println(nextRoundTeams);
        return AllRound;
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
