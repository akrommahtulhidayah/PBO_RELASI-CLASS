package composition;

public class Pemain {
    private String nama;
    private int nomorPunggung;

    public Pemain(String nama, int nomorPunggung) {
        this.nama = nama;
        this.nomorPunggung = nomorPunggung;
    }

    public void tampilkanInfo() {
        System.out.println("Pemain: " + nama + " | Nomor: " + nomorPunggung);
    }
}
