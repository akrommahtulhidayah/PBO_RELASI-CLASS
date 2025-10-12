package aggregation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         // Pemain dibuat secara independen (di luar Tim)
        Pemain andi = new Pemain("andi",  22);
        Pemain joko = new Pemain("joko",  12);
        Pemain cahyo = new Pemain("cahyo",  7);

        // Daftar pemain dipassing ke Tim -> ini aggregation
        Tim garuda = new Tim("Garuda", Arrays.asList(andi, joko, cahyo));

        garuda.TampilkanPemain();
         // Pemain tetap ada walau kita hapus referensi ke Tim:
        // contoh: pemain bisa dipakai untuk membuat tim lain atau data lain
    }
    
}
