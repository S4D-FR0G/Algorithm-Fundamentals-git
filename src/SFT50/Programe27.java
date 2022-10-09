package SFT50;
//100内素数------------wrong
public class Programe27 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 2; i < 100; i++) {
            if (IsRight(i)){
                System.out.print(i+" ");
                sum++;
                if (sum%10==0){//十个一行
                    System.out.println();
                }
            }
        }
        System.out.println("\n共有素数："+sum+"个");
    }
    private static boolean IsRight(int i) {
        for (int j=2;j<Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
