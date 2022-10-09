package C;
//It works, but······
import java.util.ArrayList;
import java.util.Scanner;
//任意输入一个整数（不低于 6 位），输出去掉重复数字后的整数.
public class demo02_arraylist {
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


        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size()-1; j++) {
                if ( list.get(i)==list.get(j)) {
                    list.remove(j);//先删除J，J在I的前面，所以先删除J不会影响数组序号
                    list.remove(i);
//无法删除奇数个相同的数   好像不只是不能删除奇数个
                }
            }
        }
        System.out.println(list);
    }
}
