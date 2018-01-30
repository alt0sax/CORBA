package tpcorba.exo4;

/**
 *	Generated from IDL interface "abonne"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public abstract class abonnePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, tpcorba.exo4.abonneOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_nom_prenom", new java.lang.Integer(0));
		m_opsHash.put ( "_get_numero", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:tpcorba/exo4/abonne:1.0"};
	public tpcorba.exo4.abonne _this()
	{
		return tpcorba.exo4.abonneHelper.narrow(_this_object());
	}
	public tpcorba.exo4.abonne _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo4.abonneHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // _get_nom_prenom
			{
			_out = handler.createReply();
			_out.write_string(nom_prenom());
				break;
			}
			case 1: // _get_numero
			{
			_out = handler.createReply();
			_out.write_long(numero());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
