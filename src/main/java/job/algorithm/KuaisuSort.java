package job.algorithm;

public class KuaisuSort extends Base {

    public static void main(String[] args) {
        show();
        sort(0, items.length - 1);
        show();
    }

    static void sort(int left, int right) {
        int partion = partion(left, right);
        if (partion - 1 > left) {
            sort(left, partion - 1);
        }

        if (partion + 1 < right) {
            sort(partion + 1, right);
        }
    }

    static int partion(int left, int right) {
        int base = items[left];
        while (left < right) {
            while (left < right && items[right] > base) {
                right--;
            }
            if (left == right) {
                break;
            }
            items[left++] = items[right];

            while (left < right && items[left] < base) {
                left++;
            }
            if (left == right) {
                break;
            }
            items[right--] = items[left];
        }

        items[left] = base;
        return left;
    }

    @Override
    void exec() {

    }
}
