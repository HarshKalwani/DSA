import java.util.Arrays;
import java.util.LinkedList;

class Entry{
    public int key;
    public String value;

    public Entry (int key , String value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return key + " " + value;
    }
}

public class MyHashMap {
    LinkedList<Entry>[] list;

    public MyHashMap(){
        this.list = new LinkedList[5];
    }

    private int hashKey(int key){
        return key%list.length;
    }

    public boolean put(int key , String value){
        int index = hashKey(key);
        if(list[index]==null){
            list[index] = new LinkedList();
        }

        var bucket = list[index];

        for(var entry : bucket){
            if(entry.key == key){
                entry.value = value;
                return true;
            }
        }

        bucket.addLast(new Entry(key, value));
        return true ;
    }

    public String get(int key){
        int index = hashKey(key);
        if(list[index]==null) throw new IllegalArgumentException();
        var bucket = list[index];

        for(var entry : bucket){
            if(entry.key==key) return entry.value;
        }

        throw new IllegalArgumentException();
    }

    public String remove(int key){
        int index = hashKey(key);
        if(list[index]==null) throw new IllegalArgumentException();

        var bucket = list[index];
        for(var entry : bucket){
            if(entry.key ==  key){
                bucket.remove(entry);
                return entry.value;
            }
        }
        throw new IllegalArgumentException();
    }

    public String toString(){
        return Arrays.toString(list);
    }
}
