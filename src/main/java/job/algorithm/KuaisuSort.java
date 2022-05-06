package job.algorithm;

public class KuaisuSort extends Base {

    public static void main(String[] args) {
        new KuaisuSort().sort();
    }

    @Override
    void exec() {
        sort(0, items.length - 1);
    }

    private void sort(int l, int r) {
        if (l >= r) {
            return;
        }

        // 此操作后，index左侧都小于items[index], index右侧都大于items[index]
        int index = partition(l, r);

        //再对两侧递归排序
        if (l < index - 1) {
            sort(l, index - 1);
        }

        if (index + 1 < r) {
            sort(index + 1, r);
        }
    }

    private int partition(int l, int r) {
        //以第一个元素为基准，左右来回依次排序
        int base = items[l];

        while (l < r) {
            // 先从右边开始排序，因为 items[l]已经缓存到base变量
            while (l < r && items[r] > base) {
                r--;
            }
            //如果发现右侧来值小于base的，存入items[l] （原items[l]已经缓存到base）
            if (l < r) {
                items[l] = items[r];
                l++;
            }

            //如果发现左侧来值大于base的，存入items[r] （原items[r]已经缓存到items[l]）
            while (l < r && items[l] < base) {
                l++;
            }
            if (l < r) {
                items[r] = items[l];
                r--;
            }
        }
        items[l] = base;
        return l;
    }

}
