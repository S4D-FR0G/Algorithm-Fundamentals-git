package TEST;

import java.util.Arrays;
//逆序输出
public class niXu {
    public static void main(String[] args) {
        int[] arrA={1,3,44,22,77,99};
        int[] arrB=new int[arrA.length];//新建数组arrB 长度为arrA的长度
        int j=arrA.length;
        for (int i = 0; i < arrA.length; i++) { //此处arrA.length不可使用j替代,因为J在for中会变换，如果使用表达式作为循环退出条件，条件最好不要变
            arrB[i]=arrA[j-1];
            j--;
        }
        System.out.println("数组A逆序输出为："+ Arrays.toString(arrB));
        System.out.println("数组A逆序输出为："+ arrB);
    }
}
