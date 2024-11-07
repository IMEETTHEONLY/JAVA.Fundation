package 集合进阶.MySet;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //指定排序规则
        //只看年龄，按照年龄升序
        //this是当前要添加的元素，o是已经存在的元素
//        System.out.println("------------------");
//        System.out.println("this:"+this);
//        System.out.println("o:"+o);
        int reuslt=this.getAge()-o.getAge();
        return reuslt;
    }
}
