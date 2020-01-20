package job.algorithm;

import jdk.nashorn.internal.objects.NativeJSON;

public class Test {

    public static void main(String[] args) {
        int i = 1;
        int[] arr = new int[]{2, 4, 6, 8, 10};
        int[] arr1 = new int[5];

        arr1[i] = arr[++i] - i;

        show(arr1);
    }

    static void show(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println("]");
    }
}
