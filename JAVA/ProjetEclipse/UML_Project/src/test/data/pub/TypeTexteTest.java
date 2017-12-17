/**
 * 
 */
package test.data.pub;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.pub.TypeTexte;

public class TypeTexteTest {
	
	TypeTexte typeTexte;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		typeTexte = new TypeTexte("test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.pub.TypeTexte#getElem()}.
	 */
	@Test
	public void testGetElem() {
		assertEquals("test", typeTexte.getElem());
	}

	/**
	 * Test method for {@link data.pub.TypeTexte#TypeTexte(java.lang.String)}.
	 */
	@Test
	public void testTypeTexte() {
		assertNotNull(typeTexte);
	}

}
