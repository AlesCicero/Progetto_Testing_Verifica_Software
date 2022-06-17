import static org.junit.Assert.*;

import org.junit.Test;

public class MCDC {

	@Test
	public void test1() {
		OrgViaggio v = new OrgViaggio();
		assertNotNull(v);
		//MCDC 
		// typeMerc > 2 && typeMerc < 100
		// 	T			 T   typeMerc = 30
		// 	F			 T   typeMerc = -5
		//  T			 T   typeMerc = 50 (SI RIPETE)
		//  T			 F   typeMerc = 200
		
		assertEquals(v.assegnaCodice_merce(30), 3);
		assertEquals(v.assegnaCodice_merce(-5), 0);
		assertEquals(v.assegnaCodice_merce(50), 3);
		assertEquals(v.assegnaCodice_merce(200), 0);
	}
	
	
	@Test
	public void test2() {
		OrgViaggio vi = new OrgViaggio();
		assertNotNull(vi);
		//MCDC 
		// typeZone > 5 && typeZone < 100
		// 	T			 T   typeZone = 60
		// 	F			 T   typeZone =  -20
		//  T			 T   typeZone = 60 (SI RIPETE)
		//  T			 F   typeZone = 200
		
		assertEquals(vi.assegnaCodice_zona(60), 6);
		assertEquals(vi.assegnaCodice_zona(-20), 8);
		assertEquals(vi.assegnaCodice_zona(60), 6);
		assertEquals(vi.assegnaCodice_zona(200), 8);
		
		//MCDC 
		// typeMerc >= 100  && typeZone < 150
		// 	T			 T   typeZone =  120
		// 	F			 T   typeZone = 90
		//  T			 T   typeZone = 120 (SI RIPETE)
		//  T			 F   
		
		assertEquals(vi.assegnaCodice_zona(120), 7);
		assertEquals(vi.assegnaCodice_zona(90), 6);
		assertEquals(vi.assegnaCodice_zona(60), 6);
		assertEquals(vi.assegnaCodice_zona(300), 8);
		
	}
	
	@Test
	public void test3() {
		OrgViaggio vi = new OrgViaggio();
		assertNotNull(vi);
		
		//MCDC 
		// code_merce == 1 || code_merce == 2 
		// 	T			 F   code_merce = 1
		// 	F			 F   code_merce =  0
		//  F			 T   code_merce = 2
		//  F			 F   code_merce = 3
		
		assertTrue(vi.flagViaggio(1,4));
		assertFalse(vi.flagViaggio(0,5));
		assertFalse(vi.flagViaggio(2,5));
		assertFalse(vi.flagViaggio(3,5));
		
		//MCDC 
		// code_zone == 4 || code_zone == 2 
		// 	T			 F   code_zone = 4
		// 	F			 F   code_zone =  6
		//  F			 T   code_zone = 2
		//  F			 F   code_zone = 5
		
		assertTrue(vi.flagViaggio(1,4));
		assertFalse(vi.flagViaggio(1,6));
		assertFalse(vi.flagViaggio(1,2));
		assertFalse(vi.flagViaggio(1,5));

	}
}
