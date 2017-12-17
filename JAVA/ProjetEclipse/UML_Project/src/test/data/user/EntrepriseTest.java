/**
 * 
 */
package test.data.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.user.Entreprise;

public class EntrepriseTest {
	
	Entreprise entreprise;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		entreprise = new Entreprise("", "", "", "", "", "");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.user.Entreprise#Entreprise(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testEntreprise() {
		assertNotNull(entreprise);
	}

}
