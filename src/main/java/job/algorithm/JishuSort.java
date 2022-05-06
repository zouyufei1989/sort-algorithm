package job.algorithm;

import java.util.stream.IntStream;

public class JishuSort extends Base {

    public static void main(String[] args) {
        new JishuSort().sort();
    }

    @Override
    void exec() {
        final int min = IntStream.of(items).min().getAsInt();
        final int max = IntStream.of(items).max().getAsInt();
        int[] bucket = new int[max - min + 1];

        for (int i : items) {
            bucket[i - min]++;
        }

        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == 0) {
                continue;
            }
            for (int r = 0; r < bucket[i]; r++) {
                items[index++] = i + min;
            }
        }
    }
}
