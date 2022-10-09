package S4NDMAN;
//分数数列相加

public class fenShuShuLieXiangJiao {
    public static void main(String[] args) {
        float sum=0;
        float up=2;
        float down=1;
        float fr=up/down;
        float temp=0;
        for (int i = 0; i < 30; i++) {
            sum+=fr;
            temp=up+down;
            down=up;
            up=temp;
            fr=up/down;

        }
        System.out.println(" "+sum);
    }
}
