package Lesson_6_31_03_23;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    // Задача 1
    public static List<String> joinLists(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();

        result.addAll(first);
        result.addAll(second);

        return result;
    }

    // Задача 2
    // Без дубликатов!!!
    public static List<String> joinWithoutDuplicates(List<String> first, List<String> second) {
        // A B C D E
        // D E F G
        // A B C D E F G
        List<String> result = new ArrayList<>();

        result.addAll(first);

        for (String current : second) {
            if (!result.contains(current)) {
                result.add(current);
            }
        }
        return result;
    }

    // Задача 3
    public static List<String> difference(List<String> first, List<String> second) {
        // A B C D E
        // D E F G
        // A B C D E F G
        List<String> result = new ArrayList<>();

//        result.addAll(first);
//
//        for (String current : second) {
//            if (result.contains(current)) {
//                result.remove(current);
//            } else {
//                result.add(current);
//            }
//        }

        for (String current : first) {
            if (!second.contains(current)) {
                result.add(current);
            }
        }

        for (String current : second) {
            if (!first.contains(current)) {
                result.add(current);
            }
        }

        return result;
    }
}


