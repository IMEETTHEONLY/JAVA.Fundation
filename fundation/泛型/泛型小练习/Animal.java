package 泛型.泛型小练习;
//动物类
public abstract class Animal {
    private String name;  //动物的名字
    private int age;  //动物的年龄

    public String getName() {
        return name;
    }


    public Animal() {

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract void eat();
}
