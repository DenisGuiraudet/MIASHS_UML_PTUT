/**
 * 
 */
package test.data.immo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.immo.Appartement;

public class AppartementTest {
	
	Appartement appartement;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		appartement = new Appartement(0, "", "", 0.0, new Date(),
				0, 0, 0.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.immo.Appartement#correspondance(data.user.Envie)}.
	 */
	@Test
	public void testCorrespondance() {
		// TODO
	}

	/**
	 * Test method for {@link data.immo.Appartement#Appartement(int, java.lang.String, java.lang.String, java.lang.Double, java.util.Date, int, int, java.lang.Double)}.
	 */
	@Test
	public void testAppartement() {
		assertNotNull(appartement);
	}

}
