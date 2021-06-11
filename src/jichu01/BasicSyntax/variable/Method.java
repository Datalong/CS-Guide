/*package BasicSyntax.variable;

public class Method {
   public static void main(String[] args) {
      // int sum = add(10, 20);

       // System.out.println("和是："+sum);
       // print();

       add(1);
       System.out.println(mutply(5));

      // System.out.println(sum(n:100));
   }

  public static int add(int num1, int num2){//告诉调用方结束后得到整形结果 改为int
       int sum = num1 + num2;

       return sum;//return num1 + num2 return 还有表示方法的结束 void 后面可写return;
   }

    public static void print() {
        System.out.println("This is my First Method");
    }

    //重载
    public static void add() {
        System.out.println("add()");
    }

    public static void add(int a) {
        System.out.println("add(int)");
    }

    public static void add(int a,int b) {
        System.out.println("add(int_int)");
    }

    public static void add(String s) {
        System.out.println("add(String)");
    }
    //递归 计算数的阶乘
    public static int mutply(int num){
        if(num == 1){ //设置出口条件
            return 1;
        }
       return num * mutply(num:num-1){//递进与回归

        }
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n  + sum(n:=n-1);
    }

}*/