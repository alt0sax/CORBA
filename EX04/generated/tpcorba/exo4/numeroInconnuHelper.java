package tpcorba.exo4;


/**
 *	Generated from IDL definition of exception "numeroInconnu"
 *	@author JacORB IDL compiler 
 */

public final class numeroInconnuHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(tpcorba.exo4.numeroInconnuHelper.id(),"numeroInconnu",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final tpcorba.exo4.numeroInconnu s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static tpcorba.exo4.numeroInconnu extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:tpcorba/exo4/numeroInconnu:1.0";
	}
	public static tpcorba.exo4.numeroInconnu read (final org.omg.CORBA.portable.InputStream in)
	{
		tpcorba.exo4.numeroInconnu result = new tpcorba.exo4.numeroInconnu();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final tpcorba.exo4.numeroInconnu s)
	{
		out.write_string(id());
	}
}
