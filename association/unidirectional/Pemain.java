public class Pemain {
    String nama;
    int skor = 0;

    Pemain(String nama) {
        this.nama = nama;
    }

    void cetakSkor(int poin, Pertandingan pertandingan) {
        skor += poin;
        System.out.println("Selamat " + nama + " mencetak " + poin + " poin ");
        pertandingan.updateSkor(this, poin); // komunikasi satu arah ke Pertandingan
    }
}
