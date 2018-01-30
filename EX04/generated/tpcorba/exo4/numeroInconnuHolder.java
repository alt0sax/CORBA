package tpcorba.exo4;

/**
 *	Generated from IDL definition of exception "numeroInconnu"
 *	@author JacORB IDL compiler 
 */

public final class numeroInconnuHolder
	implements org.omg.CORBA.portable.Streamable
{
	public tpcorba.exo4.numeroInconnu value;

	public numeroInconnuHolder ()
	{
	}
	public numeroInconnuHolder(final tpcorba.exo4.numeroInconnu initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return tpcorba.exo4.numeroInconnuHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = tpcorba.exo4.numeroInconnuHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		tpcorba.exo4.numeroInconnuHelper.write(_out, value);
	}
}
