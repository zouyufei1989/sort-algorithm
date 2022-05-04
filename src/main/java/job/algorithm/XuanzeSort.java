package job.algorithm;

public class XuanzeSort extends Base {

    //public static void main(String[] args) {
    //    show();
    //    for (int i = 0; i < items.length - 1; i++) {
    //        int minIndex = i;
    //        for (int j = i + 1; j < items.length; j++) {
    //            if (items[minIndex] > items[j]) {
    //                minIndex = j;
    //            }
    //        }
    //        swap(minIndex, i);
    //        show();
    //    }
    //}

    public static void main(String[] args) {
        new XuanzeSort().sort();
    }

    @Override
    void exec() {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < items.length; j++) {
                if (items[minIndex] > items[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(minIndex, i);
            }
        }
    }
}
