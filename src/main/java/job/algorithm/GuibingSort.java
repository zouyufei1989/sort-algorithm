package job.algorithm;

public class GuibingSort extends Base {

    public static void main(String[] args) {
        show();
        sort(0, items.length - 1);
    }


    static void sort(int l, int r) {
        if (l == r) {
            return;
        }

        int m = l + (r - l) / 2;

        sort(l, m);
        sort(m + 1, r);
        merge(l, m, r);
        show();
    }

    static void merge(int l, int m, int r) {
        int[] tmp = new int[r - l + 1];
        int index = 0;
        int L = l, R = m + 1;

        while (L <= m && R <= r) {
            if (items[L] <= items[R]) {
                tmp[index++] = items[L++];
            } else {
                tmp[index++] = items[R++];
            }
        }

        while (L <= m) {
            tmp[index++] = items[L++];
        }

        while (R <= r) {
            tmp[index++] = items[R++];
        }

        while (l <= r) {
            items[l] = tmp[tmp.length - (r - l + 1)];
            l++;
        }
    }

}
