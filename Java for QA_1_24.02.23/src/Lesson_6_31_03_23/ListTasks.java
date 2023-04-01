package Lesson_6_31_03_23;

import java.util.ArrayList;
import java.util.List;

public class ListTasks {
    public static void main(String[] args) {

        // ЗАДАЧА: есть Лист каких-то чисел.
        // Нужно их вывести в строчку, но умноженные на *3!

        // Стать на строчку и ctrl+d- быстрое копирование!
        // Андрей огонь! Много крутых фишек рассказал-показал!!!

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        integers.add(2);
        integers.add(1);
        integers.add(0);
        integers.add(23);    //ctr+d!!!!!!WOW:)))))))))

        System.out.println(integers);

        for (Integer value : integers) {
            // 5 * 3 = 15
            System.out.printf("%d * 3 = %d\n", value, value * 3);
            // 5 * 3 = 157 * 3 = 212 * 3 = 61 * 3 = 30 * 3 = 023 * 3 = 69

            // printf   ; \n - форматированный вывод построчно с переносом!)

            //5 * 3 = 15
            //7 * 3 = 21
            //2 * 3 = 6
            //1 * 3 = 3
            //0 * 3 = 0
            //23 * 3 = 69
        }

        // ЗАДАЧА 2: Вывести 2 строки без повторений букв и объединить. Т.е. сначала объед, а потом убрать лишнее

        List<String> first = new ArrayList<>();     // A B C D E
        List<String> second = new ArrayList<>();    // D E F G

        first.add("A");
        first.add("B");
        first.add("C");
        first.add("D");
        first.add("E");

        second.add("D");
        second.add("E");
        second.add("F");
        second.add("G");

        System.out.println(ListUtils.joinLists(first, second));
        // A, B, C, D, E, D, E, F, G

        System.out.println(ListUtils.joinWithoutDuplicates(first, second)); // Больше используют Листы. Массивы редко.
        // A, B, C, D, E, F, G
        // Когда нужно сэкономить память, но Листы удобнее

        System.out.println(ListUtils.difference(first, second));
        // A, B, C, F, G
        // Отличия
    }
}
