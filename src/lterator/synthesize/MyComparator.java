package lterator.synthesize;

import java.util.Comparator;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        final Student student1 = (Student) o1;
        final Student student2 = (Student) o2;
        if (student1.getAge() < student2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
