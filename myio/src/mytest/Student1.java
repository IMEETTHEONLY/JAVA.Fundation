package mytest;

import java.io.Serializable;

public class Student1 implements Serializable {

    private static final long serialVersionUID = 1037045293000797722L;
    private String name;

    private int age;


    public Student1() {
    }

    public Student1(String name, int age) {
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
        return "Student1{name = " + name + ", age = " + age + "}";
    }
}
