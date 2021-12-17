package com.company.tree;

import com.company.stack_and_queue.SimpleQueue;
import com.company.stack_and_queue.SimpleStack;

public class SumDeep_SumWide_Tree2 {//Алгоритм поиска по дереву в глубину
    public static  void main(String[] params) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));//Это дерево написано вручную, посмотреть на него можно в readme

        System.out.println("Сумма дерева: " + sumDeep(root));
        System.out.println("Сумма дерева: " + sumWide(root));
    }

    static class Tree{
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {//для конечного(вроде)
            this.value = value;
        }
        public int sum() {//Рекурсивный обход дерева в глубину
            int summ = value;

            if (left != null) {
                summ += left.sum();
            }

            if (right != null) {
                summ += right.sum();
            }
            return summ;
        }
    }

    public static int sumDeep(Tree root){ // Работает со стэком
        SimpleStack<Tree> stack = new SimpleStack<>();
        stack.push(root);

        int summ = 0;
        System.out.println("Обход в глубину");
        while(!stack.isEmpty()){//Пока стэк не пустой
            Tree node = stack.pop();
            System.out.println("Порядок обхода дерева, сейчас обрабатывается элемент: " + node.value);
            summ = summ + node.value;

            if (node.right != null){
                stack.push(node.right); // Добавляем элемент в стэк
            }

            if(node.left != null){
                stack.push(node.left);
            }
        }
        System.out.println("Картинку дерева можно посмотреть в readme");
        return summ;
    }

    public static int sumWide(Tree root){ // Работает с очередью
        SimpleQueue<Tree> stack = new SimpleQueue<>();
        stack.add(root);

        int summ = 0;
        System.out.println("Обход в ширину");
        while(!stack.isEmpty()){//Пока стэк не пустой
            Tree node = stack.remove();
            System.out.println("Порядок обхода дерева, сейчас обрабатывается элемент: " + node.value);
            summ = summ + node.value;

            if (node.right != null){
                stack.add(node.right); // Добавляем элемент в стэк
            }

            if(node.left != null){
                stack.add(node.left);
            }
        }
        System.out.println("Картинку дерева можно посмотреть в readme");
        return summ;
    }
}
