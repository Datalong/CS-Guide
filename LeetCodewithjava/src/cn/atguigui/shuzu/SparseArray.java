package cn.atguigui.shuzu;

/**
 * @Auther: Datalong
 * @Date: 2021/5/22 - 05 -22 -14:20
 * @Dscription: cn.atguigui.shuzu
 * @version: 1.0
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始的二维数组11 * 11
        //0:表示没有棋子 1表示黑子 2表示蓝子
        int chessArr1[][]=new int[11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        chessArr1[4][6]=2;
        //输出原始的二维数组
        System.out.println("原始的二维数组~");
        for (int[] row: chessArr1) {
            for (int data:row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //先遍历二维数组，直到非0数据的个数
        int sum=0;
        for (int i=0; i<11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j]!=0) {
                    sum++;
                }
            }
        }
        //创建对应的稀疏数组
        int sparseArr[][]=new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;

        sparseArr[0][2]=sum;

        //遍历二维数组将非零存到稀疏数组
        int count=0; //记录是第几个非0数据
        for (int i=0; i<11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j]!=0) {
                    count++;
                   sparseArr[count][0]=i;
                   sparseArr[count][1]=j;
                   sparseArr[count][2]=chessArr1[i][j];
                }
            }
        }
        //输出稀疏数组的形式
        System.out.println();
        System.out.println("得到的稀疏数组为...");
        for (int i=0;i<sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }
        System.out.println();

        //1 先读取第一行数据，根据它创建原始的二维数组
        int chessArr2[][]=new int[chessArr1[0][0]][chessArr1[0][1]];
        //输出恢复的二维数组
        System.out.println(chessArr2);
    }


}
