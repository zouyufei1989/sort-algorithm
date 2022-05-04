package job.algorithm;

public class GuibingSort extends Base {

    public static void main(String[] args) {
        new GuibingSort().sort();
    }

    @Override
    void exec() {
        sort(0, items.length - 1);
    }

    void sort(int l, int r) {
        if (l >= r) {
            return;
        }

        int m = l + (r - l) / 2;
        // sort left part
        sort(l, m);
        // sort right part
        sort(m + 1, r);
        // merge sorted numbers back to items
        merge(l, m, r);
    }

    private void merge(int l, int m, int r) {
        int[] tmp = new int[r - l + 1];

        int i = 0;
        int L = l, R = m + 1;

        // merge left and right
        while (L <= m && R <= r) {
            if (items[L] < items[R]) {
                tmp[i] = items[L];
                L++;
            } else {
                tmp[i] = items[R];
                R++;
            }
            i++;
        }

        // merge left if it remains any
        while (L <= m) {
            tmp[i] = items[L];
            L++;
            i++;
        }
        // merge right if it remains any
        while (R <= r) {
            tmp[i] = items[R];
            R++;
            i++;
        }

        // set tmp back to items
        for (i = 0; i < tmp.length; i++) {
            items[i + l] = tmp[i];
        }

    }
}
