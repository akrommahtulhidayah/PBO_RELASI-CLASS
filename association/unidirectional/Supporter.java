public class Supporter {
    String nama;

    Supporter(String nama) {
        this.nama = nama;
    }

    void beriReaksi(Pemain pemain, int poin) {
        System.out.println(nama + ": Horeee! " + pemain.nama + " cetak " + poin + " poin!");
    }
}