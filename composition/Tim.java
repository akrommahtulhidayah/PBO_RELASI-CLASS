package composition;

import java.util.ArrayList;
import java.util.List;

public class Tim {
    private String namaTim;
    private List<Pemain> daftarPemain;

    public Tim(String namaTim) {
        this.namaTim = namaTim;
        this.daftarPemain = new ArrayList<>();
    }

    // COMPOSITION: Pemain dibuat di dalam Tim
    public void tambahPemain(String nama, int nomor) {
        Pemain pemainBaru = new Pemain(nama, nomor);
        daftarPemain.add(pemainBaru);
    }

    public void tampilkanTim() {
        System.out.println("=== Tim: " + namaTim + " ===");
        for (Pemain p : daftarPemain) {
            p.tampilkanInfo();
        }
    }
}

