package LinkedList;

public class Mainnew {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        System.out.println(list);
        System.out.println(list.sum());
        System.out.println(list.indexOf(2));
        list.insertFirst(10);
        System.out.println(list);

    }
}
