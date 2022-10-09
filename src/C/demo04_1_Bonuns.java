package C;
import java.util.Scanner;
public class demo04_1_Bonuns {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        System.out.println("请输入利润：");
        Scanner scan=new Scanner(System.in);
        int profit=scan.nextInt();
        double bonus=0;
        System.out.println("(万元)");
        if(profit<=10){
            bonus=profit*0.1;
        }else if(profit>10&&profit<=20) {
            bonus=10*0.1+(profit-10)*0.075;
        }else if(profit>20&&profit<=40){
            bonus=10*0.1+10*0.075+(profit-20)*0.05;
        }else if(profit>40&&profit<=60){
            bonus=10*0.1+10*0.075+20*0.05+(profit-40)*0.03;
        }else if(profit>60&&profit<=100){
            bonus=10*0.1+10*0.075+20*0.05+40*0.03+(profit-60)*0.015;
        }else{
            bonus=10*0.1+10*0.075+20*0.05+40*0.03+60*0.015+(profit-100)*0.01;
        }
        System.out.println(bonus);
        scan.close();
    }
}

