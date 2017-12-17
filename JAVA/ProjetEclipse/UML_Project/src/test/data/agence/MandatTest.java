/**
 * 
 */
package test.data.agence;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.agence.Mandat;

/**
 * @author guira
 *
 */
public class MandatTest {
	
	Mandat mandat;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mandat = new Mandat(0.0, new Date(), new Date(), new Date(), null, null);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.agence.Mandat#Mandat(java.lang.Double, java.util.Date, java.util.Date, java.util.Date, data.immo.BienImmo, data.user.Client)}.
	 */
	@Test
	public void testMandat() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link data.agence.Mandat#addRdvVisite(java.util.Date, data.user.Client)}.
	 */
	@Test
	public void testAddRdvVisite() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link data.agence.Mandat#addRdvVendeur(java.util.Date, data.user.Client)}.
	 */
	@Test
	public void testAddRdvVendeur() {
		fail("Not yet implemented"); // TODO
	}

}
