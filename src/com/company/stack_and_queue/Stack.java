package com.company.stack_and_queue;

public interface Stack<T> {
    void push(T item); // Добавить элемент на вершину стэка
    T pop(); // Взять элемент с вершины стэка

    boolean isEmpty();
}
