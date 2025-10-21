package association.bidirectional;

public class Main {
    public static void main(String[] args) {
        Tim timA = new Tim("Garuda Basket Club");

        Pemain pemain1 = new Pemain("Andi", 7);
        Pemain pemain2 = new Pemain("Budi", 10);

        // Hubungan dua arah
        timA.tambahPemain(pemain1);
        timA.tambahPemain(pemain2);

        // Menampilkan info tim dan pemain
        timA.tampilkanTim();

        System.out.println("\n=== Cek dari sisi Pemain ===");
        pemain1.tampilkanInfo();
        pemain2.tampilkanInfo();
    }
}
