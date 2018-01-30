package tpcorba.exo4;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "abonne"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class abonnePOATie
	extends abonnePOA
{
	private abonneOperations _delegate;

	private POA _poa;
	public abonnePOATie(abonneOperations delegate)
	{
		_delegate = delegate;
	}
	public abonnePOATie(abonneOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public tpcorba.exo4.abonne _this()
	{
		return tpcorba.exo4.abonneHelper.narrow(_this_object());
	}
	public tpcorba.exo4.abonne _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo4.abonneHelper.narrow(_this_object(orb));
	}
	public abonneOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(abonneOperations delegate)
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
	public java.lang.String nom_prenom()
	{
		return _delegate.nom_prenom();
	}

	public int numero()
	{
		return _delegate.numero();
	}

}
