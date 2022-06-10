import static org.junit.Assert.*;

import org.junit.Test;

public class TestTir1 {

	
	//Testo il metodo assegnaCodice_merce(String typeMerc)
	//Il metodo prende una stringa e restituisce un codice identificativo che assegna l'azienda in riferimento al tipo di prodotto da spedire
	@Test
	public void test1() {
		OrgViaggio v = new OrgViaggio();
		assertNotNull(v);
		assertEquals(v.assegnaCodice_merce("Frutta"), 1);
		assertEquals(v.assegnaCodice_merce("Pasta"), 2);
		assertEquals(v.assegnaCodice_merce(" "), 3);
		//assertNotEquals(v.assegnaCodice_merce("Frutta"), 1); -> SBAGLIATO
		assertNotEquals(v.assegnaCodice_merce("Frutta"), 2);
		
	}
	//Testo il metodo assegnaCodice_zona(String typeMerc)
	//Il metodo prende una stringa e restituisce un codice identificativo che assegna l'azienda in riferimento alla zona d'Italia in cui spedire
	@Test
	public void test2() {
		OrgViaggio vi = new OrgViaggio();
		assertNotNull(vi);
		assertEquals(vi.assegnaCodice_zona("NORD"), 4);
		assertNotEquals(vi.assegnaCodice_zona("CENTRO"), 6);
		
	}
	//Testo il metodo flagViaggio(int code_merce,int code_zone)
	//Il metodo prende in input i codici che l'azienda ha precedentemente assegnato (Cod. merce e Cod. zona) ed abilita un flag 
	//Fisicamente in azienda c'è un pulsante che rispecchia un lascia passare al camion affinchè parta al più presto possibile
	/*
	  	Piccolo "oracolo" -> linea guida del funzionamento del lascia passare
	  	Frutta - Nord partire subito -> 1 - 4
		Frutta - Centro partire subito -> 1 - 5
		Pasta - Nord partire subito -> 2 - 4
	 */
	@Test
	public void test3() {
		OrgViaggio vi = new OrgViaggio();
		assertNotNull(vi);
		assertTrue(vi.flagViaggio(1,4));
		assertFalse(vi.flagViaggio(1,6));
	}
	
	//Testo il metodo assegnaCodice_camion(int[] tir, int qta,int zonaIt)
	/*Il metodo prende in input un array di tir che rappresenta il parco macchina dell'azienda, la quantità di mezzi che il cliente desidera 
				e la zona d'Italia in cui spedire la merce */
	//Controllo che l'array di input e quello di output siano diversi
	@Test
	public void test4() {
		OrgViaggio vi = new OrgViaggio();
		vi.assegnaCodice_camion(vi.tir,2,4);
		assertEquals(4,vi.tir[0]);
		assertEquals(4,vi.tir[1]);
		vi.assegnaCodice_camion(vi.tir, 60, 5);
		assertEquals(5,vi.tir[59]);
	}
	
	//Testo il metodo tutto
	@Test
	public void test5() {
		OrgViaggio vi = new OrgViaggio();
		assertNotNull(vi);
		assertTrue(vi.backTir(vi.assegnaCodice_camion(vi.tir, 20, 6)));
		assertTrue(vi.backTir(vi.assegnaCodice_camion(vi.tir, 20, 5)));
		//assertTrue(vi.backTir(vi.assegnaCodice_camion(vi.tir, 20, 5)));
		
	}
}
