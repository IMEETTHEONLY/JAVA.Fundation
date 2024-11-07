package 异常处理;

public class Girl {
    private String name;

    private int age;


    public Girl() {
    }

    public Girl(String name, int age) {
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
        if(name.length()<3||name.length()>40){
            throw new NameFormatException("姓名的长度不符合，3-10");  //由于这个异常不是java自带就抛出父类
        }
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
        if(age<18||age>40){
            throw new AgeOutBoundsException("年龄超出范围，18-40");
        }
        this.age = age;
    }

    public String toString() {
        return "Girl{name = " + name + ", age = " + age + "}";
    }
}
