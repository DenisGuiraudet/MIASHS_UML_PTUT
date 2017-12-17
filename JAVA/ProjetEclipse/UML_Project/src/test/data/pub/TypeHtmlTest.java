/**
 * 
 */
package test.data.pub;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.pub.TypeHtml;

public class TypeHtmlTest {
	
	TypeHtml typeHtml;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		typeHtml = new TypeHtml("test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.pub.TypeHtml#getElem()}.
	 */
	@Test
	public void testGetElem() {
		assertEquals("test", typeHtml.getElem());
	}

	/**
	 * Test method for {@link data.pub.TypeHtml#TypeHtml(java.lang.String)}.
	 */
	@Test
	public void testTypeHtml() {
		assertNotNull(typeHtml);
	}

}
