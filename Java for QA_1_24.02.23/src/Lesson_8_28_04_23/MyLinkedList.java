package Lesson_8_28_04_23;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {
    // делаем 1 связный список. а в hw  сделать 2связный

    private int size = 0;

    private Node head;  // голова нода

    public void add(String value) {     // метод head
        if (size == 0) {
            head = new Node(value, null);  // Hello example pic
        } else {
            Node newNode = new Node(value, head); // 1, 2 шаг. Создать и подвинуть
            head = newNode;
        }
        size++;
    }

    public void addToTail(String value) {
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        Node newNode = new Node(value, null);
        current.setNext(newNode);   // доб новый эд
        size++;
    }

    // метод размер_листа
    public int size() {
        return size;    // этот сайз можно использовать в любом методе
    }

    // сначала пишем код, проверяем гипотезы, потом смотрим и фиксим
    public void add(int index, String value) {
        if (index < 0 || index > size) { // ифкой мы проверили размер и адекватность индекса
            return;
        }
        if (index==0){
            add(value);
        }
        Node current = head;
        Node previous = null;
        int counter = 0;
        while (counter < index) {
            previous = current;
            current = current.getNext();
        }
        Node newNode = new Node(value, current);
        previous.setNext(newNode);
        size++;
    //Ctrl+Alt+L - форматирование
    }


    @Override
    public String toString() {

        // [java, world, hello, ]
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        result.setLength(result.length() - 2);
        result.append("]");
        return result.toString();
    }


    public MyIterator iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator {

        private int index;
        private Node current = head;

        //        @Override
//        public boolean hasNext() {          // метод hsNext
//            if (current == null) {
//                return false;
//            } else {
//                return true;
//            }
//        }
        @Override
        public boolean hasNext() {
            return current != null;  // 1 строкой записали
        }

        @Override
        public Object next() {  // возвращаем след эл листа
            String value = current.getValue();
//            Node nextNode = current.getNext();
            current = current.getNext();
            return value;
        }
    }

    //внутренний класс
    private class Node {

        // только String
        private String value;
        private Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
