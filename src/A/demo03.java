package A;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        String user="admin";
        int num=123;
        System.out.println("请输入用户名称");
        Scanner input=new Scanner(System.in);
        String u= input.next();
        System.out.println("请输入用户密码");
        Scanner inp=new Scanner(System.in);
        int p=input.nextInt();
        for (int i = 0; i < 3; i++) {
            if (p==num && user=="admin"){
                System.out.println("登录成功");
                System.out.println("谢谢使用");
                break;
            }else {
                System.out.println("登录失败");
                break;
            }
        }

    }
}
