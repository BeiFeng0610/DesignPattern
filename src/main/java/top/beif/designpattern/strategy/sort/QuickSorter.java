package top.beif.designpattern.strategy.sort;

/**
 * @author 16116
 */
public class QuickSorter implements Sorter {
    private Comparable[] data;

    @Override
    public void sort(Comparable[] data) {
        this.data = data;
        qsort(0, data.length - 1);
    }

    private void qsort(int pre, int post) {
        int savedPre = pre;
        int savedPost = post;

        Comparable mid = data[(pre + post) / 2];
        do {
            while (data[pre].compareTo(mid) < 0) {
                pre++;
            }
            while (mid.compareTo(data[post]) < 0) {
                post--;
            }
            if (pre <= post) {
                Comparable tmp = data[pre];
                data[pre] = data[post];
                data[post] = tmp;
                pre++;
                post--;
            }
        } while (pre <= post);

        if (savedPre < post) {
            qsort(savedPre, post);
        }
        if (pre < savedPost) {
            qsort(pre, savedPost);
        }

    }
}
