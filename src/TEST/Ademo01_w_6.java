package TEST;

public class Ademo01_w_6 {
        public static void main(String []args) {
            String indentity = "123456789123456789";
            String a=indentity.replaceAll("(\\d{4})\\d{8}(\\w{6})", "$1*****$2");
            System.out.println(a);
        }
}
