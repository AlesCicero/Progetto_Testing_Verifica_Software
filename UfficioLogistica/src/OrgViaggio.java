import java.util.Calendar;


public class OrgViaggio {

	/*@ spec_public @*/ public int[] tir;
	
	//@ public_invariant tir != null;
	
	//Costruttore - inizializza il parco macchina in cui vi sono 60 Tir totali
	//@ ensures tir.length == 60;
	public OrgViaggio(){
		tir = new int[60]; // Parco macchina
	}

	//@ requires typeMerc.equals("Frutta") || typeMerc.qequals("Pasta") || typeMerc.equals("");
	//@ ensures \result == 1 ==> 
	public int assegnaCodice_merce(String typeMerc) {
		if(typeMerc.equals("Frutta")) return 1;
		else if(typeMerc.equals("Pasta")) return 2;
		else return 3;
	}
	
	public int assegnaCodice_zona(String typeZone) {
		int zone = 0;
		if(typeZone.equals("NORD")) zone = 4; //codice identificativo Azienda
		else {
			if(typeZone.equals("CENTRO")) zone = 5;  //codice identificativo Azienda
			else if(typeZone.equals("SUD")) zone = 6;  //codice identificativo Azienda
		}
		return zone;
	}
	
	//Ottenuti i codici identificativi l'azienda autorizza il viaggio in modo imminente oppure aspettare e spedire la merce in un secondo momento
	public boolean flagViaggio(int code_merce,int code_zone) {
		
		boolean res; //inizialmente nessuno può partire
		
		//Frutta - Nord partire subito -> 1 - 4
		//Frutta - Centro partire subito -> 1 - 5
		//Pasta - Nord partire subito -> 2 - 4
		//Tutti gli altri casi non obbligatorimente subito
		if (code_merce == 1 && (code_zone == 4  || code_zone == 5)) {
			res = true;
		}
		else if(code_merce == 2 && code_zone == 4) {
			res = true;
		}
		else {
			res = false;
		}
			
		return res;
			
	}
	
	
	public int[] assegnaCodice_camion(int[] tir, int qta,int zonaIt) {
		
		for(int i = 0;i < qta;i++) {
}
		 return tir;
		
	}
	
	public boolean backTir(int[] tir)  {
		boolean yesReturn = false;
		
		for(int i = 0;i < tir.length;i++) {

			if(tir[i] != 0 && tir[i] == 4) {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DATE, 4);	
				System.out.print("Il mezzo tornerà: " + calendar.getTime() + "\n");
				yesReturn = true;
			}
			else if(tir[i] != 0 && tir[i] == 5) {
					Calendar calendar = Calendar.getInstance();
					calendar.add(Calendar.DATE, 2);	
					System.out.print("Il mezzo tornerà: " + calendar.getTime() + "\n");
					yesReturn = true;
				}
			
			else if(tir[i] != 0 && tir[i] == 6) {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DATE, 1);	
				System.out.print("Il mezzo tornerà: " + calendar.getTime() + "\n");
				yesReturn = true;
			}
		}
				
		return yesReturn;
	}
	
}
	

