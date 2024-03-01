package module3;

public class ListStructure {
    private Node head;

    void addTail(int data) {
        Node curNode;
        Node posNode = null;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }

    }

    void displayElements() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}
