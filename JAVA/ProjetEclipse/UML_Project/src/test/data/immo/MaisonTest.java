/**
 * 
 */
package test.data.immo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.immo.Maison;

public class MaisonTest {
	
	Maison maison;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		maison = new Maison(0, "", "", 0.0, new Date(),
				0.0, 0, 0, "");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.immo.Maison#correspondance(data.user.Envie)}.
	 */
	@Test
	public void testCorrespondance() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link data.immo.Maison#Maison(int, java.lang.String, java.lang.String, java.lang.Double, java.util.Date, java.lang.Double, int, int, java.lang.String)}.
	 */
	@Test
	public void testMaison() {
		assertNotNull(maison);
	}

}
