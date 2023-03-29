package ARRAYS;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String name = "Hello";
        String[] stringArray = new String[10]; //размер 10 типа стринг/null значение внутри!!Когда я это уже запомню?!

        System.out.println(stringArray[5]); //1 null

        stringArray[5] = name;

        System.out.println(stringArray[5]); //2 Hello

        int[] intArray = {6, 3, 15, 0, 45};

        for (int value : intArray) { // Цикл foreach
           System.out.println(value);
        }

        for (int index = 0; index < intArray.length; index++) { //неудобство - работа с циклом одного размера. все вручную писать. нет length
            System.out.println(intArray[index] + " index = " + index);    //intArray0; intArray 1;.....
        }

        int[][] intArray2D = new int[3][4];
        System.out.println(Arrays.toString(intArray));//БЫСТРЫЙ ВЫВОД МАССИВА В КОНСОЛЬ

        for (int[] row: intArray2D) {   //row это уже переменная! Создали автоматом ниче нигде не обьявляя.
                                        // При каждом цикле заносится след. строка!!!1 - 0, 2 - 1.
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        int[][] intArray2D_2 = new int[3][4];   //заносим значения в массив
        intArray2D[2][1] = 5;
        System.out.println(Arrays.toString(intArray));//БЫСТРЫЙ ВЫВОД МАССИВА В КОНСОЛЬ

        int[] [] intArray2D_3 = {{1, 2, 3},  //Литерал - конкретные значения в коде
                                 {4, 5, 6}, // Не знач пер, а конкретные {1, 2, 3}
                                 {7, 8, 9}};

        for (int[] row: intArray2D_3) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        int[][][] intArray3D = new int[3][4][7];

        intArray3D[2][1][5] = 7;    //2мер масс 2, строка 1 под коорд 5!!!00007000

        for(int[][] array2D : intArray3D) {
            for (int[] row : array2D) {
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
            System.out.println();
        }









    }
}
