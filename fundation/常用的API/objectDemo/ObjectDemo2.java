package 常用的API.objectDemo;

public class ObjectDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //对象克隆
        int[] data={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1=new User(1,"zhangsan","1234qwer","girl11",data);

        //克隆对象
        //底层：它会新创建一个对象，然后将数据拷贝过去
        Object u2=u1.clone();

        System.out.println(u1);
        System.out.println(u2);


//        String a="abc";
//        String b="abc";
//        int hashcode1=a.hashCode();
//        int hashcode2=b.hashCode();
//        System.out.println(hashcode1);
//        System.out.println(hashcode2);

        //修改u1查看u2是否会改变,Object是浅克隆
        int[] arr= u1.getData();
        arr[0]=100;

        System.out.println(u1);
        System.out.println(u2);
    }
}
