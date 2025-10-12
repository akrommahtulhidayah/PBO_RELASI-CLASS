package dependency;

public class PapanSkor {
    
    void updateSkor(Tim tim,int poin){
        tim.tambahPoin(poin);
    }

    void lihatSkor(Tim tim1, Tim tim2){
        System.out.println("\n === SKOR ===");
        System.out.println(tim1.nama + " : " + tim1.skor );
        System.out.println(tim2.nama + " : " + tim2.skor );
    }
}
