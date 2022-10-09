package SFT50;

import java.util.Scanner;

// question:
// (input2.equals("h"))------20行
public class Programe26 {
    public static void main(String[] args) {
        System.out.println("请输入第一个英文字符:");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        String input2=" ";
        switch(input){
            case "m":
                System.out.println("Moday");
                break;
            case "t":
                System.out.println("请输入第二个字母");
                input2= scanner.next();
                if(input.equals("u")){
                    System.out.println("Tuesday");
                }else if (input2.equals("h")){
                    System.out.println("Thursday");
                }else {
                    System.out.println("你输入的子母有误！");
                }break;
            case "w":
                System.out.println("Wednesday");
                break;
            case  "f":
                System.out.println("Firday");
                break;
            case "s":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("你输入的字母不正确！");
                break;
        }
        scanner.close();
    }
}
