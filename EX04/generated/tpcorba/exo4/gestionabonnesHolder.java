package tpcorba.exo4;

/**
 *	Generated from IDL interface "gestionabonnes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class gestionabonnesHolder	implements org.omg.CORBA.portable.Streamable{
	 public gestionabonnes value;
	public gestionabonnesHolder()
	{
	}
	public gestionabonnesHolder (final gestionabonnes initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return gestionabonnesHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = gestionabonnesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		gestionabonnesHelper.write (_out,value);
	}
}
