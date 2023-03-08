public class Main {
    // ДЗ:

    //AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
    //**Добавить проверку
    //return null;
    //}
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "AAASSDDFFRRTGGBNHYUUU";
        System.out.println("Formatted String is: " + sol.toFormat(s));
    }
    static class Solution {
        public String toFormat(String input) {
            char inChar[] = input.toCharArray();
            String output = "";
            int i;
            for(i = 0; i < input.length(); i++) {
                int count = 1;
                while(i + 1 < input.length() && inChar[i] == inChar[i+1]) {
                    count += 1;
                    i += 1;
                }
                output += inChar[i] + String.valueOf(count);
            }
            return output;
        }
}
}

//    public static String getNewString(String s) {
//        String result = "";
//        int count = 1;
//        for (int i = 0; i < s.length(); i++) {
//            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
//                count++;
//            } else {
//                result += count + "" + s.charAt(i);
//                count = 1;
//            }
//        }
//        return result;
//    }
//}