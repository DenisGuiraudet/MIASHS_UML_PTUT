/**
 * 
 */
package test.data.agence;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.agence.Notaire;
import data.agence.Promesse;

public class PromesseTest {
	
	Promesse promesse;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		promesse = new Promesse(0.0, "", new Date(), 0.0, 0.0,
				null, null, new Notaire("", ""));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.agence.Promesse#Promesse(java.lang.Double, java.lang.String, java.util.Date, java.lang.Double, java.lang.Double, data.immo.BienImmo, data.user.Client, data.agence.Notaire)}.
	 */
	@Test
	public void testPromesse() {
		assertNotNull(promesse);
	}

	/**
	 * Test method for {@link data.agence.Promesse#signerPromesse()}.
	 */
	@Test
	public void testSignerPromesse() {
		assertEquals(false, promesse.isEtatFinit());
		promesse.signerPromesse();
		assertEquals(true, promesse.isEtatFinit());
	}

}
