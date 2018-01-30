package tpcorba.exo4;

/**
 *	Generated from IDL definition of exception "dejaExistant"
 *	@author JacORB IDL compiler 
 */

public final class dejaExistantHolder
	implements org.omg.CORBA.portable.Streamable
{
	public tpcorba.exo4.dejaExistant value;

	public dejaExistantHolder ()
	{
	}
	public dejaExistantHolder(final tpcorba.exo4.dejaExistant initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return tpcorba.exo4.dejaExistantHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = tpcorba.exo4.dejaExistantHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		tpcorba.exo4.dejaExistantHelper.write(_out, value);
	}
}
