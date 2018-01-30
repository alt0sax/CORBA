package tpcorba.exo4;


/**
 *	Generated from IDL interface "gestionabonnes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class _gestionabonnesStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements tpcorba.exo4.gestionabonnes
{
	private String[] ids = {"IDL:tpcorba/exo4/gestionabonnes:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = tpcorba.exo4.gestionabonnesOperations.class;
	public void rechercher_abonne(int numero, tpcorba.exo4.abonneHolder ref) throws tpcorba.exo4.numeroInconnu
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "rechercher_abonne", true);
				_os.write_long(numero);
				tpcorba.exo4.abonneHelper.write(_os,ref.value);
				_is = _invoke(_os);
				ref.value = tpcorba.exo4.abonneHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:tpcorba/exo4/numeroInconnu:1.0"))
				{
					throw tpcorba.exo4.numeroInconnuHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "rechercher_abonne", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			gestionabonnesOperations _localServant = (gestionabonnesOperations)_so.servant;
			try
			{
			_localServant.rechercher_abonne(numero,ref);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void resilier_abonne(int numero) throws tpcorba.exo4.numeroInconnu
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "resilier_abonne", true);
				_os.write_long(numero);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:tpcorba/exo4/numeroInconnu:1.0"))
				{
					throw tpcorba.exo4.numeroInconnuHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "resilier_abonne", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			gestionabonnesOperations _localServant = (gestionabonnesOperations)_so.servant;
			try
			{
			_localServant.resilier_abonne(numero);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void creation_abonne(int numero, java.lang.String nom, java.lang.String prenom, tpcorba.exo4.abonneHolder ref) throws tpcorba.exo4.dejaExistant
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "creation_abonne", true);
				_os.write_long(numero);
				_os.write_string(nom);
				_os.write_string(prenom);
				tpcorba.exo4.abonneHelper.write(_os,ref.value);
				_is = _invoke(_os);
				ref.value = tpcorba.exo4.abonneHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:tpcorba/exo4/dejaExistant:1.0"))
				{
					throw tpcorba.exo4.dejaExistantHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "creation_abonne", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			gestionabonnesOperations _localServant = (gestionabonnesOperations)_so.servant;
			try
			{
			_localServant.creation_abonne(numero,nom,prenom,ref);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
