//package Lesson_7_Potato_21_04_23.ListHw;
//
//import java.util.*;
//
//public class MyNewList{
//
//    public void newList(){
//        List<Integer> list = new ArrayList<>();
//        int n = 10000000;
//
//        // наполнение списка
//        for (int i = 1; i <= n; i++) {
//            list.add(i);
//        }
//            // проверка наполнения списка
//        System.out.println(list);
//    }
//
//    public void newList2(){
//        List<Integer> list = new ArrayList<>();
//        int n = 10000000;
//    }
//        // наполнение списка
//        for (int i = 1; i <= n; i++) {
//            list.add(i);
//        }
//
//        // for-each
//        long startTime = System.currentTimeMillis();
//        for (Integer temp : list) {
//            // do something
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("for-each: " + (endTime - startTime) + " ms");
//
//        // классический for
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < list.size(); i++) {
//            Integer temp = list.get(i);
//            // do something
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("классический for: " + (endTime - startTime) + " ms");
//
//        // классический for с переменной размера списка
//        startTime = System.currentTimeMillis();
//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            Integer temp = list.get(i);
//            // do something
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("классический for с переменной размера списка: " + (endTime - startTime) + " ms");
//
//        // классический for в обратном порядке
//        startTime = System.currentTimeMillis();
//        for (int i = list.size() - 1; i >= 0; i--) {
//            Integer temp = list.get(i);
//            // do something
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("классический for в обратном порядке: " + (endTime - startTime) + " ms");
//
//        // Iterator
//        startTime = System.currentTimeMillis();
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer temp = iterator.next();
//            // do something
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Iterator: " + (endTime - startTime) + " ms");
//
//        // ListIterator
//        startTime = System.currentTimeMillis();
//        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            Integer temp = listIterator.next();
//            // do something
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("ListIterator: " + (endTime - startTime) + " ms");
//    }
//
//
