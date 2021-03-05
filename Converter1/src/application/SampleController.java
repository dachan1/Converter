
package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;

public class SampleController implements Initializable {

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt1;
    
    @FXML
    private TextField txt3;
    
    @FXML
    private TextField txt4;
    @FXML
    private TextField txt5;
    @FXML
    private TextField txt6;
    @FXML
    private TextField txt7;
    @FXML
    private TextField txt8;
    @FXML
    private TextField txt9;
    @FXML
    private TextField txt10;
    @FXML
    private TextField txt11;
    @FXML
    private TextField txt12;
   
    
    @FXML
    private ComboBox<String> cbo3;
    @FXML
    private ComboBox<String> cbo5;
    @FXML
    private ComboBox<String> cbo6;
    @FXML
    private ComboBox<String> cbo7;
    @FXML
    private ComboBox<String> cbo8;
    @FXML
    private ComboBox<String> cbo9;
    @FXML
    private ComboBox<String> cbo10;
    
    @FXML
    private ComboBox<String> cbo4;

    @FXML
    private ComboBox<String> cbo2;

    @FXML
    private ComboBox<String> cbo1;
    
    @FXML
    private ComboBox<String> cbo12;

    @FXML
    private ComboBox<String> cbo11;
    @FXML
    private ComboBox<String> cbo13;

    @FXML
    private ComboBox<String> cbo14;
    
    // tout les déclarations des controles (Combo box et Text field)
    
    
    
    
    
    private ObservableList<String> liste=(ObservableList<String>)FXCollections.observableArrayList("CAD","USD","Euro");//declaration du liste d'argent
    
    double [] monnaie= {1.0,0.75,0.69};//declaration du tableaux d'argent en terme de CAD

private ObservableList<String> listemesure=(ObservableList<String>)FXCollections.observableArrayList("cm","yd","ft","NM");//déclaration du liste de mesure
    
private ObservableList<String> listemasse=(ObservableList<String>)FXCollections.observableArrayList("g","t","lb","oz");//déclaration du liste de mass

double []mass={1.0,0.00001,454,28.35};//déclaration du tableaux de mass en terme de gramme
    double [] mesure= {1.0,91.44,30.48,185200};//déclaration du tableaux de messure en terme des cm
    private ObservableList<String> listefrequency=(ObservableList<String>)FXCollections.observableArrayList("Hz","kHz","MHz");//déclaration du liste des fréquence
    double [] frequency= {1.0,0.001,0.000001};//déclaration du tableaux de fréquence en terme des Hz
    private ObservableList<String> listetime=(ObservableList<String>)FXCollections.observableArrayList("s","min","h");//déclaration du liste de temp
    double [] time= {1.0,60,3600};//déclaration du tableaux de temp en terme de seconde.
    private ObservableList<String> listtemp=(ObservableList<String>)FXCollections.observableArrayList("C","F","K");//déclaration du liste des température
   
    @FXML
    void fermer ()//déclaration du method pour quitter l'application à l'aide du bouton
    {
    	System.exit(0);
    }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		cbo1.setItems(liste);//set cbo1  liste qui est le liste d'argent
		cbo2.setItems(liste);//set cbo2 liste qui est le liste d'argent
		cbo1.getSelectionModel().selectFirst();//Cbo1 prend le première selection qui est CAD
		cbo2.getSelectionModel().selectFirst();//Cbo2 prend le première selection qui est CAD
		cbo3.setItems(listemesure);//set cbo3 listemesure qui est le liste de mesure
		cbo4.setItems(listemesure);//set cbo4 listemesure qui est le liste de mesure
		cbo3.getSelectionModel().selectFirst();//cbo3 prend le première selection qui est cm
		cbo4.getSelectionModel().selectFirst();//cbo4 prend le première selection qui est cm
		cbo5.setItems(listefrequency);//set cbo5 listefrequency qui est le liste de fréquence
		cbo6.setItems(listefrequency);//set cbo6 listefrequency qui est le liste de fréquence
		cbo5.getSelectionModel().selectFirst();//cbo5 prend le première selection qui est le hz
		cbo6.getSelectionModel().selectFirst();//cbo6 prend le première selection qui est le hz
		cbo7.setItems(listemasse);//set cbo7 qui est le liste de masse
		cbo8.setItems(listemasse);//set cbo8 qui est le liste de masse
		cbo7.getSelectionModel().selectFirst();//cbo7 prend le première selection qui est g
		cbo8.getSelectionModel().selectFirst();//cbo8 prend le première selection qui est g
		cbo9.setItems(listetime);//set cbo9 au liste de temp
		cbo10.setItems(listetime);//set cbo10 au liste de temp
		cbo9.getSelectionModel().selectFirst();//cbo9 prend le première slection qui est s
		cbo10.getSelectionModel().selectFirst();//cbo10 prend le première slection qui est s
		cbo11.setItems(listtemp);//set cbo11 au liste de température
		cbo12.setItems(listtemp);//set cbo12 au liste de température
		cbo11.getSelectionModel().selectFirst();//cbo11 prend le première selection qui est le C, Celcius
		cbo12.getSelectionModel().selectFirst();//cbo12 prend le première selection qui est le C, Celcius
		
		
	}
	
    @FXML
    void calculerArgent1()//method pour convertir l'argent de txt1 à txt 2
    {
    	Convertir1(txt1,txt2,cbo1,cbo2,monnaie);//tous les différentes paramettre du méthodes, les différentes txt et combo box
    }
	
    @FXML
    void calculerArgent2()//method pour convertir l'argent de txt2 à txt 1
    {
    	Convertir1(txt2,txt1,cbo1,cbo2,monnaie);//tous les différentes paramettre du méthodes, les différentes txt et combo box
    }
    @FXML
    void calculerMesure1() //méthod pour convertir les mesures de txt3 à txt4 (contient les deux systèmes)
    {
    	Convertir2(txt3,txt4,cbo3,cbo4,mesure);//tous les différentes paramettre du méthodes, les différentes txt et combo box
    }
    
	
    @FXML
    void calculerMesure2()//méthod pour convertir les mesures de txt4 à txt3 (contient deux différentes systèmes)
    {
    	Convertir2(txt4,txt3,cbo3,cbo4,mesure);//tous les différentes paramettre du méthodes, les différentes txt et combo box et le tableaux correspondant
    }
    @FXML
    void caculertenergy1()//méthod pour convertir les fréquence de txt5 à txt6
    {
    	Convertir1(txt5,txt6,cbo5,cbo6,frequency);//tous les différentes paramettre du méthodes, les différentes txt et combo box et le tableaux correspondant
    }
    @FXML
    void caculerenergy2()//méthod pour convertir les fréquence de txt6 à txt 5
    {
    	Convertir1(txt6,txt5,cbo5,cbo6,frequency);//tous les différentes paramettre du méthodes, les différentes txt et combo box et le tableaux correspondant
    }
    
    
    @FXML
    void caculermass1()//méthod pour convertir les masse de txt7 à txt8 (contient deux différentes systèmes)
    {
    	Convertir1(txt7,txt8,cbo7,cbo8,mass);//tous les différentes paramettre du méthodes, les différentes txt et combo box et le tableaux correspondant
    }
    @FXML
    void caculermass2()//méthod pour convertir les masse de txt8 à txt7 (contient deux différentes systèmes)
    {
    	Convertir1(txt8,txt7,cbo7,cbo8,mass);//tous les différentes paramettre du méthodes, les différentes txt et combo box et le tableaux correspondant
    }
    @FXML
    void caculertime1()//méthod pour convertir les temp de txt 9 à txt 10
    {
    	Convertir1(txt9,txt10,cbo9,cbo10,time);//tous les différentes paramettre du méthodes, les différentes txt et combo box et le tableaux correspondant
    }
    @FXML
    void caculertime2()//méthod pour convertir les temp de txt 10 à txt9
    {
    	Convertir1(txt10,txt9,cbo9,cbo10,time);//tous les différentes paramettre du méthodes, les différentes txt et combo box et le tableaux correspondant
    }
    
    @FXML
    void temp1()//méthod pour convertir les températures (il y a un méthode directe)
    {
    	températureConvert(txt11,cbo11,txt12,cbo12);//tous les différentes paramettre du méthodes, les différentes txt et combo box exeption pas de tableaux pour la température
    }
    @FXML
    void temp2()//méthod pour convertir les températures (il y a un méthode directe)
    {
    	
    	températureConvert(txt12,cbo11,txt11,cbo12);//tous les différentes paramettre du méthodes, les différentes txt et combo box exeption pas de tableaux pour la température
    }



    public void Convertir1(TextField txtA,TextField txtB, ComboBox boxA,ComboBox boxB,double[] tbtA) // méthode qui utilise 4 chiffre significants utiliser pour la plupart des convertiseur
    {
    	
    	verifNum(txtA);//méthode qui verifie que l'input de l'usager est un nombre et bloc toutes sauf les nombres et le point
    	int item1=boxA.getSelectionModel().getSelectedIndex();//voir quel index combo a est
    	int item2=boxB.getSelectionModel().getSelectedIndex();//voir quel indeux combo b est
    	try
    	{
    	double taux=tbtA[item2]/tbtA[item1];//détermine le taux par diviser les "items" qui sont mutiplie par les éleménts du tableaux corrrespondant 
    	double res= taux*(Double.parseDouble(txtA.getText()));// résultat = le input de txtA fois taux
    	txtB.setText(String.format("%.4f", res));// set txtb res avec 4 chiffre significant après le décimal
    	}catch (NumberFormatException e)// vois si l'usager a pas écrit un nombre
    	{
    		Alert alert=new Alert(AlertType.ERROR);// méthod du alert qui donne un alert et mettre le focus sur txtA
			alert.setHeaderText("Attention - Erreur");
			alert.setTitle("Erreur");
			alert.setContentText("Tu dois écire un nombre");
			alert.show();
			txtA.requestFocus();
    	}
    
    }
    
    public void Convertir2(TextField txtA,TextField txtB, ComboBox boxA,ComboBox boxB,double[] tbtA) //méthod avec plusieure chiffre significant pour convertir mesure
    {
    	
    	verifNum(txtA);//méthode qui verifie que l'input de l'usager est un nombre et bloc toutes sauf les nombres et le point
    	int item1=boxA.getSelectionModel().getSelectedIndex();//voir quel index combo a est
    	int item2=boxB.getSelectionModel().getSelectedIndex();//voir quel indeux combo b est
    	try
    	{
    	double taux=tbtA[item2]/tbtA[item1];//détermine le taux par diviser les "items" qui sont mutiplie par les éleménts du tableaux corrrespondant 
    	double res= taux*(Double.parseDouble(txtA.getText()));// résultat = le input de txtA fois taux
    	txtB.setText(String.format("%.7f", res));// set txtb res avec 7 chiffre significant après le décimal
    	}catch (NumberFormatException e)// vois si l'usager a pas écrit un nombre
    	{
    		Alert alert=new Alert(AlertType.ERROR);// méthod du alert qui donne un alert et mettre le focus sur txtA
			alert.setHeaderText("Attention - Erreur");
			alert.setTitle("Erreur");
			alert.setContentText("Tu dois écire un nombre");
			alert.show();
			txtA.requestFocus();
    	}
    
    }
	
public void températureConvert (TextField A, ComboBox boxA, TextField B, ComboBox boxB) {//méthode directe pour température

	verifNum(A);//méthode qui verifie que l'input de l'usager est un nombre et bloc toutes sauf les nombres et le point

	int v = boxA.getSelectionModel().getSelectedIndex();//prend l'index de combobox A

	int v2 = boxB.getSelectionModel().getSelectedIndex();//prend l'index de combobox B
	try
	{
	double temp = Double.parseDouble(A.getText());
		if (v == 0) {//si combobox A = celcius
		temp = (temp*1);
			}
		else if (v == 1) {// si combobox A = Farenheight
		temp = (temp - 32) * 5/9;
		}
		else {//si combobox A= Kelvin
		temp = temp - 273.15;
		}
		if (v2 == 0) {//si combobox B = Celcius
		B.setText(Double.toString(temp));
		}
		else if (v2 == 1) {//si combo box B= Farenheight
		B.setText(Double.toString((temp * 9/5) + 32));
		}
		else {// si combo box B = Kelvin
		B.setText(Double.toString(temp + 273.15));}
		}catch (NumberFormatException e)
    	{
    		Alert alert=new Alert(AlertType.ERROR);// méthod du alert qui donne un alert et mettre le focus sur txtA
			alert.setHeaderText("Attention - Erreur");
			alert.setTitle("Erreur");
			alert.setContentText("Tu dois écire un nombre");
			alert.show();
			A.setText("");
			A.requestFocus();	
    	}
	
	}


    	
		

    	
    
    
   public void verifNum(TextField a)// méthode pour vérifier pour que si il y a rien dans le text field ca remplace par un 0 et méthode qui infirme que l'usager met les nombres et des points.
 {
 	if(a.getText().equals("")) a.setText("0");
	 a.textProperty().addListener((observable,oldValue,newValue)->
 	{
 		if(!newValue.matches("^[0-9](\\.[0-9]+)?$"))
 		{
 			a.setText(newValue.replaceAll("[^\\d*\\.]", ""))
 			;
 		}
 		
 	});
 	
 }
}
