
public class findNumber {

    public static int findUniqueNumber(int[][] arr) {
        int uniqueNum = 0;
        boolean isUnique = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                isUnique = true;
                for (int k = 0; k < arr.length; k++) {
                    if (k == i) {
                        continue;
                    }
                    for (int l = 0; l < arr[k].length; l++) {
                        if (l == j && k == i) {
                            continue;
                        }
                        if (arr[i][j] == arr[k][l]) {
                            isUnique = false;
                            break;
                        }
                    }
                    if (!isUnique) {
                        break;
                    }
                }
                if (isUnique) {
                    uniqueNum = arr[i][j];
                    break;
                }
            }
            if (isUnique) {
                break;
            }
        }

        return uniqueNum;
    }
}