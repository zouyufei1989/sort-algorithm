package job.algorithm;

public class XierSort extends Base {

    public static void main(String[] args) {
        show();
        for (int gap = items.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < items.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (items[j + gap] < items[j]) {
                        swap(j + gap, j);
                    }
                }
            }
        }
        show();
    }
}
