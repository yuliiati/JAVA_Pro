package Lesson_7_Potato_21_04_23.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        System.out.println("Вывод всех чисел в строку");

        for (Integer number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();

        System.out.println("Вывод всех чисел в строку с помощью итератора");

        Iterator<Integer> iterator = numbers.iterator(); // посмотреть код итератора ctrl + mouse

//        while (true) {  // endless cycle
//            System.out.println(iterator.next() + " ");
//            if(!iterator.hasNext()){
//                break;
//            }
//        }
        while (iterator.hasNext()) {  // endless cycle  // брейкпоинт в дебаге запустить
            System.out.println(iterator.next() + " ");
        }
    }
}
