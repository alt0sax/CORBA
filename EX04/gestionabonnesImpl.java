package tpcorba.exo4;

import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import java.util.*;

public class gestionabonnesImpl extends gestionabonnesPOA
{
  protected POA poa;
  private List<abonneImpl> abonnes = new ArrayList<abonneImpl>();

  public gestionabonnesImpl(POA poa)
  {
    this.poa = poa;
  }

  public void creation_abonne(int numero, String nom, String prenom, abonneHolder ref) throws dejaExistant
  {
    abonneImpl abonneimpl = new abonneImpl(numero, nom, prenom);
    if(abonnes.contains(abonneimpl))
    {
      throw new dejaExistant();
    }
    abonnes.add(abonneimpl);
    try
    {
      ref.value = abonneHelper.narrow(poa.servant_to_reference(abonneimpl));
    }
    catch(Exception e)
    {
      System.err.println("ERREUR NARROW()");
    }
  }

  public void rechercher_abonne(int numero, abonneHolder ref) throws numeroInconnu
  {
    int index = abonnes.indexOf(new abonneImpl(numero));
    if(index == -1) throw new numeroInconnu();

    try
    {
      ref.value = abonneHelper.narrow(poa.servant_to_reference(abonnes.get(index)));
    }
    catch(Exception e)
    {
      System.err.println("ERREUR NARROW()");
    }
  }

  public void resilier_abonne(int numero) throws numeroInconnu
  {
    int index = abonnes.indexOf(new abonneImpl(numero));
    if(index == -1) throw new numeroInconnu();

    abonneHolder ref = new abonneHolder();

    try
    {
      ref.value = abonneHelper.narrow(poa.servant_to_reference(abonnes.get(index)));
    }
    catch(Exception e)
    {
      System.err.println("ERREUR NARROW()");
    }

    abonnes.remove(index);

    try
    {
      byte[] ObjID = poa.reference_to_id(ref.value);
      poa.deactivate_object(ObjID);
    }
    catch(Exception e)
    {
      System.err.println("POA Exception " + e);
    }
  }
}
