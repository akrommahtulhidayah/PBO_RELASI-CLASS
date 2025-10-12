package dependency;

public class Tim {
    String nama;
    int skor ;

    public Tim(String nama){
        this.nama = nama;
        this.skor = 0;
    }

    public int tambahPoin(int poin){
        skor += poin;
        return skor;
    }
    
}