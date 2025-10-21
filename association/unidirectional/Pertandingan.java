import java.util.*;

public class Pertandingan {
    int totalSkor = 0;
    List<Supporter> supporters = new ArrayList<>();

    void tambahSupporter(Supporter s) {
        supporters.add(s);
    }

    void updateSkor(Pemain pemain, int poin) {
        totalSkor += poin;
        System.out.println("Skor total: " + totalSkor);
        for (Supporter s : supporters) {
            s.beriReaksi(pemain, poin); // komunikasi satu arah ke supporter
        }
    }
}