package TEST;

import java.util.ArrayList;
import java.util.Scanner;

public class tset_scan_nextLine {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner get=new Scanner(System.in);
        String str= get.next();
//        String str=get.nextLine();//将此扫描仪推进到当前行并返回跳过的输入。
        // 此方法返回当前行的其余部分，不包括末尾的任何行分隔符。
        // 该位置设置为下一行的开头。
        //由于该方法继续搜索通过输入寻找行分隔符的输入，所以如果不存在行分隔符，则它可以缓冲搜索行的所有输入，以跳过该行。
        //结果:被跳过的行
        String[] srr=str.split("");
        System.out.println(srr);
        System.out.println(str);
        /*
        ArrayList<Number> list=new ArrayList<>();
        for (int i = 0; i < srr.length; i++) {
            list.add(Integer.valueOf(srr[i]));
        }
        System.out.println(list);
        get.close();*/
    }
}
