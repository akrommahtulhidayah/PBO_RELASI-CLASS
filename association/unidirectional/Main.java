public class Main {
    public static void main(String[] args) {
        Pertandingan pertandingan = new Pertandingan();

        Pemain pemain1 = new Pemain("Firly");
        //Pemain pemain2 = new Pemain("Sucipto");

        Supporter s1 = new Supporter("Maya");
        Supporter s2 = new Supporter("Anin");

        pertandingan.tambahSupporter(s1);
        pertandingan.tambahSupporter(s2);

        pemain1.cetakSkor(2, pertandingan);
        //pemain2.cetakSkor(3, pertandingan);

        System.out.println("\nPertandingan selesai!");
        System.out.println("Total skor pertandingan: " + pertandingan.totalSkor);
    }
}
