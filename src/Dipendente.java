public abstract class Dipendente {

  private String nome;
  private double pagaOraria;

  public Dipendente(String nome, double pagaOraria) {
    this.nome = nome;
    this.pagaOraria = pagaOraria;
  }

  public String getNome() {
    return nome;
  }

  private double pagaGiorno() {
    return pagaOraria * 8;
  }

  public double pagaMese() {
    return pagaGiorno() * 20;
  }

  public abstract double calcolaRAL();
}
