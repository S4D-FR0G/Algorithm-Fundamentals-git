package TEST;

import java.util.ArrayList;
import java.util.Collections;

public class 将一个数组逆序输出 {
    public static void main(String[] args) {
        ArrayList<Number> list=new ArrayList<>();
        list.add(0,1);
        list.add(1,3);
        list.add(2,44);
        list.add(3,22);
        list.add(4,77);
        list.add(5,99);

        System.out.println(list);

        ArrayList<Number> list1=new ArrayList<>();
        /*int j= list.size()-1;
        for (int i = 0; i < j; i++) {
//            list.add(0);
                list1.set(j,list.get(i));
                j--;
        }*/
        Collections.reverse(list);
        System.out.println(list);
    }
}
