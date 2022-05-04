package job.algorithm;

public class XierSort extends Base {

    public static void main(String[] args) {
        new XierSort().sort();
    }

    @Override
    void exec() {
        for (int gap = items.length / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < items.length; i++) {
                int current = items[i];
                int j = i;
                while (j - gap >= 0 && current < items[j - gap]) {
                    items[j] = items[j - gap];
                    j -= gap;
                }
                items[j] = current;
            }
        }
    }
}
