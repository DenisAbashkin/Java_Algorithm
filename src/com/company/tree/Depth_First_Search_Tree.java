package com.company.tree;

public class Depth_First_Search_Tree {//Алгоритм поиска по дереву в глубину
    public static  void main(String[] params) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));//Это дерево написано вручную, посмотреть на него можно в readme

        System.out.println("Сумма дерева: " + root.sum());
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
}
