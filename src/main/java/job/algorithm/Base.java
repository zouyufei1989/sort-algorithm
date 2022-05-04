package job.algorithm;

/**
 * Hello world!
 * https://blog.csdn.net/qq_41999592/article/details/119771677
 */
public abstract class Base {

    protected static int[] items = new int[]{154, 221, 123, 98, 87, 65, 143, 54, 92, 222, 123, 143, 67, 99};

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

    void sort() {
        show();
        exec();
        show();
    }

    abstract void exec();
}
