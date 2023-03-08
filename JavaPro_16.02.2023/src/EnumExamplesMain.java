import java.util.Arrays;

public enum EnumExamplesMain {
    MO, TU,
    WE, TH,
    FR, SA,
    SU;

    public static void main(String[] args) {
        String d = EnumExamplesMain.SU.toString();
        System.out.println(d);

    }
}
