package S4NDMAN;

import java.util.Scanner;

public class admin_checkin {
    public static void main(String[] args) {
/*        System.out.println("请输入用户名称：");
        Scanner input=new Scanner(System.in);
        String user= input.next();
        System.out.println("请输入密码：");
        int passwd= input.nextInt();*/
//        System.out.println(user+passwd);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名称：");
            Scanner input=new Scanner(System.in);
            String user= input.nextLine();
//            String username="admin";

            System.out.println("请输入密码：");
            Scanner sc=new Scanner(System.in);
            int passwd= sc.nextInt();
            int p=123;

            if (passwd ==p && user.equals("admin")) {//字符串使用equals方法
//            if (passwd ==p && user.equals(username)) {
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("账号或密码错误！");
//                break;
            }
        }

    }
}
