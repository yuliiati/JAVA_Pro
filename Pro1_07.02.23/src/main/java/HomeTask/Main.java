package HomeTask;
public class Main {


    public static void getMin(int[] arr) {
        int min = arr[0];
        int min2 = 0;
        //20
        for (int j : arr) {
            if (j <= min) {
                min2 = min; // 22
                min = j;  // 11
            } else if (j > min && j < min2) {
                min2 = j;
            }
        }
        System.out.println("MIN 1: " + min);
        System.out.println("MIN 2: " + min2);

    }
        }