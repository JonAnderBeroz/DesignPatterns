package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient=new Covid19Pacient("aitor", 35, new SymptomFactory());
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
		PacientThermometerGUI p = new PacientThermometerGUI(pacient);
		Observable pacient2=new Covid19Pacient("Ane", 35, new SymptomFactory());
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI ((Covid19Pacient) pacient2);
		PacientThermometerGUI p2 = new PacientThermometerGUI(pacient2);
		Observable pacient3=new Covid19Pacient("Maria", 35, new SymptomFactory());
		PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI ((Covid19Pacient) pacient3);
		PacientThermometerGUI p3 = new PacientThermometerGUI(pacient3);

	}


}
