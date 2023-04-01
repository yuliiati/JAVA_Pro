package Lesson_6_31_03_23;
// Определенно, Интереснейшая Лекция за все время! Короткие и полезные методы - лучше любых слов!:))
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(); // Почему не Array? Можно в будущем поменять на List или др.

        integers.add(0, 3);
        integers.add(1, 5);
        integers.add(2, 23);
        integers.add(1, 4); // index'ы нужны чтобы разместить элементы по конкретному "адресу".
        // И он сам(List) решает куда его поставить - первым или вторым - больше или меньше.

        // [3, 5, 23] [3, 4, 5, 23].

                // МЕТОДЫ LIST<Integer>
        //_________________________________________________
        // LIST ы используются на практике для того, чтобы перебрать элементы. Или поиск по массиву, листу и тд.
        // Номер индекса особо не играет роли

        // метод .add - замена числа. Вставляет, добавляет элементы
        // метод .set - перезаписывание элементов
        System.out.println(integers);
        integers.add(1, 8); // С индесом - вставляет на указанное место
        System.out.println(integers);
        integers.set(1, 9);
        System.out.println(integers);
        integers.add(28);   // !!! Если указать без индекса, то элемент станет в конец списка
        System.out.println(integers);
        List<Integer> integers1 = new ArrayList<>();

            // Щелкнуть курсором, альт шифт + выбираем другую строку и пишем на 2 одновременно! Класс! :)

        integers1.add(20); // лжощозозо    WOOOOOOOOOOOOOOOOOOOOOOOW))))))))))))))))MAGIC! =)
        integers1.add(30); //лжощозозо  WOOOOOOOOOOOOOOOOOOOOOOOW))))))))))))))))MAGIC! =)
        integers1.add(40);// лжощозозо WOOOOOOOOOOOOOOOOOOOOOOOW))))))))))))))))MAGIC! =)

        integers.addAll(2,integers1);
// [3, 9, 20, 30, 40, 4, 5, 23, 28] - один лист "вставился" под индексом 2 в другой [20, 30, 40]. все уехало вправо
        // метод .addAll
        System.out.println(integers);
        integers.remove(3);
        System.out.println(integers);
        integers.set(3, null);
        System.out.println(integers);

        // List<String>  - "Лист стрингов" :D - можно указать любой класс тип - стринг, инт

        List<String> words = new ArrayList<>();

        // integers.add(Integer); - тип Integer
       // words.add(String);    - тип String
        // Методы зависят от того, что написано в треугольных скобочках <Тип данных Листа >
        // integers.add("Hello"); . невозможно написать "такое"! Даже сама Идея не разрешит этот бред) Wrong type

        words.add("Hello");
        words.add("World!");
        words.add("I");
        words.add("Java!");
        words.add(3,"study");   // "Класс"!! Добавляет слово по индексу куда хочешь! Прикольно!

        System.out.println(words);

        List<Object> objects = new ArrayList<>();   // Обьект совмещает строку и число, любой тип, так как наследуется
        objects.add("Hello!");
        objects.add(new Integer(5));    // Можно добавить все что угодно - кота, дом :DDD Можно без инта. (5)

        System.out.println(objects);

        words.remove(0);    // Удаляем по индексу [Hello!]

        System.out.println("Удалили элемент по индексу 0 - Hello");
        System.out.println(words);

        words.remove("Java!");  // Удаляем сам объект, [World!, I, study] конкретно указывая его название!

        System.out.println("Удалили конкретный объект/слово - Java!");
        System.out.println(words);

        words.add("Java!");
        words.add(0, "Hello");
        System.out.println(words);

        List<String> otherWords = new ArrayList<>();
        otherWords.add("First");    // [First, Hello, World!, I, study, Java!]
        otherWords.addAll(words);
        System.out.println(otherWords); // [Hello, World!, I, study, Java!]
                                        // [Hello, World!, I, study, Java!]
        System.out.println(words.get(3));   // "study" - .get - получить эл. по индексу
        System.out.println(words.size());   // "5" - .size - получить размер сроки, массива

        otherWords.clear();
        System.out.println(otherWords); // [] - Лист очистился, он пустой, но он существует.
        // Можно заново добавлять и дальше работать с ним
        otherWords.add("Hello");
        System.out.println(otherWords);

        /*
        int index = words.indexOf("I"); // узнаем номер индекса соседнего жл.
        // Потом легко добавить новый эл, зная соседний индекс
        System.out.println(index);
        */

        words.add(words.indexOf("I") + 1, "like");  // упростили пред. строку - words.indexOf("I")
        // Вычисляем индекс эл, увеличиваем на 1 (+1) и сразу же добавляем справа новый! Круто!
        // [Hello, World!, I, like, study, Java!]
        System.out.println(words);

        // words.add(words.indexOf("I") + 1, "like");  - команда вставляет слово после нужного нам слова! Лучшаая:)

        System.out.println(words.isEmpty());    //false
        otherWords.clear();
        System.out.println(otherWords.isEmpty());   // true! Бомба команда! Коротко и ясно!

        System.out.println(words.contains("study"));    // .contains - содержит что-то или нет, проверка
        System.out.println(words.contains("learn"));    // .contains - содержит что-то или нет, проверка

        for (int i = 0; i < words.size(); i+=2) {    // i++ - все слова в столбец вывелись. i+=2  - через слово
            // words.size()- like array.length
            System.out.println(words.get(i));
        }
        for (String currentWord : words) {
            System.out.println(currentWord);
        }

        for (int i = 0; i < words.size(); i++) {
            // 1. Hello                   i - 20, - Любое начало нумерации!
            System.out.printf("%d. %s\n", i + 1, words.get(i) ); // %d - digital - числовая переменная; %s - строка! Вау!
        }
        //1. Hello
        //2. World!
        //3. I
        //4. like
        //5. study
        //6. Java!










    }
}
