package module5;

public class ListTest2 {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);

        System.out.println("List elements:");
        list.displayElements();

        list.removeTail();

        System.out.println("\nList elements after removing tail:");
        list.displayElements();

        list.removeHead();

        System.out.println("\nList elements after removing head:");
        list.displayElements();
    }
}
