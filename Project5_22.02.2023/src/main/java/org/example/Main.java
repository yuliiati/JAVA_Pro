package org.example;    // Algorithms 22.02.2023

public class Main {
//    public static void main(String[] args) {

        //TODO Рассмотрим приведенный ниже алгоритм линейного поиска:
        //Шаг 1: НАЧАТЬ
        //Шаг 2: Получить массив в arr и число для поиска в x
        //Шаг 3: Начните с крайнего левого элемента arr[] и один за другим сравните x с каждым элементом arr[]
        //Шаг 4: Если x соответствует элементу Print True.
        //Шаг 5: Если x не совпадает ни с одним из элементов, выведите False.
        //Шаг 6: КОНЕЦ

//        public static boolean linearSearch(int[] arr, int x) {
//            // начинаем с первого элемента (индекс 0)
//            for (int i = 0; i < arr.length; i++) {
//                // сравниваем элемент с искомым значением
//                if (arr[i] == x) {
//                    return true; // если элемент найден, возвращаем true
//                }
//            }
//            return false; // если элемент не найден, возвращаем false
//        }

//        Данный алгоритм реализует линейный поиск в массиве. Он простыми словами выглядит следующим образом:
//        1 Начинаем с первого элемента массива.
//        2 Сравниваем его с искомым значением x.
//        3 Если элемент равен x, то возвращаем true.
//        4 Если элемент не равен x, то переходим к следующему элементу массива и повторяем шаги 2-3.
//        5 Если элемент x не был найден во всем массиве, то возвращаем false.

//        System.out.println("Hello world!");
//
//┌──────────────┐
//│ Начало работы │
//└──────────────┘
//        │
//        ▼
//┌──────────────┐
//│ Получить arr и x │
//└──────────────┘
//        │
//        ▼
//┌──────────────┐
//│ i = 0        │
//└──────────────┘
//        │
//        ▼
//┌────────────────────┐
//│ arr[i] == x ?      │
//│   true -> return   │
//│   false -> i++     │
//└────────────────────┘
//        │
//        ▼
//┌──────────────┐
//│ i < arr.length ?  │
//│   true -> repeat  │
//│   false -> return │
//└──────────────┘
//        │
//        ▼
//┌──────────────┐
//│ Конец работы  │
//└──────────────┘

/*START     -> 1st
    get int x, arr[]
    FOR Each
    COMPARE x with arr[]
    IF x == arr[i] --> print True or index(i)
    ELSE print False
    END
     */

   /*  ART      -> 2nd
    GET arr
    GET X
    INIT flag = false
    FOR I  WHILE I < arr.length   INCREMENT I
    IF massive(i) = X
            flag = true
    //PRINT i
    RETURN flag
    BREAK
    END FOR
    RETURN flag
    //PRINT "no"
    END */

//1. Написать псевдокод для алгоритма: получить из консоли три числа, сложить их и вывести сумму
//2. Реализовать алгоритм в коде

// 1. START
// 2. GET numbers a, b, c from Terminal
// 3.
// 4. RETURN a + b + c (return sum)
// 5.
// 6.
// 7.

    /*

    */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            System.out.print("Введите третье число: ");
            int c = scanner.nextInt();

            int sum = a + b + c;

            System.out.println("Сумма: " + sum);
        }
    }
//    }

//}