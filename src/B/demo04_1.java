package B;

public class demo04_1 {
    public static void main(String[] args) {

        //总高度
        double total_m = 100.0;
        //小球经历的米数
        double total_sum = 0.0;
        for (int i = 0; i < 10; i++)
        {
            total_sum += total_m;
            total_m /= 2;
            total_sum += total_m;
        }
        //不需要计算第10次的反弹高度，所以减去
        total_sum -= total_m;
        System.out.printf("小球总共经历%lf米, 第10次反弹%lf米\n", total_sum, total_m);

    }

}
