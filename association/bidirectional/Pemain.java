package association.bidirectional;
public class Pemain {
    private String nama;
    private int nomorPunggung;
    private Tim tim; // hubungan balik ke Tim (bidirectional)

    public Pemain(String nama, int nomorPunggung) {
        this.nama = nama;
        this.nomorPunggung = nomorPunggung;
    }

    // Setter untuk mengatur tim pemain
    public void setTim(Tim tim) {
        this.tim = tim;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.print("Pemain: " + nama + " | Nomor: " + nomorPunggung);
        if (tim != null) {
            System.out.println(" | Tim: " + tim.getNamaTim());
        } else {
            System.out.println(" | Belum punya tim");
        }
    }
}
