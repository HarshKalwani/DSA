import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();   
        map.put(1, "HarshJi");
        map.put(2, "john");
        map.put(3, "kalwani");

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.get(20)); //null data is not present
        System.out.println(map.containsKey(5));  //returns boolean value 
    }
}
