package 集合进阶.MySet;
//探求hash值的特性与底层
public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("zhangsan",23);

        //如果没有重写hashCode方法，不同对象计算出的hash值是不一样的(地址)
        //重写hashCode方法，不同对象计算出的hash值是一样的(地址)

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //小部分情况，不同的对象不同的地址，计算出来的hash值也可能一样
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
