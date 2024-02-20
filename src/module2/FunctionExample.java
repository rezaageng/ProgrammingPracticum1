package module2;

public class FunctionExample {
    // method untuk menghitung penjumlahan dua bilangan
    public static int tambah(int a, int b) {
        return a + b;
    }

    // method untuk menghitung pengurangan dua bilangan
    public static int kali(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // menyimpan hasil penjumlahan ke dalam variabel dan menampilkannya
        int hasilPenjumlahan = tambah(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        // menyimpan hasil perkalian ke dalam variabel dan menampilkannya
        int hasilPerkalian = kali(4,6);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
    }
}

// output:
// Hasil penjumlahan: 8
// Hasil perkalian: 24
