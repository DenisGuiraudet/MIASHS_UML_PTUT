/**
 * 
 */
package test.data.pub;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.pub.TypeVid;

public class TypeVidTest {
	
	TypeVid typeVid;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		typeVid = new TypeVid("test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.pub.TypeVid#getElem()}.
	 */
	@Test
	public void testGetElem() {
		assertEquals("test", typeVid.getElem());
	}

	/**
	 * Test method for {@link data.pub.TypeVid#TypeVid(java.lang.String)}.
	 */
	@Test
	public void testTypeVid() {
		assertNotNull(typeVid);
	}

}
