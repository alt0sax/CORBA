package tpcorba.exo4;

public class abonneImpl extends abonnePOA
{
  private int numero;
  private String nom_prenom;

  public abonneImpl(int numero)
  {
    this.numero = numero;
  }

  public abonneImpl(int numero, String nom, String prenom)
  {
    this.numero = numero;
    nom_prenom = nom + " " + prenom;
  }

  public int numero()
  {
    return numero;
  }

  public String nom_prenom()
  {
    return nom_prenom;
  }

  public boolean equals(Object o)
  {
    if(!(o instanceof abonneImpl)) return false;
    if(this == o) return true;

    abonneImpl other = (abonneImpl) o;
    if(numero == other.numero) return true;
    else return false;
  }
}
