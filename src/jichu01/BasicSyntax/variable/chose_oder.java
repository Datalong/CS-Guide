package jichu01.BasicSyntax.variable;
 //选择排序
public class chose_oder {
     public static void main(String[] args) {
         int[] array = {1, 8, 5, 7, 3, 9, 18, 26, 15, 4};
         int[] array1 = new int[]{45,12,3,78,67,22,0};
         int[] array2 = new int[]{45,12,3,78,67,22,0};

         //sort1(array);
         //sort2(array);
         sort3(array);
         sort4(array1);
         sort5(array2);

         for (int i : array) {//JDK5加入的特性：增强for循环
             System.out.print(i + ",");
         }
     }

     public static void sort1(int[] array) {//只是修改在堆区数组元素的值 无需返回值 语法：固定一个下标，用这个下标的元素依次和后续每个元素进行比较，如果满足交换条件 则交换
         //控制循环比较会发生多少趟
         for (int i = 1; i < array.length - 1; i++) {
             //遍历每个需要和第i位元素进行比较的下标
             for (int j = i + 1; j < array.length; j++) {

                 if (array[i] > array[j]) {
                     int tmp = array[i];
                     array[i] = array[j];
                     array[j] = tmp;
                 }
             }
         }
     }

     //选择排序优化：不管第一个元素与剩下其他元素交换几次，找出整个元素最小值，固定最小值，再反复；min始终指向最小值 min和j比较，一次循环i位进1位
     public static void sort2(int[] array) {
         for (int i = 0; i < array.length - 1; i++) {
             //声明一个变量，用来记录剩余元素的最小值所在的下标
             int min = i;
             for (int j = i + 1; j < array.length; j++) {
                //让第j位的元素和记录的最小值进行比较
                 if(array[j] < array[min]){
                     //更新最小值下标
                     min = j;
                 }
             }
             if(i != min){
                 int tmp = array[i];
                 array[i] = array[min];
                 array[min] = tmp;
             }

         }
     }
    //冒泡排序
     public static void sort3(int[] array){
         for (int i = 0; i < array.length-1; i++) {//有多少趟
             for (int j = 0;j < array.length-1-i;j++){//控制每一趟的比较发生了多少次
                 //依次比较两个相邻的元素
             if(array[j] > array[j+1]){
                 int tmp = array[j];
                 array[j] = array[j+1];
                 array[j+1] = tmp;
             }
             }

         }
     }
     //直接排序
     public static void sort4(int[] array1){
         for(int i=0; i<array1.length-1; i++){
             //循环遍历有多少
             for(int j=i+1;j<array1.length; j++){
                 //遍历每个需要和第i位元素进行比较的下标
                 if(array1[i] > array1[j]){
                     int tmp = array1[i];
                     array1[i] = array1[j];
                     array1[j] = tmp;
                 }

             }
         }
     }

     //选择排序优化：不管第一个元素与剩下其他元素交换几次，找出整个元素最小值，固定最小值，再反复；m始终指向最小值 m和j比较，一次循环i位进1位
     public static void sort5(int[] array2){
         for (int m=0; m<array2.length-1; m++){
             //声明一个变量，用来记录剩余元素的最小值所在的下标
             int Min = 0;
             for(int n=m+1; n<array2.length;n++){
                 if (array2[m] < array2[Min]){
                     Min = m;
                 }
             }
             if(m != Min){
                 int tmp1 = array2[Min];
                 array2[Min] = array2[m];
                 array2[m] = tmp1;
             }
         }
     }
 }
