public class Stagista extends Impiegato{

  private double forfait;

  public Stagista(String nome, Dipendente boss, double forfait) {
    super(nome, 0, boss);
    this.forfait = forfait;
  }

  @Override
  public double calcolaRAL() {
    return forfait * 12;
  }
}
