
public class UfficioLogistica {

	public static void main(String[] args) {
		
		OrgViaggio v = new OrgViaggio();
		System.out.println(v.assegnaCodice_merce("Frutta") + "\n");
		System.out.println(v.assegnaCodice_zona("NORD") + "\n");
		System.out.println(v.flagViaggio(v.assegnaCodice_merce("Frutta"), v.assegnaCodice_zona("NORD")) + "\n");
		System.out.println(v.backTir(v.assegnaCodice_camion(v.tir,1, v.assegnaCodice_zona("NORD"))) + "\n");
		System.out.println(v.backTir(v.assegnaCodice_camion(v.tir,1, v.assegnaCodice_zona("CENTRO"))) + "\n");
		System.out.println(v.backTir(v.assegnaCodice_camion(v.tir,1, v.assegnaCodice_zona("SUD"))) + "\n");
		
		System.out.println(v.backTir(v.assegnaCodice_camion(v.tir,10, v.assegnaCodice_zona("SUD"))) + "\n");
	}
	//VIDEO FATTI PER TUTORIAL -> SELENIUM
	
		
}
