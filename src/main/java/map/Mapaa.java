package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapaa {
//    public static void main(String[] args) {
//        Map<String,Integer> map = new HashMap<>();
//        map.put("zhangsan", 20);
//        map.put("lisi", 20);
//        map.put("wangwu", 24);
//        map.put("zhaoliu", null);
//        Set<Map.Entry<String,Integer>> set = map.entrySet();
//        for (Map.Entry<String,Integer> entry : set){
//            String s = entry.getKey();
//            Integer s1 = entry.getValue();
//            System.out.println(s+s1);
//        }
//    }

    public class person{
        public void say(){
            System.out.println("haha");
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
