package Lesson_8_28_04_23;

public class ListTest {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("World");
        list.add("aaaaaaaaaaaaaaaaaaaaaa");
        list.addToTail("Test");
        list.add(2, "Happy A N D :)");

        // Здесь будем вызывать методы нашего листа



        // Блок тестирования
        System.out.println("Вывод в консоль с помощью toString");
        System.out.println(list);
        System.out.println();

        System.out.println("Вывод в консоль с помощью for-each");
        for (String value : list) {
            System.out.println(value + " ");
        }
        System.out.println();


        System.out.println("Вывод в консоль с помощью итератора");
        MyLinkedList.MyIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println(list.size());

    }
}
