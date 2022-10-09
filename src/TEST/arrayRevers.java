package TEST;
//数组反转

/*
* 原数组：[1,2,3,4]
* 反转后：[4,3,2,1]
*
* 不能用新数组，只能用原来唯一一个数组。
*
* 思路：其实就是对称位置元素交换
* 如何交换--三步交换
* 何时停止：
*   min=max  or  min>max
* */
public class arrayRevers {
    public static void main(String[] args) {

        int[] array={10,20,30,40,50};
        //遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("======================");
        /*
        * 初始化语句 int min=0, max=array.length-1
        * 条件判断 min<max
        * 步进表达式 min++, max--
        * 循环体 用第三个变量倒手
        * */
        for (int min=0, max=array.length-1;min<max;min++, max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;//三行代码按顺序首尾相接
        }
        //打印输出数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



        /*int[] a=new int[4];
        int min=0;
        int max=a.length-1;
        int temp;
        for (int i = 0; i < a.length-1; i++) {
            temp=min;
            min=max;
            max=temp;
        }*/
    }
}
