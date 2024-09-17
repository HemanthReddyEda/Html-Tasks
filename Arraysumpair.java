import java.util.HashMap;

public class Arraysumpair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 7;
        findPairs(arr, k);
    }

    public static void findPairs(int[] arr, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i : arr) {
            int j = k - i;
            if (set.containsKey(j)) {
                System.out.println("(" + i + "," + j + ")");
                System.out.println("(" + j + "," + i + ")");
            }
            set.put(i,i);
        }
    }
}
