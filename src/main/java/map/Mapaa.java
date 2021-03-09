package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapaa {
    public static void main(String[] args) {
        person p = new student();
        try{
            p.setAge(1000);
        }catch (IllegelAgeException e){
            e.printStackTrace();
        }
    }

    public class person{
        private int age;
        public void setAge(int age) {
            if (age<0 || age>100){
                throw  new IllegelAgeException("年龄不合法");
            }
        }
    }

    public class student extends person{
        public void student(){

        }
        public void say(){
            System.out.println("yaya");
        }
    }

}
