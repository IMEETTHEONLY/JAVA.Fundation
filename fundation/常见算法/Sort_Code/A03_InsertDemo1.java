package 常见算法.Sort_Code;
//插入排序
public class A03_InsertDemo1 {
    public static void main(String[] args) {

        int[] arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        //1.找到无序的那一组数据是从哪一个索引开始的
        int startIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
               startIndex=i+1;
                break;
            }
        }


        //2.遍历从startIndex到最后一个元素，依次得到每一个无序的元素再插入
        for (int i = startIndex; i < arr.length; i++) {
            //记录当前要插入数据的索引
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){

                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                //继续让当前换过的元素与前面的元素继续比较，相当于就是找位置的过程
                j--;
            }
        }


        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



}
