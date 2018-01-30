package tpcorba.exo3;

import org.omg.CORBA.*;
import java.lang.*;
import org.omg.PortableServer.*;


public class allocateurImpl extends allocateurPOA
	{


	// Reference sur la POA
	//
	protected  POA poa_;


	public  allocateurImpl(POA poa)
		{
		poa_=poa;
		}

	public void nouveau_compte(compteHolder cpt, String titulaire, int numero_compte)
        {
        compteImpl compteimpl = new compteImpl(titulaire, numero_compte);
        try {
        cpt.value = compteHelper.narrow(poa_.servant_to_reference(compteimpl));
        } catch (Exception e) {
          System.err.println("ERREUR NARROW()");
        }
        }


	}
