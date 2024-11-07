package 方法引用;

public class Student {
    private String name;
    private Integer age;


    public Student() {
    }

    //这里不需要返回值，因为构造方法它的作用本来就要返回一个student对象
    public Student(String s) {
        String[] split = s.split(",");
        this.name=split[0];
        this.age=Integer.parseInt(split[1]);

    }

    public Student(String name, Integer age) {
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
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return getName()+"-"+getAge();
    }
}
