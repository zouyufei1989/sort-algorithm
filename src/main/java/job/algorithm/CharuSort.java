package job.algorithm;

public class CharuSort extends Base {

    public static void main(String[] args) {
        show();
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (items[j] < items[j - 1]) {
                    swap(j, j - 1);
                }
            }
            show();
        }
    }
}
