//package 常见算法.Serch_code;
////分块查找
//public class A03_BlockSearchDemo {
//    public static void main(String[] args) {
//        //这里其实是四个块，但是第二个块太小了，就合并到了第一个   21，18是第二个
//        int[] arr={16,5,9,12,21,18,
//                32,23,37,26, 45,34,
//                50,48,61,52,73,66};
//
//        //1.把数据分块  分块的块数:length开根号
//
//        //创建三个对象来管理对象
//        Block b1=new Block(21,0,5);
//        Block b2=new Block(45,6,11);
//        Block b3=new Block(73,12,17);
//
//        //定义一个数组存入三个块对象(索引表)
//        Block[] blockArr={b1,b2,b3};
//
//        //定义一个变量来存要查找的元素
//        int num=37;
//
//
//        //调用方法，传递索引表，数组，要查找的元素
//        int index= getIndex(blockArr,arr,num);
//
//        //打印index
//        System.out.println(index);
//    }
//
//    //利用分块查找的原理，查询num的索引
//
//    private static int getIndex(Block[] blockArr, int[] arr, int num) {
//        //1.确定num在哪一块当中
//       int indexBlock= findIndexBlock(blockArr,num);
//       if(indexBlock==-1){
//           //表示num不在数组当中
//           return -1;
//       }
//
//       //2.获取这一块的起始索引和结束索引，查找块内
//        int startIndex=blockArr[indexBlock].getStartIndex();
//       int endIndex=blockArr[indexBlock].getEndIndex();
//
//
//       //3.遍历大数组的索引
//        for (int i = startIndex; i < endIndex; i++) {
//            if(arr[i]==num){
//                //找到了
//                return i;
//            }
//        }
//       return -1;
//
//    }
//
//
//    //1.定义一个方法确定num在哪一块
//    public static int findIndexBlock(Block[] blockArr,int num){
//        //用基本查找寻找num索引,当num小于索引表的max，他就在当前块当中
//        for (int i = 0; i < blockArr.length; i++) {
//            if(num<=blockArr[i].getMax()){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//
//
////class Block{
////    private int max;  //最大值
////    private int startIndex;  //起始索引
////
////    private int endIndex;  //结束索引
////
////    public Block(int max, int startIndex, int endIndex) {
////        this.max = max;
////        this.startIndex = startIndex;
////        this.endIndex = endIndex;
////    }
////
////    public Block() {
////    }
////
////    public int getMax() {
////        return max;
////    }
////
////    public void setMax(int max) {
////        this.max = max;
////    }
////
////    public int getStartIndex() {
////        return startIndex;
////    }
////
////    public void setStartIndex(int startIndex) {
////        this.startIndex = startIndex;
////    }
////
////    public int getEndIndex() {
////        return endIndex;
////    }
////
////
////
////    public void setEndIndex(int endIndex) {
////        this.endIndex = endIndex;
////    }
////}