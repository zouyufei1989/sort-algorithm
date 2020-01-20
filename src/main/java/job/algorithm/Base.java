package job.algorithm;

/**
 * Hello world!
 */
public class Base {

    protected static int[] items = new int[]{154, 221,123, 98, 87, 65, 143, 54, 92, 222, 123, 143, 67, 99};

    protected static void swap(int i, int j) {
        int tmp = items[i];
        items[i] = items[j];
        items[j] = tmp;
    }

    protected static void show() {
        for (int num : items) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
