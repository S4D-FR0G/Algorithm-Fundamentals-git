package C;

//noooooooo error
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//任意输入一个整数（不低于 6 位）输出去掉重复数字后的整数.输入 12312，输出 3。
public class demo02_1 {
    public static void main(String[] args) {
        System.out.println("请输入一串不小于六位数的整数：");
        int num;
        Scanner input=new Scanner(System.in);
        String scan= input.next();

        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = scan.length()-1; i >=0 ; i--) {
            num=Integer.parseInt(scan);
            int v = num%10;
            num/=10;
            //arr.add(i,v);
            System.out.println(arr);
        }

            int i=scan.length()-1;
        //数组最后一位下标，开始往前遍历赋值
/*        do{
            num=Integer.parseInt(scan);
            int v = num%10;
            num/=10;
            arr.add(0);
            arr.set(i,v);
            i--;
        }while (i>=0);*/
        System.out.println(arr);



        //例子
/*        ArrayList<String> sites=new ArrayList<String>();
        sites.add("Google");
        sites.add("runoob");
        sites.add("zhihu");
        sites.add("facebook");
        sites.set(2,"wiki");//直接把第三个覆盖掉
//        sites.remove(3);
        System.out.println(sites);
        //计算大小.size()
        System.out.println(sites.size());
        //for迭代你数组列表中的元素
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }*/
    }

    //----------------
    // 引入 HashMap 类
   /* public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites.get(3));
//            Sites.remove(1);
//            System.out.println(Sites);
//            Sites.clear();
//            System.out.println(Sites);

        //输出key和value
        for (Integer i : Sites.keySet()) {
            System.out.println("key:"+i+"  value:"+Sites.get(i));
        }
//            返回所有value值
        for (String value: Sites.values()) {
            //输出每个value
            System.out.print(value+", ");
        }
    }*/
}
