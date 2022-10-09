package B;
//一球从 100 米高度自由落下，每次落地后反跳回原高度的一半；再落下，
// 求它在第 10 次落地时，共经过多少米？第 10 次反弹多高？
public class demo04 {
    public static void main(String[] args) {
        float h=100;
        float n=10;

        float sum=h;
        h/=2;
        for (int i = 2; i < n ; i++) {
            sum+=h*2;
            h/=2;
        }
        System.out.println("在"+100+"米，经过"+n+"次后，" +
                "能反弹："+h+"米，经过的距离："+sum);

    }
}
