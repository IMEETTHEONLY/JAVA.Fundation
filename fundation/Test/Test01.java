package Test;

import java.util.Arrays;
import java.util.Comparator;

//定义对象，利用Arrays的sort对象进行排序
public class Test01 {

    public static void main(String[] args) {



        //创建三个对象
        GirlFriend gf1=new GirlFriend("xiaoshishi",18,1.67);
        GirlFriend gf2=new GirlFriend("xiaodandan",19,1.72);
        GirlFriend gf3=new GirlFriend("xiaohuihui",19,1.78);
        GirlFriend gf4=new GirlFriend("abc",19,1.78);


        //定义数组存储三个信息
        GirlFriend[] arr={gf1,gf2,gf3,gf4};


//        //利用Arrays的sort
//        //重写比较规则
//        Arrays.sort(arr, new Comparator<GirlFriend>() {
//            @Override
//            public int compare(GirlFriend o1, GirlFriend o2) {
//                //按照年龄大小排序，如果说年龄一致，按身高排序，身高一样按照名字的字母顺序进行排序
//                double temp=o1.getAge()-o2.getAge();
//              temp=  temp==0?o1.getHeight()-o2.getHeight():temp;
//              temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
//
//              //由于temp是double类型，但是需要返回的类型是int类型，所以说加一判断
//              if(temp>0){
//                  return 1;
//              } else if (temp<0) {
//                  return -1;
//              }
//              else {
//                  return 0;
//              }
//
//            }
//        });


        //利用Arrays的sort
        //重写比较规则   lambda表达式修改结果
        Arrays.sort(arr, ( o1,  o2) ->{
                //按照年龄大小排序，如果说年龄一致，按身高排序，身高一样按照名字的字母顺序进行排序
                double temp=o1.getAge()-o2.getAge();
                temp=  temp==0?o1.getHeight()-o2.getHeight():temp;
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;

                //由于temp是double类型，但是需要返回的类型是int类型，所以说加一判断
                if(temp>0){
                    return 1;
                } else if (temp<0) {
                    return -1;
                }
                else {
                    return 0;
                }

            }
        );

        //展示数组的数据
        System.out.println(Arrays.toString(arr));
    }
}
