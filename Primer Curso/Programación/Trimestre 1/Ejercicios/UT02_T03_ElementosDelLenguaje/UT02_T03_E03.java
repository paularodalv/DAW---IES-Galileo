package Temas;

public class UT02T03E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bDato=(byte)1; 
        short sDato=(short)0; 
        int iDato=0; 
        long lDato=0L; 
        float fDato=0.0F; 
        double dDato=0.0; 



        sDato = bDato; 
        iDato = sDato; 
        lDato = iDato; 
        fDato = lDato; 
        dDato = fDato + lDato - iDato * sDato / bDato; 

        System.out.println("Resultado: " + dDato); 
	}

}
