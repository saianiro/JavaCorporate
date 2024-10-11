public class Impiegato extends Dipendente {

  private Dipendente boss;

  public Impiegato(String nome, double pagaOraria, Dipendente boss) {
    super(nome, pagaOraria);
    this.boss = boss;
  }

  @Override
  public double calcolaRAL() {
    double tredicesima = pagaMese() * 0.8;
    double anno = pagaMese() * 12;
    return anno + tredicesima;
  }
}
