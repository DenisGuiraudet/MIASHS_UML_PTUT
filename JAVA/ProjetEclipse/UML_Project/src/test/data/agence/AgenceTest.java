/**
 * 
 */
package test.data.agence;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.agence.Agence;
import data.pub.TypeHtml;
import data.pub.TypeImg;
import data.pub.TypeTexte;
import data.pub.TypeVid;

public class AgenceTest {

	Agence agence;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		agence = new Agence("");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link data.agence.Agence#Agence(java.lang.String)}.
	 */
	@Test
	public void testAgence() {
		assertNotNull("Agence", agence);
	}

	/**
	 * Test method for {@link data.agence.Agence#creerPersonne(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCreerPersonne() {
		assertEquals(0, agence.getListeClient().size());
		agence.creerPersonne("", "", "", "");
		assertEquals(1, agence.getListeClient().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#creerEntreprise(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCreerEntreprise() {
		assertEquals(0, agence.getListeClient().size());
		agence.creerEntreprise("", "", "", "", "", "");
		assertEquals(1, agence.getListeClient().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#creerTerrain(int, java.lang.String, java.lang.String, java.lang.Double, java.util.Date, java.lang.Double, java.lang.Double)}.
	 */
	@Test
	public void testCreerTerrain() {
		assertEquals(0, agence.getListeBien().size());
		agence.creerTerrain(0, "", "", 0.0, new Date(), 0.0, 0.0);
		assertEquals(1, agence.getListeBien().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#creerMaison(int, java.lang.String, java.lang.String, java.lang.Double, java.util.Date, java.lang.Double, int, int, java.lang.String)}.
	 */
	@Test
	public void testCreerMaison() {
		assertEquals(0, agence.getListeBien().size());
		agence.creerMaison(0, "", "", 0.0, new Date(), 0.0, 0, 0, "");
		assertEquals(1, agence.getListeBien().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#creerAppartement(int, java.lang.String, java.lang.String, java.lang.Double, java.util.Date, int, int, java.lang.Double)}.
	 */
	@Test
	public void testCreerAppartement() {
		assertEquals(0, agence.getListeBien().size());
		agence.creerAppartement(0, "", "", 0.0, new Date(), 0, 0, 0.0);
		assertEquals(1, agence.getListeBien().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#creerMandat(java.lang.Double, java.util.Date, java.util.Date, java.util.Date, data.immo.BienImmo, data.user.Client)}.
	 */
	@Test
	public void testCreerMandat() {
		assertEquals(0, agence.getListeMandat().size());
		agence.creerMandat(0.0, new Date(), new Date(), new Date(), null, null);
		assertEquals(1, agence.getListeMandat().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#organiserVisite(data.user.Client, data.agence.Mandat, java.util.Date)}.
	 */
	@Test
	public void testOrganiserVisite() {
		agence.creerMandat(0.0, new Date(), new Date(), new Date(), null, null);
		assertEquals(0, agence.getListeMandat().get(0).getListeRdvVisite().size());
		agence.organiserVisite(null, agence.getListeMandat().get(0), new Date());
		assertEquals(1, agence.getListeMandat().get(0).getListeRdvVisite().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#organiserVente(data.user.Client, data.agence.Mandat, java.util.Date)}.
	 */
	@Test
	public void testOrganiserVente() {
		agence.creerMandat(0.0, new Date(), new Date(), new Date(), null, null);
		assertEquals(0, agence.getListeMandat().get(0).getListeRdvVendeur().size());
		agence.organiserVente(null, agence.getListeMandat().get(0), new Date());
		assertEquals(1, agence.getListeMandat().get(0).getListeRdvVendeur().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#creerNotaire(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCreerNotaire() {
		assertEquals(0, agence.getListeNotaire().size());
		agence.creerNotaire("", "");
		assertEquals(1, agence.getListeNotaire().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#voirStats()}.
	 */
	@Test
	public void testVoirStats() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link data.agence.Agence#creerDocument()}.
	 */
	@Test
	public void testCreerDocument() {
		assertEquals(0, agence.getListeAnnonce().size());
		agence.creerDocument();
		assertEquals(1, agence.getListeAnnonce().size());
	}

	/**
	 * Test method for {@link data.agence.Agence#ajouterPub(data.pub.AnnoncePub, data.pub.TypePub)}.
	 */
	@Test
	public void testAjouterPub() {
		agence.creerDocument();
		assertEquals(0, agence.getListeAnnonce().get(0).getListePub().size());
		agence.ajouterPub(agence.getListeAnnonce().get(0), new TypeTexte(""));
		assertEquals(1, agence.getListeAnnonce().get(0).getListePub().size());
		agence.ajouterPub(agence.getListeAnnonce().get(0), new TypeHtml(""));
		assertEquals(2, agence.getListeAnnonce().get(0).getListePub().size());
		agence.ajouterPub(agence.getListeAnnonce().get(0), new TypeImg(""));
		assertEquals(3, agence.getListeAnnonce().get(0).getListePub().size());
		agence.ajouterPub(agence.getListeAnnonce().get(0), new TypeVid(""));
		assertEquals(4, agence.getListeAnnonce().get(0).getListePub().size());
	}
	
}
