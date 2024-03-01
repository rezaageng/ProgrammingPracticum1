package module3;

public class ListTest {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        list.displayElements();

        System.out.println();

        list = new ListStructure();

        list.addTail(3);
        list.addTail(2);
        list.addTail(1);
        list.addTail(7);

        list.displayElements();
    }
}
