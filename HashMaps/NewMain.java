

public class NewMain {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,"harsh");
        map.put(2,"harshji");
        map.put(3,"harshsa");

        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.remove(1));
        System.out.println(map);
    }
}
