package Task_Java_160223;

import java.util.HashMap;
import java.util.Map;

public class STR {
    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder("1");
//        sb.append("A").append("2").append("X");
//        StringBuffer stringBuffer = new StringBuffer("55");
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Iuri");
        map.put(2, "Paul");
        map.put(3, "Karina");
        map.put(4, "Anita");
        map.put(5, "Eduard");
        map.put(6, "Sonia");
        System.out.println(map);
        System.out.println(map.hashCode());
    }
}
