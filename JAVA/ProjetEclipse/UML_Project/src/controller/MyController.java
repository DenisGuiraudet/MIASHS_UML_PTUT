package controller;

import com.sun.javafx.application.LauncherImpl;

import data.agence.Agence;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class MyController {

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
    private TextField mandat_prix;

    @FXML
    private DatePicker mandat_dateVente;

    @FXML
    private DatePicker mandat_dateDebut;

    @FXML
    private DatePicker mandat_dateFin;

    @FXML
    private TextField prom_prixVerse;

    @FXML
    private DatePicker prom_dateVente;

    @FXML
    private TextField prom_commiAgen;

    @FXML
    private TextField prom_fraisVente;

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
    private DatePicker rdv_date;

    @FXML
    private ChoiceBox<?> rdv_type;

    @FXML
    private TextArea pub_desc;

    @FXML
    private ComboBox<?> pub_type;

    @FXML
    private TextField notaire_nom;

    @FXML
    private TextField notaire_adresse;
	
	private Agence agence = new Agence("Timmo");

    @FXML
    void bien_creer(ActionEvent event) {
    	System.out.println("bien_creer");

    	// TODO

    }

    @FXML
    void client_creer(ActionEvent event) {

    	if (client_switch_entV.isSelected()) {
    		agence.creerEntreprise(client_nom.getText(), client_adresse.getText(), client_phone.getText(), client_email.getText(),
    				client_ent_juri.getText(), client_ent_siren.getText());
    	} else {
    		agence.creerPersonne(client_nom.getText(), client_adresse.getText(), client_phone.getText(), client_email.getText());
    	}
    	
    	System.out.println(agence.getListeClient());

    }

    @FXML
    void client_switch_ent(ActionEvent event) {
    	System.out.println("client_switch_ent");
    	
    	// TODO

    }

    @FXML
    void envie_creer(ActionEvent event) {
    	System.out.println("envie_creer");
    	
    	// TODO

    }

    @FXML
    void envie_listClient(ActionEvent event) {
    	System.out.println("envie_listClient");
    	
    	// TODO

    }

    @FXML
    void mandat_creer(ActionEvent event) {
    	System.out.println("mandat_creer");
    	
    	// TODO

    }

    @FXML
    void mandat_listBien(ActionEvent event) {
    	System.out.println("mandat_listBien");
    	
    	// TODO

    }

    @FXML
    void mandat_listClient(ActionEvent event) {
    	System.out.println("mandat_listClient");
    	
    	// TODO

    }

    @FXML
    void notaire_creer(ActionEvent event) {
    	System.out.println("notaire_creer");
    	
    	// TODO

    }

    @FXML
    void prom_creer(ActionEvent event) {
    	System.out.println("prom_creer");
    	
    	// TODO

    }

    @FXML
    void prom_listBien(ActionEvent event) {
    	System.out.println("prom_listBien");
    	
    	// TODO

    }

    @FXML
    void prom_listClient(ActionEvent event) {
    	System.out.println("prom_listClient");
    	
    	// TODO

    }

    @FXML
    void prom_listNotaire(ActionEvent event) {
    	System.out.println("prom_listNotaire");
    	
    	// TODO

    }

    @FXML
    void pub_creer(ActionEvent event) {
    	System.out.println("pub_creer");
    	
    	// TODO

    }

    @FXML
    void pub_doc_creer(ActionEvent event) {
    	System.out.println("pub_doc_creer");
    	
    	// TODO

    }

    @FXML
    void pub_listDoc(ActionEvent event) {
    	System.out.println("pub_listDoc");
    	
    	// TODO

    }

    @FXML
    void rdv_creer(ActionEvent event) {
    	System.out.println("rdv_creer");
    	
    	// TODO

    }

    @FXML
    void rdv_listClient(ActionEvent event) {
    	System.out.println("rdv_listClient");
    	
    	// TODO

    }

    @FXML
    void rdv_listMandat(ActionEvent event) {
    	System.out.println("rdv_listMandat");
    	
    	// TODO

    }

    @FXML
    void stat_aff(ActionEvent event) {
    	System.out.println("stat_aff");
    	
    	// TODO

    }

}
