package TEST;
/*
数组可以作为方法的参数
当调用方法时，向方法的小括号传参，传递进去的其实时数组的地址值
*/
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        System.out.println(array);//地址值
        printArray(array);
        System.out.println("===========");
        printArray(array);
        System.out.println("===========");
        printArray(array);
    }
    /*
    * 三要素
    * 返回值类型：只是打印，不需要进行计算，没有结果，用void
    * 方法名称:printArray
    * 参数列表:必须给我数组，才能打印其中的元素
    * */
    public static void printArray(int[] array){//int[] ---void  也可以是其他
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
