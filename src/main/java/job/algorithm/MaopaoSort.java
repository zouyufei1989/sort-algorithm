package job.algorithm;

public class MaopaoSort extends Base {

    public static void main(String[] args) {
        new MaopaoSort().sort();
    }


    @Override
    void exec() {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }
}
