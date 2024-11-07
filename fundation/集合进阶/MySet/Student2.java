package 集合进阶.MySet;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private  int chinese;  //语文成绩
    private int math;
    private int english; //英语成绩


    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
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

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        int sum=english+chinese+math;
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + ", sum="+sum+"}";
    }

    @Override
    public int compareTo(Student2 o) {
        //指定排序规则
        //总分
        int sum1=this.getChinese()+this.getEnglish()+this.getMath();

        int sum2=o.getChinese()+o.getEnglish()+o.getMath();
        int i=sum1-sum2;
        //总分一样就按照语文成绩排
        i= i==0?this.chinese-o.getChinese():i;

        //如果说总分一样，语文一样也一样  这里的i=0是由于语文成绩一样
       i= i==0?this.getMath()-o.getMath():i;

       //同理，如果说语文成绩也一样按英语排
       i= i==0?this.getEnglish()-o.getEnglish():i;

       //如果英语成绩英语按照年龄排
        i=i==0?this.getAge()-o.getAge():i;

        //年龄一致就按照字母顺序排
        i=i==0?this.getName().compareTo(o.getName()):i;

        //如果此时i还是零就是不加入,相当于就是return 0
        return -i;
    }
}
