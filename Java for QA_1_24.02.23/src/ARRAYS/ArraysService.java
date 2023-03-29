package ARRAYS;

import java.util.Arrays;
import java.util.Collection;

public class ArraysService {
    public static int binarySearch(int[] array, int search) {
        int low = 0;    //начальный индекс
        int high = array.length - 1;    //конечный индекс

        while (low <= high) {   //цикл идет, пока начальный = конечному
            int half = (low + high) / 2;    //вычисляем половину

            if (search < array[half]) { //спрашиваем ячейку посередине - наш эл больше или меньше
                high = half - 1;    //передвигаем конечную точку поиска
            } else if (search > array[half]) {  // если больше . передвиг нач эл
                low = half + 1;
            } else {
                return half;
            }
        }
        return -1;  // искомого элемента просто нет!
        // hw. Отсорт массив по возраст. Задумываете число и проверяете. Есть число - индекс, нет - "-1"

//        int[] array = {0, 0, 3, 6, 8, 9, 12, 15, 20};
//        int search = 11;  //чет опшпш не работает!
//
//        System.out.println(ArraysService.binarySearch(array, search));

////        int[] array1 = {8, 3, 12, 1, 0, 15, 20};
//
//        Arrays.sort(array1);
//
//        //Collection.sort(array1);    //Коллекции!!!!!!!!!!!!!!!!!!О________о "Более удобный Массив"
//
//        System.out.println(array1);
    }
}

