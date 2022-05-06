package job.algorithm;

public class DuiSort extends Base {

    public static void main(String[] args) {
        new DuiSort().sort();
    }


    @Override
    void exec() {
        //创建大顶堆 - 整棵树root最大， 且每棵子树的根节点最大
        for (int i = (items.length - 1) / 2; i >= 0; i--) {
            heapify(i, items.length);
        }
        show();

        for (int i = 0; i < items.length - 1; i++) { //循环的轮数，每轮root和未排序的最后一个元素交换，并重新创建大顶树
            swap(0, items.length - 1 - i);
            heapify(0, items.length - i - 1); //注意：上一步已经交换的元素，所以这里的边界要比上一步多-1
        }
    }


    static void heapify(int parentNode, int boundary) {
        int maxIndex = parentNode;
        int leftChild = parentNode * 2 + 1;
        int rightChild = parentNode * 2 + 2;

        if (leftChild < boundary && items[maxIndex] < items[leftChild]) {
            maxIndex = leftChild;
        }

        if (rightChild < boundary && items[maxIndex] < items[rightChild]) {
            maxIndex = rightChild;
        }
        // 如果当前就是大顶树，则结束递归 - 前提是其后面的子树都是大顶树，这也就是为啥在初始化大顶树的时候要倒着来
        if (maxIndex == parentNode) {
            return;
        }
        swap(maxIndex, parentNode);
        heapify(maxIndex, boundary);
    }
}
