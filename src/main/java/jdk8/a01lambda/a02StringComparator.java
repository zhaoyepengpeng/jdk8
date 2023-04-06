package jdk8.a01lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @className: a02StringComparator
 * @author: zhaoyepeng
 * @date: 2023-04-06 21:47:43
 **/
public class a02StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names.toString());

    }
}
