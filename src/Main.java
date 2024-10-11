public class Main {
  public static void main(String[] args) {
    System.out.println("Java corporate");

    // sfrutto il polimorfismo
    Dipendente obj1 = new Dirigente("Elon", 50, 35);
    Dipendente obj2 = new Impiegato("Mario", 30, obj1);
    Dipendente obj3 = new Stagista("Tapino", obj1, 500);

    Dipendente[] dipendenti = {obj1, obj2, obj3};

    for(Dipendente d : dipendenti) {
      System.out.println(d.getNome() + " guadagna " + d.calcolaRAL() + " all'anno");
    }
  }
}