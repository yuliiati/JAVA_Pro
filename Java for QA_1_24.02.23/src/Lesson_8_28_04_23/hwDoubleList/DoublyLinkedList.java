package Lesson_8_28_04_23.hwDoubleList;
/*
Изменить MyLinkedList на двусвязный список с соответствующей реализацией методов.

Изменить интерфейс MyIterator с Iterator на ListIterator, реализовать соответствующие методы.
*/
/*
ListIterator является дочерним интерфейсом интерфейса Iterator. Основное различие между Iterator и ListIterator
заключается в том, что Iterator может проходить элементы в коллекции только в прямом направлении,
тогда как ListIterator может проходить элементы в коллекции как в прямом, так и в обратном направлении.
*/

import java.util.ListIterator;
import java.util.NoSuchElementException;


public class DoublyLinkedList {
    private Node<String> head;
    private Node<String> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private static class Node<String> {
        private String data;
        private Node<String> prev;
        private Node<String> next;

        private Node(String data, Node<String> next, Node<String> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(String data) {
        Node<String> newNode = new Node<>(data, head, null);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(String data) {
        Node<String> newNode = new Node<>(data, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public String removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        String data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return data;
    }

    public String removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        String data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return data;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<String> currentNode;
        if (index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode.data;
    }

    public ListIterator<String> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements ListIterator<String> {
        private Node<String> nextNode;
        private Node<String> lastReturnedNode;
        private int nextIndex;

        private MyListIterator() {
            nextNode = head;
            nextIndex = 0;
            lastReturnedNode = null;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String data = nextNode.data;
            lastReturnedNode = nextNode;
            nextNode = nextNode.next;
            nextIndex++;
            return data;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public String previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            if (nextNode == null) {
                nextNode = tail;
            } else {
                nextNode = nextNode.prev;
            }
            lastReturnedNode = nextNode;
            nextIndex--;
            return lastReturnedNode.data;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            if (lastReturnedNode == null) {
                throw new IllegalStateException();
            }
            if (lastReturnedNode == head) {
                removeFirst();
            } else if (lastReturnedNode == tail) {
                removeLast();
            } else {
                lastReturnedNode.prev.next = lastReturnedNode.next;
                lastReturnedNode.next.prev = lastReturnedNode.prev;
                size--;
            }
            lastReturnedNode = null;
            nextIndex--;
        }

        public void set(String data) {
            if (lastReturnedNode == null) {
                throw new IllegalStateException();
            }
            lastReturnedNode.data = data;
        }

        public void add(String data) {
            Node<String> newNode = new Node<>(data, nextNode, nextNode == null ? tail : nextNode.prev);
            if (nextNode == null) {
                tail = newNode;
            } else {
                nextNode.prev = newNode;
            }
            if (nextIndex == 0) {
                head = newNode;
            } else {
                newNode.prev.next = newNode;
            }
            lastReturnedNode = null;
            nextIndex++;
            size++;
        }
    }
}


