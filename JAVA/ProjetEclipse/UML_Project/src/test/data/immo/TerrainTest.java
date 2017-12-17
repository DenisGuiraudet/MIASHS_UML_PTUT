/**
 * 
 */
package test.data.immo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.immo.Terrain;

public class TerrainTest {
	
	Terrain terrain;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		terrain = new Terrain(0, "", "", 0.0, new Date(),
				0.0, 0.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.immo.Terrain#correspondance(data.user.Envie)}.
	 */
	@Test
	public void testCorrespondance() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link data.immo.Terrain#Terrain(int, java.lang.String, java.lang.String, java.lang.Double, java.util.Date, java.lang.Double, java.lang.Double)}.
	 */
	@Test
	public void testTerrain() {
		assertNotNull(terrain);
	}

}
