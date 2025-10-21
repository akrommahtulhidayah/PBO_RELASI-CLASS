package association.bidirectional;

import java.util.ArrayList;
import java.util.List;

public class Tim {
    private String namaTim;
    private List<Pemain> daftarPemain;

    public Tim(String namaTim) {
        this.namaTim = namaTim;
        this.daftarPemain = new ArrayList<>();
    }

    public String getNamaTim() {
        return namaTim;
    }

    // Bidirectional: saat menambah pemain, kita juga set tim pemainnya
    public void tambahPemain(Pemain pemain) {
        daftarPemain.add(pemain);
        pemain.setTim(this); // hubungan dua arah
    }

    public void tampilkanTim() {
        System.out.println("=== Tim: " + namaTim + " ===");
        for (Pemain p : daftarPemain) {
            p.tampilkanInfo();
        }
    }
}
