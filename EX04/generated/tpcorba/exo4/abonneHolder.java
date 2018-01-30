package tpcorba.exo4;

/**
 *	Generated from IDL interface "abonne"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class abonneHolder	implements org.omg.CORBA.portable.Streamable{
	 public abonne value;
	public abonneHolder()
	{
	}
	public abonneHolder (final abonne initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return abonneHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = abonneHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		abonneHelper.write (_out,value);
	}
}
