package job.algorithm;

public class CharuSort extends Base {

    public static void main(String[] args) {
        new CharuSort().sort();
    }

    @Override
    void exec() {
        for (int i = 1; i < items.length; i++) {
            int current = items[i];
            int j = i - 1;
            while (j >= 0 && current < items[j]) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = current;
        }
    }
}
