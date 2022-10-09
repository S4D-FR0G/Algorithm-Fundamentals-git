package A;
//错误 why?????
public class demo02_IsRight_0_100 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 2; i < 100;i++) {
            if (IsRight(i)) {//如果是素数就打印出来
                System.out.print(i+"  ");
                sum++;
                if (sum%10==0) {//十个一行
                    System.out.println();
                }
            }
        }

        System.out.println(" 共有素数："+sum+"个");
    }

//判断该数是不是素数

    private static boolean IsRight(int i) {
        for (int j = 2; j < Math.sqrt(i);j++) {
            if (i%j==0) {
                return false;//不是素数的话，马上返回false
            }
        }
        return true;
    }
}
