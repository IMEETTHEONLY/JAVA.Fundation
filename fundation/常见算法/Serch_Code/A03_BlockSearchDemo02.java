package 常见算法.Serch_Code;

public class A03_BlockSearchDemo02 {

    public static void main(String[] args) {
        //这里其实是四个块，但是第二个块太小了，就合并到了第一个   21，18是第二个
        int[] arr={27,22,30,40,36,
                13,19,16,20,
                7,10,43,50,48};

        //1.把数据分块  分块的依据要后面的桶排序才知道

        //创建三个对象来管理对象
        Block b1=new Block(22,40,0,4);
        Block b2=new Block(13,20,5,8);
        Block b3=new Block(7,50,9,13);

        //定义一个数组存入三个块对象(索引表)
        Block[] blockArr={b1,b2,b3};

        //定义一个变量来存要查找的元素
        int num=30;


        //调用方法，传递索引表，数组，要查找的元素
        int index= getIndex(blockArr,arr,num);

        //打印index
        System.out.println(index);
    }

    //利用分块查找的原理，查询num的索引

    private static int getIndex(Block[] blockArr, int[] arr, int num) {
        //1.确定num在哪一块当中
        int indexBlock= findIndexBlock(blockArr,num);
        if(indexBlock==-1){
            //表示num不在数组当中
            return -1;
        }

        //2.获取这一块的起始索引和结束索引，查找块内
        int startIndex=blockArr[indexBlock].getStartIndex();
        int endIndex=blockArr[indexBlock].getEndIndex();


        //3.遍历大数组的索引
        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i]==num){
                //找到了
                return i;
            }
        }
        return -1;

    }


    //1.定义一个方法确定num在哪一块
    public static int findIndexBlock(Block[] blockArr,int num){
        //用基本查找寻找num索引,当num小于索引表的max，他就在当前块当中
        for (int i = 0; i < blockArr.length; i++) {
            //同时满足大于最小值和小于最大值，即在这个区间内
            if(num<=blockArr[i].getMax()&&num>=blockArr[i].getMin()){
                return i;
            }
        }
        return -1;
    }
}


class Block{
    private int min;  //最小值
    private int max;  //最大值
    private int startIndex;  //起始索引

    private int endIndex;  //结束索引

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public Block() {
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }



    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}