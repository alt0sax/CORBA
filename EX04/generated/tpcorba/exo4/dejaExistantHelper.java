package tpcorba.exo4;


/**
 *	Generated from IDL definition of exception "dejaExistant"
 *	@author JacORB IDL compiler 
 */

public final class dejaExistantHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(tpcorba.exo4.dejaExistantHelper.id(),"dejaExistant",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final tpcorba.exo4.dejaExistant s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static tpcorba.exo4.dejaExistant extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:tpcorba/exo4/dejaExistant:1.0";
	}
	public static tpcorba.exo4.dejaExistant read (final org.omg.CORBA.portable.InputStream in)
	{
		tpcorba.exo4.dejaExistant result = new tpcorba.exo4.dejaExistant();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final tpcorba.exo4.dejaExistant s)
	{
		out.write_string(id());
	}
}
