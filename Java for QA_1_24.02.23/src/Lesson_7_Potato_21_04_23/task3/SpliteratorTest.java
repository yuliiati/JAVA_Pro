package Lesson_7_Potato_21_04_23.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("T");
        letters.add("Ü");
        letters.add("Z");

        // Разделяй и властвуй. Отдает меньшую часть_ но ПЕРВУЮ ЧАСТЬ, а себе оставляет большую. ВТОРУЮ ПОЛОВИНУ. Делит на 2. trySplit

        Spliterator<String> spliterator = letters.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        spliterator.forEachRemaining(x -> System.out.println("First spliterator" + x)); // повторяет 1 и то же действие
        spliterator1.forEachRemaining(x -> System.out.println("Second spliterator" + x));

        spliterator1.forEachRemaining(x -> System.out.println("Second spliterator" + x));;
        spliterator.forEachRemaining(x -> System.out.println("First spliterator" + x)); // повторяет 1 и то же действие


    }
}
