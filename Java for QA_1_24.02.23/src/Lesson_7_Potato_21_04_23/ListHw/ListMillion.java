//package Lesson_7_Potato_21_04_23.ListHw;
//import java.util.*;
//
//// 1. Создать лист.
////
////В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
//
//public class ListMillion {
//
//        public static void main(String[] args) {
//            List<Integer> list = listMillion();
//
//            // проверка наполнения списка
//            System.out.println(list);
//        }
//
//        public static List<Integer> listMillion() {
//            List<Integer> list = new ArrayList<>();
//            int n = 10000000;
//
//            // наполнение списка
//            for (int i = 1; i <= n; i++) {
//                list.add(i);
//            }
//            return list;
//        }
//
//    // наполнение списка
//        for (int i = 1; i <= n; i++) {
//        list.add(i);
//    }
//    // проверка наполнения списка
//        System.out.println(list);
//}
//
//        //foreach
//    public void forEach(){
//        long startTime = System.currentTimeMillis();
//
//    int temp = 0;
//for (int num : list) {
//        temp = num;
//    }
//
//    long endTime = System.currentTimeMillis();
//System.out.println("For-each loop time: " + (endTime - startTime) + " ms");
//}
//    }
//
//
