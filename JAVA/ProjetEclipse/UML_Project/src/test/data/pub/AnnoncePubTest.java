/**
 * 
 */
package test.data.pub;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.pub.AnnoncePub;
import data.pub.TypeHtml;
import data.pub.TypeImg;
import data.pub.TypeTexte;
import data.pub.TypeVid;

public class AnnoncePubTest {
	
	AnnoncePub annoncePub;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		annoncePub = new AnnoncePub();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.pub.AnnoncePub#AnnoncePub()}.
	 */
	@Test
	public void testAnnoncePub() {
		assertNotNull(annoncePub);
	}

	/**
	 * Test method for {@link data.pub.AnnoncePub#ajouterPub(data.pub.TypePub)}.
	 */
	@Test
	public void testAjouterPub() {
		assertEquals(0, annoncePub.getListePub().size());
		annoncePub.ajouterPub(new TypeTexte(""));
		assertEquals(1, annoncePub.getListePub().size());
		annoncePub.ajouterPub(new TypeHtml(""));
		assertEquals(2, annoncePub.getListePub().size());
		annoncePub.ajouterPub(new TypeImg(""));
		assertEquals(3, annoncePub.getListePub().size());
		annoncePub.ajouterPub(new TypeVid(""));
		assertEquals(4, annoncePub.getListePub().size());
	}

}
