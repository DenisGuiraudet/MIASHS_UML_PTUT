/**
 * 
 */
package test.data.pub;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.pub.TypeImg;

public class TypeImgTest {
	
	TypeImg typeImg;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		typeImg = new TypeImg("test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.pub.TypeImg#getElem()}.
	 */
	@Test
	public void testGetElem() {
		assertEquals("test", typeImg.getElem());
	}

	/**
	 * Test method for {@link data.pub.TypeImg#TypeImg(java.lang.String)}.
	 */
	@Test
	public void testTypeImg() {
		assertNotNull(typeImg);
	}

}
