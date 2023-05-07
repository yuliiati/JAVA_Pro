package Lesson_7_Potato_21_04_23.ListHw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
1. Создать лист.

2. В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)

3. Перебрать лист с помощью for-each, в цикле каждое значение листа записать в переменную temp.

4. Сделать то же самое с помощью классического for.

5. Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.

6. Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.

7. Сделать то же самое, но используя Iterator.

8. Сделать то же самое, но используя ListIterator.

9. Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл:

a) Замеряете текущее время до цикла с помощью метода System.currentTimeMillis();

b) Замеряете текущее время после цикла с помощью метода System.currentTimeMillis();

c) Выводите разницу во времени после и до в консоль.

 */

public class MyNewList {
    public static void main(String[] args) {
        // 1. Создание листа
        List<Integer> list = new ArrayList<>();

        // 2. Наполнение листа 10 миллионами значений
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }

        // 3. Перебор листа с помощью for-each
        long startTime = System.currentTimeMillis();
        for (int temp : list) {
            // Запись каждого значения листа в переменную temp
        }
        long endTime = System.currentTimeMillis();
        System.out.println("For-each loop time: " + (endTime - startTime) + "ms");

        // 4. Перебор листа с помощью классического for
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            // Запись каждого значения листа в переменную temp
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop time: " + (endTime - startTime) + "ms");

        // 5. Перебор листа с помощью классического for и переменной size
        startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
            // Запись каждого значения листа в переменную temp
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop with size variable time: " + (endTime - startTime) + "ms");

        // 6. Перебор листа с конца до начала
        startTime = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            int temp = list.get(i);
            // Запись каждого значения листа в переменную temp
        }
        endTime = System.currentTimeMillis();
        System.out.println("Backward classic for loop time: " + (endTime - startTime) + "ms");

        // 7. Перебор листа с помощью Iterator
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            // Запись каждого значения листа в переменную temp
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator loop time: " + (endTime - startTime) + "ms");

        // 8. Перебор листа с помощью ListIterator
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
            // Запись каждого значения листа в переменную temp
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator loop time: " + (endTime - startTime) + "ms");
    }
    /* Task 9:              // System.currentTimeMillis();
For-each loop time: 18ms
Classic for loop time: 19ms
Classic for loop with size variable time: 19ms
Backward classic for loop time: 17ms
Iterator loop time: 21ms
ListIterator loop time: 24ms*/
}





