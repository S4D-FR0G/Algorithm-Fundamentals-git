package TEST;

import java.util.Scanner;
//next()与nextLine()区别
/*
next() 读取到有效字符后结束
对有效输入字符前的空白，方法会将其自动忽略
只要输入有效字符后才将其后的空白作为分隔符或者结束符
next()不能得到带有空格的字符串
===========
nextLine() 以enter作为结束符，nextLine()返回的是输入回车之前的所有字符
可获得空白
==========如果要获得int或者float类型的数据，在Scanner类中也有支持，BUT在输入之前最好先使用hasNextXxx()方法进行验证，在使用nextXxx()来读取
* */
public class hasNextXXX_NextXXX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }
}
