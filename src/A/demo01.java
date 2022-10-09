package A;

//不可用


public class demo01 {
    public static void main(String[] args) {
        String s="01234567891";
        String temp="";
        temp=s.replace(s.substring(3, 8), "*****");
        System.out.println(temp);
    }
}
