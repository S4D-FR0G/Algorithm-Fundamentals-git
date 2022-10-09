package TEST;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_Reverse {
    /**
     *
     * 反转一个List，关键是使用Collections工具类
     *
     * @author Phil
     *
     */
        public static void main(String[] args) {
            ArrayList<Integer> lists = new ArrayList<Integer>();
            // 初始化10个测试数据
            for (int i = 0; i < 10; i++) {
                lists.add(i);
            }

            // 打印测试数据
            for (Integer n : lists) {
                System.out.print(n + " ");
            }

            // 反转lists
            Collections.reverse(lists); //是Collections 有s！！！！

            // 换行打印
            System.out.println();

            // 打印测试数据
            for (Integer n : lists) {
                System.out.print(n + " ");
            }
        }



}
