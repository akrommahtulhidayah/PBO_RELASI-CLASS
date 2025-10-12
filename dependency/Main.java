package dependency;

public class Main {
    public static void main(String[] args) {
        Tim garuda = new Tim("garuda");
        Tim macan = new Tim("macan");

        Wasit wasit = new Wasit();
        PapanSkor papan = new PapanSkor();

        wasit.beriPoin(papan, macan, 2);
        wasit.beriPoin(papan, garuda, 1);

        papan.lihatSkor(garuda, macan);
    }
}
