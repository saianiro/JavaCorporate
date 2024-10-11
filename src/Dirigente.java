public class Dirigente extends Dipendente{

  private double bonus;

  public Dirigente(String nome, double pagaOraria, double bonus) {
    super(nome, pagaOraria);
    this.bonus = bonus;
  }

  @Override
  public double calcolaRAL() {
    double tredicesima = pagaMese() * 0.8;
    double anno = pagaMese() * 12;
    double annoNoBonus = anno + tredicesima;
    double annoBonus = annoNoBonus * (bonus / 100);
    return annoNoBonus + annoBonus;
  }
}
