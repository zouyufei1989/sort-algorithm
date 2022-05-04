package job.algorithm;

public class DuiSort extends Base {

    public static void main(String[] args) {
        show();
        buildMax();

        for (int i = 0; i < items.length - 1; i++) {
            swap(0, items.length - i - 1);
            maxTop(0, items.length - i - 1);
        }

        show();
    }

    static void maxTop(int parentId, int lastIndex) {
        int max = parentId;

        int left = parentId * 2 + 1;
        if (left < lastIndex && items[left] > items[max]) {
            max = left;
        }

        int right = parentId * 2 + 2;
        if (right < lastIndex && items[right] > items[max]) {
            max = right;
        }

        if (max != parentId) {
            swap(max, parentId);
            maxTop(max, lastIndex);
        }
    }

    static void buildMax() {
        for (int i = (items.length - 1) / 2; i >= 0; i--) {
            maxTop(i, items.length);
        }
    }


    @Override
    void exec() {

    }
}
