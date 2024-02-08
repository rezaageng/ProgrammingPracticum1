package module1_node;

public class NodeMain {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);

        node1.setNext(node2);

        Node p = node1;

        while (p != null) {
            System.out.printf("%d", p.getNilai());
            p = p.getNext();
        }
    }
}

// 1. atribut next pada class Node berfungsi sebagai pointer ke node selanjutnya
// 2. perintah yang digunakan untuk menambah relasi antar node adalah setNext
// 3. fungsi dari pointer p adalah sebagai variabel untuk menampung node yang sedang diakses
