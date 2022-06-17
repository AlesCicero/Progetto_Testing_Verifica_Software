import static org.junit.Assert.*;

import org.junit.Test;

public class TestTir1 {

	
	//Testo il metodo assegnaCodice_merce(String typeMerc)
	//Il metodo prende una stringa e restituisce un codice identificativo che assegna l'azienda in riferimento al tipo di prodotto da spedire
	@Test
	public void test1() {
		OrgViaggio v = new OrgViaggio();
		assertNotNull(v);
		assertEquals(v.assegnaCodice_merce(1), 1);
		assertEquals(v.assegnaCodice_merce(2), 2);
		assertEquals(v.assegnaCodice_merce(50), 3);
		assertEquals(v.assegnaCodice_merce(-5), 0);
		//assertNotEquals(v.assegnaCodice_merce("Frutta"), 1); -> SBAGLIATO
		
	}
	//Testo il metodo assegnaCodice_zona(String typeMerc)
	//Il metodo prende una stringa e restituisce un codice identificativo che assegna l'azienda in riferimento alla zona d'Italia in cui spedire
	@Test
	public void test2() {
		OrgViaggio vi = new OrgViaggio();
		assertNotNull(vi);
		assertEquals(vi.assegnaCodice_zona(4), 4);
		assertEquals(vi.assegnaCodice_zona(5), 5);
		assertEquals(vi.assegnaCodice_zona(90), 6);
		//assertEquals(vi.assegnaCodice_zona(-5), 8);
		
	}
	//Testo il metodo flagViaggio(int code_merce,int code_zone)
	//Il metodo prende in input i codici che l'azienda ha precedentemente assegnato (Cod. merce e Cod. zona) ed abilita un flag 
	//Fisicamente in azienda c'è un pulsante che rispecchia un lascia passare al camion affinchè parta al più presto possibile
	@Test
	public void test3() {
		OrgViaggio vi = new OrgViaggio();
		assertNotNull(vi);
		assertTrue(vi.flagViaggio(1,4));
		assertFalse(vi.flagViaggio(1,6));
		assertFalse(vi.flagViaggio(1,8));
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
}
