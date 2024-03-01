package module4;

public class ListTest {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

//        list.addTail(3);
//        list.addTail(4);
//        list.addMid(7, 2);
//        list.addMid(8,2);
//        list.addHead(5);

//        list.addTail(2.1);
//        list.addTail(4.5);
//        list.addMid(3.4, 2);

        list.addTail(2.1);
        list.addTail(5.5);
        list.addMid(4.5, 2);
        list.addMid(1.1, 2);
        list.addHead(3.4);

        list.displayElements();
    }

}
