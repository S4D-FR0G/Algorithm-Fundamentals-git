package A;

public class demo01_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String phone = "13123456789";
        String phoneNumber=phone.substring(0,3)+"****"+phone.substring(7, phone.length());
/*        System.out.println("phone总长度"+phone.length());
        System.out.println("phone前3位"+phone.substring(0,3));
        System.out.println("phone中4位"+phone.substring(3,7));
        System.out.println("phone后4位"+phone.substring(7, phone.length()));*/
        System.out.println("phone中4*:"+phoneNumber);


    }

}
