package com.company.sort;
import java.util.List;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ArraySort {




        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 9, 0, 2, 4, -1));
            System.out.println(sort(list).toString());
        }

        public static List<Integer> sort(List<Integer> list) {

            //Сортировка
            for(int i =0; i<list.size();i++){
                for(int j = i +1; j<list.size();j++){
                    if(list.get(i)>list.get(j)){
                        int swap = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j,swap);
                    }
                }
            }

            //Сортировка через stream
            /*List<Integer> sortedList = list.stream()
                    .sorted()
                    .collect(Collectors.toList());
            list = sortedList;*/

            /*int to = list.size();
            for(int from = 0; from < to; from++){
                int divideIndex = partition(list, from, to);
            }*/


            //1. Просто сортировка
            //Collections.sort(list);

            //2. Сортировка по убыванию
            //Collections.sort(list, Comparator.reverseOrder());

            //3. Сортировка по возрастанию с переопределением компаратора
            /*Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });*/

            //4. Сортировка по убыванию с переопределением компаратора (нужно только отразить return)
            /*Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });*/

            return list;
        }

}
