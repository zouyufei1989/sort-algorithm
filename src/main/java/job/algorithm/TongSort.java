package job.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TongSort extends Base {

    public static void main(String[] args) {
        show();

        int max = items[0], min = items[0];
        for (int i : items) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        //分4个桶
        List<List<Integer>> buckets = new ArrayList<>();
        buckets.add(new ArrayList<>());
        buckets.add(new ArrayList<>());
        buckets.add(new ArrayList<>());
        buckets.add(new ArrayList<>());

        int bucketCapacity = (max - min + 1) / buckets.size() + 1;
        System.out.println(bucketCapacity);

        for (int i : items) {
            buckets.get((i - min) / bucketCapacity).add(i);
        }

        for (List<Integer> bucket : buckets) {
            System.out.println(bucket);
            Collections.sort(bucket);
        }

        List<Integer> integers = buckets.stream().reduce((i, j) -> {
            i.addAll(j);
            return i;
        }).get();

        System.out.println(integers);


    }
}
