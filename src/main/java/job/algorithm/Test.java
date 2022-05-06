package job.algorithm;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        IntStream.range(1, 1000)
                .parallel()
                .forEach(i -> {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(i + "->" + j);
                    }
                });

        System.out.println("done");

    }

}
