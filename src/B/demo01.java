package B;
import java.util.Scanner;
//任意输入一段字符串，
// 输出字符串的长度，
// 中文个数，
// 小写字母个数，
// 大写字母个数，
// 数字个数，
// 符号个数。
public class demo01 {
    public static void main(String[] args) {
        //字符串使用length
        int chinese=0;//中文
        int letter=0;//小写字母
        int Letter=0;//大写字母
        int num=0;//数字
        int space=0;//符号
        int NUT=0;

        System.out.println("请输入一串字符串：");
        Scanner input=new Scanner(System.in);
        String str=input.next();//从键盘获取一行字符串
        //将字符串的每一个值赋给数组
        char arr[]=str.toCharArray();

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48&& arr[i]<=57) {//tips:查阅ASCII码表
                num++;
            }else if (arr[i]>=65&&arr[i]<=90){
                Letter++;
            }else if (arr[i]>=97&&arr[i]<=122){
                letter++;
            }else if (arr[i]>=32&&arr[i]<=47 &&arr[i]>=58&&arr[i]<=64 && arr[i]>=91&&arr[i]<=96&&arr[i]>=123&&arr[i]<=126){
                //&&arr[i]>=128&&arr[i]<=255   ascii码表不计127以后的编码
                space++;
            }else if(arr[i]>=0 && arr[i]<=31 &&arr[i]==127){
                NUT++;
            }else {
                chinese++;
            }
        }
        System.out.println("数字："+num);
        System.out.println("大写："+Letter);
        System.out.println("小写："+letter);
        System.out.println("符号："+space);
        System.out.println("中文："+chinese);
        input.close();
    }
}