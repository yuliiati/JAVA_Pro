public class Polimorphism {
    public static void main(String[] args) {
        CalculatorParent calculatorParent = new CalculatorParent();
        System.out.println(calculatorParent.sum(1, 2));
        System.out.println(calculatorParent.sum(3.14, 2.71));

    }
}
//TODO public enum jobTitle {
//    CEO(),
//    COO(),
//    CFO(),
//    FINANCE_MANAGER(),
//    OPERATING_MANAGER(),
//    EXECUTIVE_MANAGER(),
//    DEVELOPER(),
//    QA_ENGINEER(),
//    FRONTEND_DEVELOPER();
// }
class CalculatorParent {
    int sum(int a, int b) {
        return a + b;
    }
    double sum(double a, double b) {
        return a + b;
    }
    double sum(int a) {
        return a + 5.14;
    }
}