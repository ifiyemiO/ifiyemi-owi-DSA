package SingleLinkedList;

public class MainApp {
    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        sda.insertInLinkedList(1, 0);
        sda.insertInLinkedList(2, 1);
        sda.insertInLinkedList(3, 2);
        sda.insertInLinkedList(4, 3);
        sda.insertInLinkedList(5, 4);
        sda.insertInLinkedList(6, 5);

        sda.deleteFromLinkedList(0);
        sda.deleteFromLinkedList(sda.size - 1);
        sda.deleteFromLinkedList(1);

        sda.traverseLinkedList();
        sda.searchNode(8);

    }
}
