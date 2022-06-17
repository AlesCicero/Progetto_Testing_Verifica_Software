
public class UfficioLogistica {

	public static void main(String[] args) {
		
		
		OrgViaggio v = new OrgViaggio();
		
		//-------------------------------------
		//Provo a violare i contratti
		//Nella funzione assegnaCodice_merce -> // @ requires 1 <= typeMerc || typeMerc <= 100
		//Passo alla funzione 105 -> mi aspetto violazione contratto
		 //v.assegnaCodice_merce(200);
		//ERRORE
		//-------------------------------------
		
		
		//-------------------------------------
		//Provo a violare i contratti
		//Nella funzione assegnaCodice_zona -> // @ requires 4 <= typeZone || typeZone < 150
		//Passo alla funzione 200 -> mi aspetto violazione contratto
		 //v.assegnaCodice_zona(500);
		//ERRORE
		//-------------------------------------
		

		//-------------------------------------
		//Provo a violare i contratti
		//Nella funzione flagViaggio -> // @ requires 4 <= typeZone || typeZone < 150
		//Passo alla funzione 200 -> mi aspetto violazione contratto
		 //v.assegnaCodice_zona(500);
		//ERRORE
		//-------------------------------------
		
		
		//-------------------------------------
		//Provo a violare i contratti
		 //Nella funzione assegnaCodice_camion -> // @ requires qta < 60
		 // @ requires 4 <= zonaIt  && zonaIt <= 8
		 //Passo alla funzione 200 -> mi aspetto violazione contratto
		  //v.assegnaCodice_camion(v.tir, 65, 10);
		 //ERRORE
		 //-------------------------------------
		
	}
	
		
}
