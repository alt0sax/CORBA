
package tpcorba.exo3;

import org.omg.CORBA.*;
import java.lang.*;


public class compteImpl extends comptePOA
{
  private int numero_compte;
  private String titulaire;
  private double solde;
  private int nombre_operations;

  public compteImpl(String t, int num)
  {
    this.titulaire=t;
    this.numero_compte=num;
    this.solde=0;
  }

  public int numero_compte()
  {
    return numero_compte;
  }

  public String titulaire()
  {
    return titulaire;
  }

  public double solde()
  {
    return solde;
  }

  public int nombre_operations()
  {
    return nombre_operations;
  }

  public void debiter(double montant)
  {
    solde -= montant;
    nombre_operations++;
  }

  public void crediter(double montant)
  {
    solde += montant;
    nombre_operations++;
  }

  public void prelevement(double montant, compte destination)
  {
    debiter(montant);
    destination.crediter(montant);
  }
}
