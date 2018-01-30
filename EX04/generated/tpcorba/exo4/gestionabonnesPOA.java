package tpcorba.exo4;

/**
 *	Generated from IDL interface "gestionabonnes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public abstract class gestionabonnesPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, tpcorba.exo4.gestionabonnesOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "rechercher_abonne", new java.lang.Integer(0));
		m_opsHash.put ( "resilier_abonne", new java.lang.Integer(1));
		m_opsHash.put ( "creation_abonne", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:tpcorba/exo4/gestionabonnes:1.0"};
	public tpcorba.exo4.gestionabonnes _this()
	{
		return tpcorba.exo4.gestionabonnesHelper.narrow(_this_object());
	}
	public tpcorba.exo4.gestionabonnes _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo4.gestionabonnesHelper.narrow(_this_object(orb));
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
			case 0: // rechercher_abonne
			{
			try
			{
				int _arg0=_input.read_long();
				tpcorba.exo4.abonneHolder _arg1= new tpcorba.exo4.abonneHolder();
				_arg1._read (_input);
				_out = handler.createReply();
				rechercher_abonne(_arg0,_arg1);
				tpcorba.exo4.abonneHelper.write(_out,_arg1.value);
			}
			catch(tpcorba.exo4.numeroInconnu _ex0)
			{
				_out = handler.createExceptionReply();
				tpcorba.exo4.numeroInconnuHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // resilier_abonne
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				resilier_abonne(_arg0);
			}
			catch(tpcorba.exo4.numeroInconnu _ex0)
			{
				_out = handler.createExceptionReply();
				tpcorba.exo4.numeroInconnuHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // creation_abonne
			{
			try
			{
				int _arg0=_input.read_long();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				tpcorba.exo4.abonneHolder _arg3= new tpcorba.exo4.abonneHolder();
				_arg3._read (_input);
				_out = handler.createReply();
				creation_abonne(_arg0,_arg1,_arg2,_arg3);
				tpcorba.exo4.abonneHelper.write(_out,_arg3.value);
			}
			catch(tpcorba.exo4.dejaExistant _ex0)
			{
				_out = handler.createExceptionReply();
				tpcorba.exo4.dejaExistantHelper.write(_out, _ex0);
			}
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
