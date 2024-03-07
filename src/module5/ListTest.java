package module5;

public class ListTest {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        list.displayElements();

        System.out.println("\n# remove head");

        list.removeHead();

        list.displayElements();
    }
}
