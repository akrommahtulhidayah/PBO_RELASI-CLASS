package dependency;

public class Wasit {
   
    void beriPoin(PapanSkor papan,Tim tim,int poin){
        System.out.println("Wasit memberikan " + poin + " poin ke Tim " + tim.nama);
        papan.updateSkor(tim, poin);
    }
}
