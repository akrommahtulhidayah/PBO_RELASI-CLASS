package aggregation;

import java.util.List;

public class Tim {
    String nama;
    List<Pemain> anggotaTim;
    
    Tim(String nama, List<Pemain> anggotaTim){
        this.nama = nama;
        this.anggotaTim = anggotaTim;
    }

    void TampilkanPemain(){
        System.out.println("Tim "+ nama + "Dengan anggota: ");
        for(Pemain pemain : anggotaTim) {
            System.out.println("-" +pemain.nama + " nomer " + pemain.nomer );
        }
    }

}