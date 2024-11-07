package 异常处理;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        //throw抛出异常   throws在方法声明有哪些编译异常(运行异常不用声明)
        int[] arr=null;
        int max=0;
        try {
            max=getMax(arr);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        //这里的代码会被执行，因为是自己处理的异常,不是虚拟机。
        System.out.println(max);

    }

                                                    //由于两个异常都是runtime异常的子类所以说不用抛出
    public static int getMax(int[] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException*/{
        //传递过来的数组可能为空或者是长度为0所以说可以抛出
        if(arr==null){
            throw  new NullPointerException();
        }

        //长度为0
        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }


        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;


    }
}


