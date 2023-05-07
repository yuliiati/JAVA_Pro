package Lesson_7_Potato_21_04_23.task4;

public class MyListTest {
    public static void main(String[] args) {

        MyList list = new MyList();

        System.out.println(list.size());

        list.add("Hello");
        System.out.println(list.size());
        list.add("World");
        System.out.println(list.isEmpty());
        list.add("Rrrr");
        System.out.println();

        System.out.println(list.size());

        MyList.MyIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
