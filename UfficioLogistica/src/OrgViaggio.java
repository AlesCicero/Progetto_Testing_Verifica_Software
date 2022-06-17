import java.util.Calendar;


public class OrgViaggio {

	/*@ spec_public @*/ public int[] tir;
	
	//@ public invariant tir != null;
	//@ public invariant tir.length == 60;
	
	//Costruttore - inizializza il parco macchina in cui vi sono 60 Tir totali
	//@ ensures tir.length == 60;
	public OrgViaggio(){
		tir = new int[60]; // Parco macchina
	}

	//@ requires 1 <= typeMerc && typeMerc <= 100;
	//@ ensures \result == 1 ==> typeMerc == 1;
	//@ ensures \result == 2 ==> typeMerc == 2;
	//@ ensures \result == 3 ==> typeMerc > 2 && typeMerc < 100;
	//@ ensures \result == 0 <==>  typeMerc >= 100 || typeMerc < 1;
	public int assegnaCodice_merce(int typeMerc) {
		if(typeMerc == 1) return 1;
		else if(typeMerc == 2) return 2;
		if(typeMerc > 2 && typeMerc < 100) return 3;
		return 0;
	}
	
	//@ requires 4 <= typeZone && typeZone < 150;
	//@ ensures \result == 4 ==> typeZone == 4;
	//@ ensures \result == 5 ==> typeZone == 5;
	//@ ensures \result == 6 <==>  typeZone > 5 || typeZone < 100;
	//@ ensures \result == 7 <==>  typeZone >= 100 || typeZone < 150;
	//@ ensures \result == 8 <==>  typeZone < 4 || typeZone > 150;
	public int assegnaCodice_zona(int typeZone) {
		if(typeZone == 4) return 4; //NORD
		else if(typeZone == 5) return 5; //CENTRO
		if(typeZone  > 5 && typeZone < 100) return 6; //SUD
		else if(typeZone >= 100 && typeZone < 150) //EST - EUROPA
			return 7;
		else return 8; //SPEDIZIONE NON GESTITA
	}
	
	
	//Ottenuti i codici identificativi l'azienda autorizza il viaggio in modo imminente oppure aspettare e spedire la merce in un secondo momento
	//Codice_merce -> 1 - 2 - [3:99]
	//Codice_zona -> 4 - 5 - 6 - [100: 149] - minori di 4 or maggiori di 150 FALSE -> SPEDIZIONE NON GESTITA
	// Prodotti 1 e 2 in EST - EUROPA oppure NORD PARTIRE SUBITO
	//Gli altri casi false 
	//-----------
	//@ requires 0 <= code_merce && code_merce <= 3;
	//@ requires 4 <= code_zone && code_zone <= 8;
	//@ ensures \result == true <==> (code_merce == 1 || code_merce ==2) && (code_zone == 7 || code_zone == 4);
	//@ ensures \result  == false ==> !((code_merce == 1 || code_merce ==2) && (code_zone == 7 || code_zone == 4));
	//-----------
	public boolean flagViaggio(int code_merce,int code_zone) {
		boolean res = false; //inizialmente nessuno può partire
		if(code_merce == 1 || code_merce == 2) {
			if(code_zone == 4 || code_zone == 7) return true;
		}
		return res;
	}
	

	
	//@ requires qta < 60;
	//@ requires 4 <= zonaIt  && zonaIt <= 8;
	//@ ensures \result == true ==> zonaIt != 8;
	//@ ensures (\forall int i; 0 <= i && i < qta; tir[i] == zonaIt);
	//@ ensures \result == false ==> zonaIt == 8;
	//@ diverges true;
	public boolean assegnaCodice_camion(int[] tir, int qta,int zonaIt) {
		
		if(zonaIt == 8) return false;
		else {
			//@ loop_invariant 0 <= i && i <= qta && (\forall int j; 0 <= j && j <i; tir[j] == zonaIt);
			for(int i = 0; i < qta; i++) {
				tir[i] = zonaIt;
			}
			return true;
		}
	}
}
	

