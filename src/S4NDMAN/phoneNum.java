package S4NDMAN;

import java.util.Scanner;

public class phoneNum {
    public static void main(String[] args) {
        System.out.println("请输入7位手机号：");
        Scanner input=new Scanner(System.in);
        String num=input.next();
        String phonenum=num.substring(0,3)+"****"+num.substring(7,num.length());//括号的区间 (]
        System.out.println(phonenum);
    }
}
