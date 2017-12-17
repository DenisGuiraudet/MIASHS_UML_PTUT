/**
 * 
 */
package test.data.agence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.agence.Notaire;

/**
 * @author guira
 *
 */
public class NotaireTest {
	
	Notaire notaire;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		notaire = new Notaire("", "");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.agence.Notaire#Notaire(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testNotaire() {
		assertNotNull("Notaire", notaire);
	}

	/**
	 * Test method for {@link data.agence.Notaire#verserArgent()}.
	 */
	@Test
	public void testVerserArgent() {
		fail("Not yet implemented"); // TODO
	}

}
