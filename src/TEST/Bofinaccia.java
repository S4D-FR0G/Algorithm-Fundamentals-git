package TEST;

public class Bofinaccia {

    public static void main(String[] args) {
        Bofinaccia.f1(5);

    }

    public static int f1(int n){
        if (n<1){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }return f1(n-1)+f1(n-2);
    }
}


//如何运行