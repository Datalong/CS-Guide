package jichu01.BasicSyntax.variable;
//数组操作，两种常见的异常 1数组下标越界异常 2空指针异常 原因1：使用了错误的下标访问数组中的元素 引用数据类型，某一个堆空间的引用变量中存储的其实是一个地址，没有指向任何的空间，这个引用变量的值是NULL 它也是引用数据类型默认的值
//NULLPointerException:空指针异常 原因2： 使用NULL进行空间访问 解决：实例化即可
public class CommonException {
    public static void main(String[] args){

        int[] array1 = {1,2,3,4,5};
        System.out.println(array1[2]); //使用一个错误的下标访问数组中的元素

        String[] array2 = new String[5];
        for (String s : array2) {
            System.out.println(s);
        }
        //空指针异常
        int[] array = {1,2,4,3};
        System.out.println(array[0]);
    }
}
