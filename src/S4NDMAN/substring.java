package S4NDMAN;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String num=input.next();

        String pn=num.substring(0,3)+"****"+num.substring(7,num.length());
        System.out.println(pn);
    }
}
