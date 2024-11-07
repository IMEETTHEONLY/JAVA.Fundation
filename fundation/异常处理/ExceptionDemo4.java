package 异常处理;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        //灵魂二问:如果try当中遇见多个问题如何执行

        //细节:如果说异常之间存在继承关系，父类一定要在子类下面。
        //会

        int[] arr = {1, 2, 6, 4, 1};

        try {

            //只要出现一个异常，那么它下面的所有代码就不会执行了
            //这里1和2换位置就默认交给jvm去处理了，因为catch不到(然后只有第一个catch)
            System.out.println(arr[10]);
            System.out.println(2/0);
            String s = null;
            System.out.println(s.equals("abc"));

        //正常的写法是，把所有的异常都cathch
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界了");
        }
        catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }


        System.out.println("看看我执行了吗");
    }
}
