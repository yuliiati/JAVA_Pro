public class Main {

    // public static String getNewString(String s){
    //AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
    //**Добавить проверку
    //return null;
    //}
    public static void main(char[] str) {
        if (str != null && str.length > 1) {
            for (int last = 0, curr = 1, count = 1, tail = 0; curr 1) {
                str[tail++] = str[last];
                str[tail++] = (char) count;
                count = 1;
            }
            last = curr;
            curr++;
        }
    }
}


//        public static void main(String[] args) {
//            public static int countWords(String s) {
//                String s = "AAASSDDFFRRTGGBNHYUUU";
//                return s.chars().reduce(0, (x, y) -> {
//                    if((char)y == ' ')
//                        return x + 1;
//                    return x;
//                });
//            }
//        }
//            String s = "AAASSDDFFRRTGGBNHYUUU";
//            long result = s.chars().filter(ch -> ch == 'A').count();
//            System.out.println(result);
//        }
//        }
//            String alphabet = "AAASSDDFFRRTGGBNHYUUU";
//            System.out.println(alphabet.indexOf('A')); // 0
//            System.out.println(alphabet.indexOf('S')); // 10
//            System.out.println(alphabet.indexOf('D')); // 25
//            System.out.println(alphabet.indexOf('F')); // -1
//            System.out.println(alphabet.indexOf('R')); //
//            System.out.println(alphabet.indexOf('T')); //
//            System.out.println(alphabet.indexOf('G')); //
//            System.out.println(alphabet.indexOf('B'));
//            System.out.println(alphabet.indexOf('N'));
//            System.out.println(alphabet.indexOf('H'));
//            System.out.println(alphabet.indexOf('Y'));
//            System.out.println(alphabet.indexOf('U'));

//            public static void main(String []args){
//                String line = "AAASSDDFFRRTGGBNHYUUU";  // 12 уникальных
//                System.out.println( line.chars().distinct().count() );
//
//            ArrayList<String> list = new ArrayList<>();
//            list.add("AAASSDDFFRRTGGBNHYUUU");
//            for (int i = 0; i < list.size(); i++) {
//                for (int j = 0; j <list.get(i).length(); j++) {
//                    if (list.get(i).charAt(j) == 'л') {
//                        System.out.println(list.get(i));
//                    }
//                }
//            }
//            public static void main(String[] args) {
//            String line = "AAASSDDFFRRTGGBNHYUUU";
//
//                System.out.print("AAASSDDFFRRTGGBNHYUUU".charAt(0));
//                System.out.print("AAASSDDFFRRTGGBNHYUUU".charAt(1));
//                System.out.print("AAASSDDFFRRTGGBNHYUUU".charAt(2));
//                System.out.print("AAASSDDFFRRTGGBNHYUUU".charAt(3));

//    public static void main(String[] args) {
//        String testString =  "AAASSDDFFRRTGGBNHYUUU";
//        testString.indexOf('A');
////        boolean isMoreThanOne = true;
//        System.out.println("More than one: " + indexOf);
////        System.out.println("Hello world!");

