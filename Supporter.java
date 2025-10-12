package association.bidirectional;

public class Supporter {
    PemainBasket pemain;

    public void memberiDukungan(PemainBasket pemain) {
        this.pemain = pemain;
        System.out.println("Supporter memberi dukungan ke pemain posisi " + pemain.posisi);
    }
}
