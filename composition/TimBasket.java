package composition;

public class TimBasket {
  String nama;
  PapanSkor papan;
  
  TimBasket(String nama){
    this.nama = nama;
    this.papan = new PapanSkor();
  }
}
