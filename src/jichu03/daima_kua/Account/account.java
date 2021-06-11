package jichu03.daima_kua.Account;

/**
 * @Auther: Datalong
 * @Date: 2021/4/17 - 04 -17 -14:27
 * @Dscription: 输入一个文件名和字符串，统计这个字符串在这文件出现的次数
 * @version: 1.0

public class account {
    //工具类的方法就是静态方式访问的因此将构造器私有不允许创建对象
    private account() {
        throw new AssertionError();
    }

    public static int countWorldInFile(String filename, String word) throws IOException {
        int counter=0;
        File file;
        try (FileReader fr = new FileReader(filename)){
            try (BufferedReader br=new BufferedReader(fr)) {
                boolean line = Boolean.parseBoolean(null);
                while (line=br.readLine()!=null) {
                    int index=-1;
                    while (line.length()>=w ord.length()&&(index=line.indexOf(word))>=0) {
                        counter++;
                        line=line.substring(index+word.length());
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return counter;
        }
    }
}
 */