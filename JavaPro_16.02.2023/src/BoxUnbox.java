public class BoxUnbox {
    public static void main(String[] args) {
        // int <-> Integer
        int a = 4;
        Integer b = a;

        System.out.println(a + " " + b);

        // double <-> Double
        Double d = Double.valueOf(5.5);
        double f = d;
        System.out.println(d + " " + f);



    }
}
