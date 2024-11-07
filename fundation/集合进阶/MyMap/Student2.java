package 集合进阶.MyMap;

public class Student2 implements Comparable<Student2>{
    private String name;
    private  int age;


    public Student2() {
    }

    public Student2(String name, int age) {
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
        return "Student2{name = " + name + ", age = " + age + "}";
    }


    @Override
    public int compareTo(Student2 o) {
        //获取年龄差
       int i= this.getAge()-o.getAge();
       //判断年龄是否相等，若相等就比较名字
      i= i==0?this.getName().compareTo(o.getName()):i;
      //当i==0即名字和年龄都相等的时候，就返回0，不加
      return i;
    }
}
