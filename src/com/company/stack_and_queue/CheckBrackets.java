package com.company.stack_and_queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CheckBrackets {
    public static void main(String[] args){
        //Проверить строку на корректность

        boolean resultSimple = AlgorithmBracketsSimple("((())()())");
        System.out.println(resultSimple);
        System.out.println("------------------------------------------");
        boolean result = AlgorithmBrackets("([({()})()()])");
        System.out.println(result);

    }

    public static boolean AlgorithmBracketsSimple(String str){
        Deque<Character> dequeSimple = new LinkedList<>();

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) =='('){//char(Character)-символ
                dequeSimple.add(str.charAt(i));
            } else{
                if(dequeSimple.size() == 0 || dequeSimple.pollLast() != '('){//pollLast - последнее что было добавлено не закрывающиеся скобка
                    return false;
                }
            }
        }
        return dequeSimple.size() == 0;//Возвращает true или false если вдруг остались после цикла ((
    }

    //---------------------------------------------//

    public static boolean AlgorithmBrackets(String str){

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Deque<Character> deque = new LinkedList<>();

        for(int i =0; i<str.length(); i++){

            Character closingBracket = str.charAt(i);
            Character openingBracket = map.get(closingBracket); //Character - символ

            if(openingBracket ==null){//char-символ
                deque.add(closingBracket);
            } else{
                if(deque.size() == 0 || deque.pollLast() != openingBracket){//pollLast - последнее что было добавлено не закрывающиеся скобка
                    return false;
                }
            }
        }
        return deque.size() == 0;//Возвращает true или false если вдруг остались после цикла ((
    }

}
