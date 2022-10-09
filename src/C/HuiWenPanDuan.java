package C;
//回文
import java.util.Scanner;
public class HuiWenPanDuan {
        public static void main(String[] args) {
            System. out.println("请输入一个五位数： ");
            Scanner in=new Scanner(System.in);
            int input=in.nextInt();//获取输入的数字
            int arr[]=new int[5];//创建一个大小为5 的数组
            int i=4;
            do {//逐次取位---将值赋给数组
                arr[i]=input%10;
                input/=10;
                i--;
            } while (i>=0);//这里的结束条件写input！ =0也是可以的
            //System.out.println(Arrays. toString(arr));
            if (arr[0]==arr[4]&&arr[1]==arr[3]) {
                System. out.println("输入的数是回文数字！ ");
            }else {
                System. out.println("输入的数不是回文数字！ ");
            }
            in.close();
        }
}
