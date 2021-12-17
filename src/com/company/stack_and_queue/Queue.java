package com.company.stack_and_queue;

public interface Queue<T> {
    void add(T item); //Добавить элемент в конец очереди
    T remove(); // Извлечение элемента из начала очереди

    boolean isEmpty(); //Проверка пустая ли очередь
}
