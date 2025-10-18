package composition;

public class PapanSkor {
    int skor;

    PapanSkor(){
        skor = 0; 
    }
    void tambahPoin(int poin){
        skor += poin;
    }
    void tampilkanSkor(){
        System.out.println("Skor saat ini: "+ skor);
    }
}
