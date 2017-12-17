/**
 * 
 */
package test.data.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.user.Envie;

public class EnvieTest {
	
	Envie envie;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		envie = new Envie("", 0.0, "", 0.0, 0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.user.Envie#Envie(java.lang.String, java.lang.Double, java.lang.String, java.lang.Double, int)}.
	 */
	@Test
	public void testEnvie() {
		assertNotNull(envie);
	}

}
