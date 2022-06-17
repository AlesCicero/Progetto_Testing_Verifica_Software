import static org.junit.Assert.*;

import org.junit.Test;

public class StatmentTest {

		@Test
		public void test1() {
			OrgViaggio v = new OrgViaggio();
			assertNotNull(v);
			assertEquals(v.assegnaCodice_merce(1), 1);
			assertNotEquals(v.assegnaCodice_merce(2), 1);
			assertEquals(v.assegnaCodice_merce(2), 2);
			assertNotEquals(v.assegnaCodice_merce(90), 2);
			assertEquals(v.assegnaCodice_merce(50), 3);
			assertNotEquals(v.assegnaCodice_merce(-5), 3);
			assertEquals(v.assegnaCodice_merce(-5), 0);
			assertNotEquals(v.assegnaCodice_merce(3), 2);
		}
		
		
		@Test
		public void test2() {
			OrgViaggio vi = new OrgViaggio();
			assertNotNull(vi);
			assertEquals(vi.assegnaCodice_zona(4), 4);
			assertNotEquals(vi.assegnaCodice_zona(4), 5);
			assertEquals(vi.assegnaCodice_zona(5), 5);
			assertNotEquals(vi.assegnaCodice_zona(5), 4);
			assertEquals(vi.assegnaCodice_zona(90), 6);
			assertNotEquals(vi.assegnaCodice_zona(90), 5);
			assertEquals(vi.assegnaCodice_zona(120), 7);
			assertNotEquals(vi.assegnaCodice_zona(5),6);
			assertEquals(vi.assegnaCodice_zona(200), 8);
			assertNotEquals(vi.assegnaCodice_zona(200), 4);
			
		}
		
		@Test
		public void test3() {
			OrgViaggio vi = new OrgViaggio();
			assertNotNull(vi);
			assertTrue(vi.flagViaggio(1,4));
			assertTrue(vi.flagViaggio(1,7));
			assertTrue(vi.flagViaggio(2,4));
			assertTrue(vi.flagViaggio(2,7));
			assertFalse(vi.flagViaggio(1,5));
			assertFalse(vi.flagViaggio(2,6));
			assertFalse(vi.flagViaggio(3,8));
		}
		
		//Testo il metodo assegnaCodice_camion(int[] tir, int qta,int zonaIt)
		/*Il metodo prende in input un array di tir che rappresenta il parco macchina dell'azienda, la quantità di mezzi che il cliente desidera 
					e la zona d'Italia in cui spedire la merce */
		//Controllo che l'array di input e quello di output siano diversi
		@Test
		public void test4() {
			OrgViaggio vi = new OrgViaggio();
			assertTrue(vi.assegnaCodice_camion(vi.tir,2,5));
			assertFalse(vi.assegnaCodice_camion(vi.tir,2,8));
		}
}
