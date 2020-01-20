package job.algorithm;

public class XuanzeSort extends Base {

    public static void main(String[] args) {
        show();
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[minIndex] > items[j]) {
                    minIndex = j;
                }
            }
            swap(minIndex, i);
            show();
        }
    }
}
