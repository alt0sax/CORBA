package tpcorba.exo4;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "gestionabonnes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class gestionabonnesPOATie
	extends gestionabonnesPOA
{
	private gestionabonnesOperations _delegate;

	private POA _poa;
	public gestionabonnesPOATie(gestionabonnesOperations delegate)
	{
		_delegate = delegate;
	}
	public gestionabonnesPOATie(gestionabonnesOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public tpcorba.exo4.gestionabonnes _this()
	{
		return tpcorba.exo4.gestionabonnesHelper.narrow(_this_object());
	}
	public tpcorba.exo4.gestionabonnes _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo4.gestionabonnesHelper.narrow(_this_object(orb));
	}
	public gestionabonnesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(gestionabonnesOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void rechercher_abonne(int numero, tpcorba.exo4.abonneHolder ref) throws tpcorba.exo4.numeroInconnu
	{
_delegate.rechercher_abonne(numero,ref);
	}

	public void resilier_abonne(int numero) throws tpcorba.exo4.numeroInconnu
	{
_delegate.resilier_abonne(numero);
	}

	public void creation_abonne(int numero, java.lang.String nom, java.lang.String prenom, tpcorba.exo4.abonneHolder ref) throws tpcorba.exo4.dejaExistant
	{
_delegate.creation_abonne(numero,nom,prenom,ref);
	}

}
