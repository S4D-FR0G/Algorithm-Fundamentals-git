package C;
//nooooooooo
import java.util.ArrayList;
import java.util.Scanner;

public class demo02_arraylist_jishu {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        String str=get.next();
        String[] srr=str.split("");
        ArrayList<Number> list=new ArrayList<>();

        for (int i = 0; i < srr.length ; i++) {
            list.add(Integer.valueOf(srr[i]));
        }
//        System.out.println(list);
        get.close();
        //任意输入一个整数（不低于 6 位），输出去掉重复数字后的整数.

        //temp
//        int[] temp=new int[str.length()];

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size()-1; j++) {
                if ( list.get(i)==list.get(j)) {
                    list.remove(j);//先删除J，J在I的前面，所以先删除J不会影响数组序号
                    list.remove(i);
                    //无法删除奇数个相同的数   //不急着删除，将重复的key保存在另一个数组里，稍后从后到前逐一删除
                   /* for (int k = 0; k < list.size() ; k++) {
                        temp[k]=i;
                    }*/

                }
            }
        }
        //temp数组
//        System.out.println(temp);

        System.out.println(list);

    }


}

