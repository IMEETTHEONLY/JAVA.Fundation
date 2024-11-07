package myobjectstream;

import java.io.Serializable;

public class Student implements Serializable {


    private static final long serialVersionUID = -5884008512943658836L;
    private int age;

    private String name;

    private transient String adress;

    public Student() {
    }

    public Student(int age, String name, String adress) {
        this.age = age;
        this.name = name;
        this.adress = adress;
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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
