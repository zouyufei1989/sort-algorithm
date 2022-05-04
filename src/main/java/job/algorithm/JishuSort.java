package job.algorithm;

public class JishuSort extends Base {

    public static void main(String[] args) {
        show();
        int max = items[0], min = items[0];
        for (int i : items) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        int[] buckets = new int[max - min + 1];
        for (int i : items) {
            buckets[i - min]++;
        }

        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i]; j++) {
                System.out.print(i + min);
                System.out.print("\t");
            }
        }

    }

    @Override
    void exec() {

    }
}
