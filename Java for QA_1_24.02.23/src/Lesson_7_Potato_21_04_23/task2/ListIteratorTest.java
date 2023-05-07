package Lesson_7_Potato_21_04_23.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Чтобы не просто перебирать, а напр - развернуться
// Если картофелина гнилая, разворачиваемся и идем обратно
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("Y");
        letters.add("U");
        letters.add("L");
        letters.add("I");
        letters.add("I");
        letters.add("A");

        ListIterator<String> iterator = letters.listIterator();

        while (iterator.hasNext()){
            String current = iterator.next();
            System.out.println(iterator.next() + " ");
            System.out.println(current + " ");
            if (current.equals("I")) {
                break;
            }
        }
        System.out.println();

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous() + " ");
        }
    }
}
