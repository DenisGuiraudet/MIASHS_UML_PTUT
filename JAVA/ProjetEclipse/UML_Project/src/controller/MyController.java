
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.ZoneId;
import java.util.Date;

import data.agence.Agence;
import data.agence.Mandat;
import data.agence.Notaire;
import data.immo.BienImmo;
import data.pub.AnnoncePub;
import data.pub.TypeHtml;
import data.pub.TypeImg;
import data.pub.TypeTexte;
import data.pub.TypeVid;
import data.user.Client;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public class MyController {
	
	private Agence agence;

	@FXML
    private TextField client_nom;

    @FXML
    private TextField client_adresse;

    @FXML
    private TextField client_phone;

    @FXML
    private TextField client_email;

    @FXML
    private TextField client_ent_siren;

    @FXML
    private TextField client_ent_juri;

    @FXML
    private ToggleButton client_switch_entV;

    @FXML
    private TextArea client_toString;

    @FXML
    private TextField bien_num;

    @FXML
    private ChoiceBox<?> bien_type;

    @FXML
    private TextField bien_adresse;

    @FXML
    private TextField bien_orientation;

    @FXML
    private TextField bien_prix;

    @FXML
    private DatePicker bien_dateVente;

    @FXML
    private TextField bien_ter_surSol;

    @FXML
    private TextField bien_ter_longFac;

    @FXML
    private TextField bien_mai_surHab;

    @FXML
    private TextField bien_mai_nbPi;

    @FXML
    private TextField bien_mai_nbEt;

    @FXML
    private TextField bien_mai_chauf;

    @FXML
    private TextField bien_app_nbPi;

    @FXML
    private TextField bien_app_nbEt;

    @FXML
    private TextField bien_app_chargeMensu;

    @FXML
    private TextArea bien_toString;

    @FXML
    private TextField mandat_prix;

    @FXML
    private DatePicker mandat_dateVente;

    @FXML
    private DatePicker mandat_dateDebut;

    @FXML
    private DatePicker mandat_dateFin;

    @FXML
    private TextArea mandat_toString;

    @FXML
    private ChoiceBox<?> mandat_listClient;

    @FXML
    private ChoiceBox<?> mandat_listBien;

    @FXML
    private TextField prom_prixVerse;

    @FXML
    private DatePicker prom_dateVente;

    @FXML
    private TextField prom_commiAgen;

    @FXML
    private TextField prom_fraisVente;

    @FXML
    private TextArea promesse_toString;

    @FXML
    private ChoiceBox<?> prom_listClient;

    @FXML
    private ChoiceBox<?> prom_listBien;

    @FXML
    private ChoiceBox<?> prom_listNotaire;

    @FXML
    private ChoiceBox<?> envie_type;

    @FXML
    private TextField envie_prix;

    @FXML
    private TextField envie_loca;

    @FXML
    private TextField envie_surSol;

    @FXML
    private TextField envie_nbPi;

    @FXML
    private TextArea envie_toString;

    @FXML
    private ChoiceBox<?> envie_listClient;

    @FXML
    private DatePicker rdv_date;

    @FXML
    private ChoiceBox<?> rdv_type;

    @FXML
    private TextArea rdv_toString;

    @FXML
    private ChoiceBox<?> rdv_listClient;

    @FXML
    private ChoiceBox<?> rdv_listMandat;

    @FXML
    private TextArea pub_desc;

    @FXML
    private ChoiceBox<?> pub_type;

    @FXML
    private TextArea pub_toString;

    @FXML
    private ChoiceBox<?> pub_listDoc;

    @FXML
    private TextArea stat_toString;

    @FXML
    private TextField notaire_nom;

    @FXML
    private TextField notaire_adresse;

    @FXML
    private TextArea notaire_toString;
    
    @FXML
    public void initialize() {
    	
    	try {
    		File myFile = new File("agence.dat");
	    	FileInputStream fin = new FileInputStream(myFile);
	    	ObjectInputStream ois = new ObjectInputStream(fin);
	    	agence = (Agence) ois.readObject();
	    	ois.close();
    	} catch (Exception e) {
        	agence = new Agence("Timmo");
    		e.printStackTrace();
    	}
    	
        ((ChoiceBox<String>)bien_type).getItems().add("Terrain");
        ((ChoiceBox<String>)bien_type).getItems().add("Maison");
        ((ChoiceBox<String>)bien_type).getItems().add("Appartement");
        ((ChoiceBox<String>)bien_type).getSelectionModel().select(0);
        
        ((ChoiceBox<String>)envie_type).getItems().add("Terrain");
        ((ChoiceBox<String>)envie_type).getItems().add("Maison");
        ((ChoiceBox<String>)envie_type).getItems().add("Appartement");
        ((ChoiceBox<String>)envie_type).getSelectionModel().select(0);
        
        ((ChoiceBox<String>)pub_type).getItems().add("Texte");
        ((ChoiceBox<String>)pub_type).getItems().add("HTML");
        ((ChoiceBox<String>)pub_type).getItems().add("Img");
        ((ChoiceBox<String>)pub_type).getItems().add("Vid");
        ((ChoiceBox<String>)pub_type).getSelectionModel().select(0);
        
        ((ChoiceBox<String>)rdv_type).getItems().add("RDV");
        ((ChoiceBox<String>)rdv_type).getItems().add("RDV Visite");
        ((ChoiceBox<String>)rdv_type).getItems().add("RDV Vendeur");
        ((ChoiceBox<String>)rdv_type).getSelectionModel().select(0);
        
    }

    @FXML
    void bien_aff(ActionEvent event) {
    	
    	bien_toString.setText(agence.getListeBien().toString());

    }

    @FXML
    void bien_creer(ActionEvent event) {
    	
    	try {
    		
    		if (((String)bien_type.getSelectionModel().getSelectedItem()) == "Terrain") {
    			
        		agence.creerTerrain(Integer.parseInt(bien_num.getText()), bien_adresse.getText(), bien_orientation.getText(), Double.parseDouble(bien_prix.getText()),
        				Date.from(bien_dateVente.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
        				Double.parseDouble(bien_ter_surSol.getText()), Double.parseDouble(bien_ter_longFac.getText()));
        		
        	} else if (((String)bien_type.getSelectionModel().getSelectedItem()) == "Maison") {
        		
        		agence.creerMaison(Integer.parseInt(bien_num.getText()), bien_adresse.getText(), bien_orientation.getText(), Double.parseDouble(bien_prix.getText()),
        				Date.from(bien_dateVente.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
        				Double.parseDouble(bien_mai_surHab.getText()), Integer.parseInt(bien_mai_nbPi.getText()), Integer.parseInt(bien_mai_nbEt.getText()), bien_mai_chauf.getText());
        		
        	} else if (((String)bien_type.getSelectionModel().getSelectedItem()) == "Appartement") {
        		
        		agence.creerAppartement(Integer.parseInt(bien_num.getText()), bien_adresse.getText(), bien_orientation.getText(), Double.parseDouble(bien_prix.getText()),
        				Date.from(bien_dateVente.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
        				Integer.parseInt(bien_app_nbPi.getText()), Integer.parseInt(bien_app_nbEt.getText()), Double.parseDouble(bien_app_chargeMensu.getText()));
        		
        	}
    		
    		ihm_add_last_bien();
        	
        	bien_num.setText("");
        	bien_adresse.setText("");
        	bien_orientation.setText("");
        	bien_prix.setText("");
        	bien_ter_surSol.setText("");
        	bien_ter_longFac.setText("");
        	bien_mai_surHab.setText("");
        	bien_mai_nbPi.setText("");
        	bien_mai_nbEt.setText("");
        	bien_mai_chauf.setText("");
        	bien_app_nbPi.setText("");
        	bien_app_nbEt.setText("");
        	bien_app_chargeMensu.setText("");
    		
		} catch (Exception e) {
			bien_toString.setText(e.toString());
		}

    }

    @FXML
    void client_aff(ActionEvent event) {
    	
    	client_toString.setText(agence.getListeClient().toString());

    }

    @FXML
    void client_creer(ActionEvent event) {
    	
    	try {
    		if (client_switch_entV.isSelected()) {
        		
        		agence.creerEntreprise(client_nom.getText(), client_adresse.getText(), client_phone.getText(), client_email.getText(),
        				client_ent_juri.getText(), client_ent_siren.getText());
        		
        	} else {
        		
        		agence.creerPersonne(client_nom.getText(), client_adresse.getText(), client_phone.getText(), client_email.getText());
        		
        	}
    		
    		ihm_add_last_client();
    		
		} catch (Exception e) {
			client_toString.setText(e.toString());
		}
    	
    	client_nom.setText("");
    	client_adresse.setText("");
    	client_phone.setText("");
    	client_email.setText("");
    	client_ent_juri.setText("");
    	client_ent_siren.setText("");

    }

    @FXML
    void envie_aff(ActionEvent event) {
    	
    	String str = "";
    	
    	for (Client client : agence.getListeClient()) {
			str += client.getListeEnvie();
		}
    	
    	envie_toString.setText(str);

    }

    @FXML
    void envie_creer(ActionEvent event) {
    	
    	try {
    		
    		((Client)envie_listClient.getSelectionModel().getSelectedItem()).ajouterEnvie(
    				((String)envie_type.getSelectionModel().getSelectedItem()), Double.parseDouble(envie_prix.getText()),
    				envie_loca.getText(), Double.parseDouble(envie_surSol.getText()), Integer.parseInt(envie_nbPi.getText()));

		} catch (Exception e) {
			envie_toString.setText(e.toString());
		}

    }

    @FXML
    void mandat_aff(ActionEvent event) {
    	
    	mandat_toString.setText(agence.getListeMandat().toString());

    }

    @FXML
    void mandat_creer(ActionEvent event) {
    	
    	try {
    		
    		agence.creerMandat(Double.parseDouble(mandat_prix.getText()),
    				Date.from(mandat_dateVente.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
    				Date.from(mandat_dateDebut.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
    				Date.from(mandat_dateFin.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
    				((BienImmo)mandat_listBien.getSelectionModel().getSelectedItem()),((Client)mandat_listClient.getSelectionModel().getSelectedItem()));
			
		} catch (Exception e) {
			mandat_toString.setText(e.toString());
		}

    }

    @FXML
    void notaire_aff(ActionEvent event) {
    	
    	notaire_toString.setText(agence.getListeNotaire().toString());

    }

    @FXML
    void notaire_creer(ActionEvent event) {
    	
    	try {
    		agence.creerNotaire(notaire_nom.getText(), notaire_adresse.getText());
		} catch (Exception e) {
			notaire_toString.setText(e.toString());
		}

    }

    @FXML
    void prom_aff(ActionEvent event) {
    	
    	promesse_toString.setText(agence.getListePromesse().toString());

    }

    @FXML
    void prom_creer(ActionEvent event) {
    	
    	try {
    		
    		agence.creerPromesse(Double.parseDouble(prom_prixVerse.getText()),
    				Date.from(prom_dateVente.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
    				Double.parseDouble(prom_commiAgen.getText()), Double.parseDouble(prom_fraisVente.getText()),
    				((BienImmo)prom_listBien.getSelectionModel().getSelectedItem()),
    				((Client)prom_listClient.getSelectionModel().getSelectedItem()),
    				((Notaire)prom_listNotaire.getSelectionModel().getSelectedItem()));
			
		} catch (Exception e) {
			promesse_toString.setText(e.toString());
		}

    }

    @FXML
    void pub_aff(ActionEvent event) {
    	
    	pub_toString.setText(agence.getListeAnnonce().toString());

    }

    @FXML
    void pub_creer(ActionEvent event) {
    	
    	try {
    		
    		if (((String)pub_type.getSelectionModel().getSelectedItem()) == "Texte") {
    			
    			((AnnoncePub)pub_listDoc.getSelectionModel().getSelectedItem()).ajouterPub(new TypeTexte(pub_desc.getText()));
        		
        	} else if (((String)bien_type.getSelectionModel().getSelectedItem()) == "HTML") {
        		
        		((AnnoncePub)pub_listDoc.getSelectionModel().getSelectedItem()).ajouterPub(new TypeHtml(pub_desc.getText()));
        		
        	} else if (((String)bien_type.getSelectionModel().getSelectedItem()) == "Img") {
        		
        		((AnnoncePub)pub_listDoc.getSelectionModel().getSelectedItem()).ajouterPub(new TypeImg(pub_desc.getText()));
        		
        	} else if (((String)bien_type.getSelectionModel().getSelectedItem()) == "Vid") {
        		
        		((AnnoncePub)pub_listDoc.getSelectionModel().getSelectedItem()).ajouterPub(new TypeVid(pub_desc.getText()));
        		
        	}
    		
		} catch (Exception e) {
			pub_toString.setText(e.toString());
		}

    }

    @FXML
    void pub_doc_creer(ActionEvent event) {
    	
    	try {
			
    		agence.creerDocument();
    		
    		ihm_add_last_doc();
    		
		} catch (Exception e) {
			pub_toString.setText(e.toString());
		}

    }

    @FXML
    void rdv_aff(ActionEvent event) {
    	
    	String str = agence.getListeRdv().toString();
    	for (Mandat mandat : agence.getListeMandat()) {
			str += mandat.getListeRdvVisite();
			str += mandat.getListeRdvVendeur();
		}
    	rdv_toString.setText(str);

    }

    @FXML
    void rdv_creer(ActionEvent event) {
    	
    	try {
    		
    		if (((String)pub_type.getSelectionModel().getSelectedItem()) == "RDV") {

    			agence.addRdv(Date.from(rdv_date.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
    					((Client)rdv_listClient.getSelectionModel().getSelectedItem()));
        		
        	} else if (((String)pub_type.getSelectionModel().getSelectedItem()) == "RDV Visite") {
        		
        		((Mandat)rdv_listMandat.getSelectionModel().getSelectedItem()).addRdvVisite(
        				Date.from(rdv_date.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
    					((Client)rdv_listClient.getSelectionModel().getSelectedItem()));
        		
        	} else if (((String)pub_type.getSelectionModel().getSelectedItem()) == "RDV Vente") {
        		
        		((Mandat)rdv_listMandat.getSelectionModel().getSelectedItem()).addRdvVendeur(
        				Date.from(rdv_date.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
    					((Client)rdv_listClient.getSelectionModel().getSelectedItem()));
        		
        	}
			
		} catch (Exception e) {
			rdv_toString.setText(e.toString());
		}

    }

    @FXML
    void stat_aff(ActionEvent event) {
    	
    	stat_toString.setText(agence.voirStats());

    }

    @FXML
    void save_data(ActionEvent event) {
    	
    	try {
    		File myFile = new File("agence.dat");
    		FileOutputStream fout = new FileOutputStream(myFile);
	    	ObjectOutputStream oos = new ObjectOutputStream(fout);
	    	oos.writeObject(agence);
	    	oos.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}

    }
    
    private void ihm_add_last_client() {
    	
        ((ChoiceBox<Client>)mandat_listClient).getItems().add(agence.getListeClient().get(agence.getListeClient().size() - 1));
        ((ChoiceBox<Client>)prom_listClient).getItems().add(agence.getListeClient().get(agence.getListeClient().size() - 1));
        ((ChoiceBox<Client>)envie_listClient).getItems().add(agence.getListeClient().get(agence.getListeClient().size() - 1));
        ((ChoiceBox<Client>)rdv_listClient).getItems().add(agence.getListeClient().get(agence.getListeClient().size() - 1));
        
    }
    
    private void ihm_add_last_bien() {
    	
        ((ChoiceBox<BienImmo>)mandat_listBien).getItems().add(agence.getListeBien().get(agence.getListeBien().size() - 1));
        ((ChoiceBox<BienImmo>)prom_listBien).getItems().add(agence.getListeBien().get(agence.getListeClient().size() - 1));
        
    }
    
    private void ihm_add_last_notaire() {
    	
        ((ChoiceBox<Notaire>)prom_listNotaire).getItems().add(agence.getListeNotaire().get(agence.getListeNotaire().size() - 1));
        
    }
    
    private void ihm_add_last_mandat() {
    	
        ((ChoiceBox<Mandat>)rdv_listMandat).getItems().add(agence.getListeMandat().get(agence.getListeMandat().size() - 1));
        
    }
    
    private void ihm_add_last_doc() {
    	
        ((ChoiceBox<AnnoncePub>)pub_listDoc).getItems().add(agence.getListeAnnonce().get(agence.getListeAnnonce().size() - 1));
        
    }

}
