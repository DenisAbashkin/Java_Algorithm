package com.company.stack_and_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueSample {
    public static void main(String[] args) {//Блокирующая очередь и переворот в потребителе

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);


        Thread producer = new Thread(() ->{
            String[] words = new String[] {"123", "abc", "qwerty", "queue", "stack", "array", "list"};

            for (int i = 0; i < words.length && !Thread.interrupted();) {
                try {
                    Thread.sleep(5000);
                    queue.put(words[i]);
                    System.out.println("producer: записал в очередь " + words[i] + ", число элементов в очереди: " + queue.size());
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();//Чтобы перевернуть
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(8000);
                    sb.append(queue.take());//Чтобы перевернуть
                    System.out.println("consumer: обработал из очереди " + sb.reverse() + ", число элементов в очереди: " + queue.size());//reverse() - Чтобы перевернуть
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}