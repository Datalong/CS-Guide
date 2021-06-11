package LanQiao_01;

//import jichu03.java_Bean.Summer.program_yu.print;

/**
 * @Auther: Datalong
 * @Date: 2021/6/5 - 06 -05 -21:48
 * @Dscription: LanQiao_01
 * @version: 1.0

public class 唯一成对的数 {
    public static void main(String[] args) {
        int N = 11;
        int[] arr = new int[];

        for (int i = 0; 1<arr.length-1; i++) {
            arr[i] = i+1;
        }
        //最后一个数，是随机数
        arr[arr.length-1] = new Random().nextInt(N-1)+1;
        //随机下标
        int index = new Random().nextInt(N);
      //Collections.swap(index(arr), index, arr.length-1);
        //Collections.swap(arr);


    }
}
 */


