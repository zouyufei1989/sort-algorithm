package job.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class TongSort extends Base {

    public static void main(String[] args) {
        //show();
        //
        //int max = items[0], min = items[0];
        //for (int i : items) {
        //    if (i > max) {
        //        max = i;
        //    }
        //    if (i < min) {
        //        min = i;
        //    }
        //}
        //
        ////分4个桶
        //List<List<Integer>> buckets = new ArrayList<>();
        //buckets.add(new ArrayList<>());
        //buckets.add(new ArrayList<>());
        //buckets.add(new ArrayList<>());
        //buckets.add(new ArrayList<>());
        //
        //int bucketCapacity = (max - min + 1) / buckets.size() + 1;
        //System.out.println(bucketCapacity);
        //
        //for (int i : items) {
        //    buckets.get((i - min) / bucketCapacity).add(i);
        //}
        //
        //for (List<Integer> bucket : buckets) {
        //    System.out.println(bucket);
        //    Collections.sort(bucket);
        //}
        //
        //List<Integer> integers = buckets.stream().reduce((i, j) -> {
        //    i.addAll(j);
        //    return i;
        //}).get();
        //
        //System.out.println(integers);

        new TongSort().sort();

    }

    @Override
    void exec() {
        final int min = IntStream.of(items).min().getAsInt();
        final int max = IntStream.of(items).max().getAsInt();

        List<List<Integer>> buckets = new ArrayList<>();

        int bucketSize = 15;
        int bucketCount = (max - min) / bucketSize + 1;
        IntStream.range(0, bucketCount).forEach(i -> buckets.add(new ArrayList<>()));

        // split numbers to buckets, buckets[0]里的每个元素> buckets[1]中的
        for (int item : items) {
            int bucketIndex = (item - min) / bucketSize;
            buckets.get(bucketIndex).add(item);
        }

        for (List<Integer> bucket : buckets) {
            System.out.println(bucket);
        }

        int index = 0;
        // sort elements of each bucket
        for (List<Integer> bucket : buckets) {
            if (bucket.size() > 1) {
                bucket.sort(Comparator.naturalOrder());
            }
            for (Integer integer : bucket) {
                items[index++] = integer;
            }
        }

    }
}
