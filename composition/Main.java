package composition;

public class Main {
    public static void main(String[] args) {
        // Membuat tim baru
        Tim timA = new Tim("Garuda Basket Club");

        // Menambahkan pemain ke dalam tim (COMPOSITION)
        timA.tambahPemain("Andi", 7);
        timA.tambahPemain("Budi", 10);
        timA.tambahPemain("Citra", 23);

        // Menampilkan data tim
        timA.tampilkanTim();
    }
}
