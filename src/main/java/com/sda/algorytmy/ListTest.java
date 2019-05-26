package com.sda.algorytmy;

public class ListTest {

    public static void main(String[] args) {

        MyList<Integer> list = new ListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);


        MyList<Integer> list1 = new LinkedListImpl<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

    }
}
