package Lesson_1_24_02_23;

public class Main {
    public static void main(String[] args) {
        int i = 7;
        Dog dog; // написав класс, мы по сути создали переменную
        System.out.println();
        System.out.println("До создания обьекта");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Барбос");
        Dog sharik = new Dog("Шарик");
        Dog dog3 = new Dog(3);
        Dog dog4 = new Dog(7, "Чёрный");

//        System.out.println(dog2.name);
//        System.out.println(dog4.age);
//        System.out.println(sharik.name);
        sharik.bark();
        dog2.bark();
//        dog.bark();

        // "" - пустая строка
        // null - вообще отсутствие какого-либо значения
        // 0 - ноль


    }
}