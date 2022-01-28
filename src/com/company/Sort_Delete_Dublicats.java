package com.company;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort_Delete_Dublicats {

    /*public static void main(String[] args){
        int[] a = {1, 2, 4, 8, 6, 3, 6, 5, 8, 2, 9, 23, 5, 73, 23};
        System.out.println(Arrays.toString(a));
        System.out.println("________________________________");
        System.out.println(Arrays.toString(Sort_Delete_Dublicats.getUnique(a)));

        System.out.println("My unique array : "+Arrays.toString(IntStream.of(a).distinct().toArray()));
    }
    public static int[] getUnique(int[] a) {
        boolean unique = true;
        int[] b = new int[a.length];
        for(int i=0, k=0; i<a.length; i++) {
            unique = true;
            for(int j=i+1; j<a.length; j++) {
                if(a[i]==a[j]) unique = false;
            }
            if(unique) b[k++]=a[i];
        }
        return b;
    }*/
    private static int[] getDesiredAmountFomArray(int[] source, int desiredAmount) {
        int[] indexStat = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if(source[i] >= 0) {
                    if (source[i] == source[j])
                        indexStat[i]++;
                }else throw new java.lang.Error("Есть элемент меньше 0");
            }
        }
        int counter = 0; // счетчик колич. желаемых элементов
        for (int anIndexStat : indexStat) {
            if (anIndexStat == desiredAmount - 1) counter++;
        }
        int[] ret = new int[counter];
        counter = 0; // дабы не вводить новую перем. испльзуем, как индекс
        for (int i = 0; i < indexStat.length; i++) {
            if (indexStat[i] == desiredAmount - 1)
                ret[counter++] = source[i];
        }
        return ret.length == 0 ?  new int[0] : ret;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 9, 2, 7, 1, 7, 7, 5, 7, 9, 3, 1, 0,-2, 4, 0};
        System.out.println(Arrays.toString(getDesiredAmountFomArray(array, 1))); // без повторений
        System.out.println(Arrays.toString(getDesiredAmountFomArray(array, 2))); // только 2 раза
        System.out.println(Arrays.toString(getDesiredAmountFomArray(array, 3))); // 3 раза
        System.out.println(Arrays.toString(getDesiredAmountFomArray(array, 4))); // понятно, если есть 4
    }
}
