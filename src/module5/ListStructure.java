package module5;

public class ListStructure {
    // variabel head bertipe Node untuk menampung elemen pertama
    private Node head;

    // Method untuk menambahkan elemen di akhir list
    void addTail(double data) {
        Node curNode;
        Node posNode = null;
        Node newNode = new Node(data);

        // jika elemen pertama belum ada maka elemen baru menjadi elemen pertama, jika tidak maka elemen baru ditambahkan di akhir list
        if (head == null) {
            head = newNode;
        } else {
            // iterasi untuk mencari elemen terakhir
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }

    }

    // Method untuk menambahkan elemen di awal list
    void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Method untuk menambahkan elemen di posisi tertentu
    void addMid(double data, int position) {
        Node curNode = null;
        Node posNode = null;
        int i;

        Node newNode = new Node(data);

        // jika elemen pertama belum ada maka elemen baru menjadi elemen pertama, jika tidak maka elemen baru ditambahkan di posisi tertentu
        if (head == null) {
            head = newNode;
        } else {
            curNode = head;

            // jika posisi yang dimasukkan adalah 1 maka elemen baru menjadi elemen pertama
            if (position == 1) {
                newNode.setNext(curNode);
                head = newNode;
            } else {

                // iterasi untuk mencari posisi yang dimasukkan
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    void removeHead() {
        if (head != null) {
            head = head.getNext();
        } else {
            System.out.println("List is empty");
        }
    }

    void removeTail() {
        Node preNode = null;
        Node lastNode;

        if (head != null) {
            if (head.getNext() == null) {
                head = null;
            } else {
                lastNode = head;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                lastNode.setNext(null);
                lastNode = null;
            }
        }
    }

    void removeMid(double element) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean found;

        if (head != null) {
            found = false;
            i = 1;
            tempNode = head;

            while (tempNode.getNext() != null && !found) {
                if (tempNode.getData() == element) {
                    found = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (found) {
                if (i == 1) {
                    head = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    tempNode.setNext(null);
                    tempNode = null;
                }
            }
        } else {
            System.out.println("List is empty");
        }
    }

    // Method untuk menampilkan elemen-elemen list
    void displayElements() {
        // iterasi untuk menampilkan elemen-elemen list
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

}
