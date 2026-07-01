public class leet3 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 1};
        boolean isDuplicate = false;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }
        System.out.println(isDuplicate);
    }
}