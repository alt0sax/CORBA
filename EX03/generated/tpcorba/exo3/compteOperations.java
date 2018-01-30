package tpcorba.exo3;

/**
 *	Generated from IDL interface "compte"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface compteOperations
{
	/* constants */
	/* operations  */
	int numero_compte();
	java.lang.String titulaire();
	double solde();
	int nombre_operations();
	void debiter(double montant);
	void crediter(double montant);
	void prelevement(double montant, tpcorba.exo3.compte destination);
}
