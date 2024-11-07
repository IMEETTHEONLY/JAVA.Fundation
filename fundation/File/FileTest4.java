package File;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {

        //牢记:做递归的时候学会用调试功能
        /*
        *
        *       删除多级文件夹
        *       mkdir只能删除空文件夹,所以说递归判断，如果说是文件就直接删除，
        * 如果说是文件夹然后递归条件就是判断当前目录是否为空，如果说为空就删除并返回
        * */

        //调用函数
         mutipleDelete(new File("C:\\FileTest\\bbb"));


    }

    //递归三要素之一:函数参数和返回值是bool类型，如果说为true删除成功   参数是要删除的目录
    public static  void mutipleDelete(File src){

        //先获取src目录里面的所有文件和目录
        File[] files = src.listFiles();



        //三要素之三:递归规则
        //如果说是文件直接删除，如果说是目录就递归

        for (File file : files) {
            //如果说是文件直接删除即可
            if(file.isFile()){
                file.delete();
            }

            else {
                //目录进行递归操作
            mutipleDelete(file);
            }

        }

        //三要素之二:结束条件，当目录去遍历的时候获得的是只有文件(会在本层删除不进入递归)或者是什么都没有的时候就代表此时文件夹可以被删除了
        //此时就跳出for执行src删除操作

        //这个逻辑就是先把目录里面的东西删除完毕了，再来递归返回删自己，此时自己就是空目录
        src.delete();

    }
}
