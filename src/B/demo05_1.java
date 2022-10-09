package B;

public class demo05_1 {
    public static void main(String[] args) {
        float up=2;//分子
        float down=1;//分母
        float fraction=up/down;//分数
        float temp=0;//交换数
        float sum=0;//总和
        for (int i = 0; i <30; i++) { //前面20项
            sum+=fraction; //分数相加
            temp=up+down; //先把分子分母的和赋值给一个交换数， 不能马上赋值给分子， 因为分子的值下面还有用
            down=up;   //把分子的值赋值给下一下的分母
            up=temp;  //把交换数的值赋值给下一项分子
            fraction=up/down;//下一项的分数值
        }
        System. out.println(""+sum);
    }
}
