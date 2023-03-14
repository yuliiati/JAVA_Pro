public class isSelfDividing1 {
    public static boolean isSelfDividing(int num) {
        // переводим число в строку, чтобы обрабатывать его посимвольно
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            // проверяем, является ли цифра делителем числа
            if (digit == 0 || num % digit != 0) {
                return false;
            }
        }

        return true;
    }

    public static void findNumbersWithSelfDividingDigits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isSelfDividing(arr[i])) {
                System.out.println(arr[i] + " - число, состоящее из собственных делителей");
            }
        }
    }

}
