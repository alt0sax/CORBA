package tpcorba.exo2;

/**
 *	Generated from IDL interface "calcul"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface calculOperations
{
	/* constants */
	/* operations  */
	double memoire();
	void ajouteMemoire(double donnee);
	void soustraitMemoire(double donnee);
	void multiplieMemoire(double donnee);
	void diviseMemoire(double donnee) throws tpcorba.exo2.divisionParZero;
	void miseAZero();
	void incrementer(org.omg.CORBA.IntHolder data);
	void decrementer(org.omg.CORBA.IntHolder data);
}
