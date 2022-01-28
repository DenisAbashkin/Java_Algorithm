package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Search_on_List_with_stream {

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Germany", "Panama", "Australia", "One", "Two");

        //Метод через stream
        Stream stream = countries.stream();
        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);

        //Старый метод
        for(int i = 0; i < countries.size(); i++) {
            if (countries.get(i).length() < 4) {
                System.out.println(countries.get(i));
            }
        }
    }
}
