package Lesson_7_Potato_21_04_23.task4;

public class MyList {

    private String[] elements = new String[20];
    private int size = 0;

    public void add(String value){
        elements[size++] = value;
    }
    public int size() { // содержит и так размер Листа
        return size;
    }

//    public boolean isEmpty() {
//        if (size == 0) {
//            return true;
//        }else{
//            return false;
//        }
//    }
    public boolean isEmpty() {
        return size == 0;   // проверяем рез работы сравнения сайз ) 0. 0 = 0 true. size = 1: 1=0 - false
    }

    public MyIterator iterator() {
        return new MyIterator();    // вызываем конструктор при создании метода
    }

    public class MyIterator {

        private int cursor = 0; // cursor size зависимость

        public boolean hasNext() {
            return cursor < size;
        }
        public String next() {
           return elements[cursor++];
        }
    }
}
