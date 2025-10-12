package association.bidirectional;

public class Main {
    public static void main(String[] args) {
        PemainBasket pemain = new PemainBasket("Point Guard");
        Supporter supporter1 = new Supporter();
        Supporter supporter2 = new Supporter();

        supporter1.memberiDukungan(pemain);
        supporter2.memberiDukungan(pemain);
    }
}
