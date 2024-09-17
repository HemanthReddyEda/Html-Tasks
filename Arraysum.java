public class Arraysum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 7;

        for (int i : arr) {
            int j = k - i;
            for (int l : arr) {
                if (l == j) {
                    System.out.println("(" + i + "," + l + ")");
                }
            }
        }
    }

}
