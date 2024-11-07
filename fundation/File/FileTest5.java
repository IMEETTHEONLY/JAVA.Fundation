package File;

import java.io.File;
import java.util.HashMap;

public class FileTest5 {


    public static void main(String[] args) {

        /*
        *   统计一个文件夹里每个文件的个数并打印(考虑子文件夹)
        *
        *   基本思路:创建一个hashmap,然后保存键值对，然后从目录开始递归遍历，如果说遇见文件就截取最后四位作为键加入hashmap当中
        * */

        HashMap<String,Integer> h=new HashMap<>();
        acquireFileNums(new File("C:\\FileTest\\aaa"),h);
        System.out.println(h);



    }

    //递归三要素之一:返回值和函数参数
                //阿伟的代码是使用递归的下一层的返回值赋值给当层，这是一个很好的思路
                //我的思路是hashmap是值传递，所以说把它作为参数传递下去，让每一层函数去修改它的值，这样就不要在本层去处理下一层的数据了
    public static void acquireFileNums(File f,HashMap<String,Integer> h){

        //三要素之二结束条件，当访问到目录为空的时候就返回
        File[] files = f.listFiles();
        if(files==null){
            return;
        }

        //递归三要素之三,递归规则
        for (File file : files) {
            //如果说是文件就直接加入hashmap当中
            if(file.isFile()){
                String filename=file.getName();
               //获取文件后缀的方式，是以.为分隔符然后获取数组的最后一个元素,最后一个元素就是后缀
                String[] split = filename.split("\\.");
                String key=split[split.length-1];

                //判断这个key是否在hashmap当中存在，如果说不存在就初始化为1
                if(h.containsKey(key)){

                    //取出value的值++
                    int value=h.get(key);
                    value++;
                    h.put(key,value);
                }
                //此时这个key文件不存在，初始化为1
                else {
                    h.put(key,1);
                }
            }
            //如果说是文件就继续递归
            else {
                acquireFileNums(file,h);
            }
        }

    }
}
