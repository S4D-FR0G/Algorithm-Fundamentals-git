package TEST;

import java.util.ArrayList;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner get=new Scanner(System.in);
        //String str=get.nextLine();
        String str=get.next();
        String[] srr=str.split("");
        ArrayList<Number> list=new ArrayList<>();
        for (int i = 0; i < srr.length; i++) {
            list.add(Integer.valueOf(srr[i]));
        }
        System.out.println(list);
        get.close();
    }
}
