package Lesson_7_Potato_21_04_23.task1;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            numbers.add(i);
        }
        for (Integer num : numbers) {   // область видимости нам только внутри цикла
            System.out.println(num + " ");
        }
        System.out.println();   // пустой саут для переноса строки только

        Iterator<Integer> iterator = numbers.iterator();

//        for (Integer num : numbers) {   // такой простенький..почему я не запоминаю это все**
//            if (num % 2 == 0) {
//                numbers.remove(num);
//            }
//        }
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        for (Integer num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();

        Vector<Integer> nums1 = new Vector<>();

        for (int i = 1; i < 21; i++) {
            nums1.add(i);
        }
        Enumeration<Integer> enumeration = nums1.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");

        }
    }











}
