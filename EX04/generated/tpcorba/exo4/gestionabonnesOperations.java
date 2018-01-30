package tpcorba.exo4;

/**
 *	Generated from IDL interface "gestionabonnes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface gestionabonnesOperations
{
	/* constants */
	/* operations  */
	void creation_abonne(int numero, java.lang.String nom, java.lang.String prenom, tpcorba.exo4.abonneHolder ref) throws tpcorba.exo4.dejaExistant;
	void resilier_abonne(int numero) throws tpcorba.exo4.numeroInconnu;
	void rechercher_abonne(int numero, tpcorba.exo4.abonneHolder ref) throws tpcorba.exo4.numeroInconnu;
}
