/*
 * Ejercicio DOM-3 hecho por Carlos Michelena y David López
 * Programa que genera mediante un evento un boton una textbox, y al darle a un boton se vuelve visible o invisible
 * 11/02/2026
 */
package vista;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Data;

public class MainView extends JFrame {

	/*
	 * Definicion de las variables de la clase MainView con arraylist cuando se usa
	 * la misma variable mas de una vez
	 */
	private ArrayList<JButton> buttons = new ArrayList<>();

	private ArrayList<JLabel> labels = new ArrayList<>();

	private ArrayList<JTextField> textField = new ArrayList<>();

	private ArrayList<JPanel> panels = new ArrayList<>();

	// Creamos el constructor y llamamos a los metodos necesarios
	public MainView(Data data) {

		super(data.getTexts().get(0));
		setProperties();
		createButtons(data);
		generateTextField(data);
		panels.get(1).setVisible(false);
		pack();
	}

	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}
	

	public ArrayList<JLabel> getLabels() {
		return labels;
	}

	public void setLabels(ArrayList<JLabel> labels) {
		this.labels = labels;
	}

	public ArrayList<JTextField> getTextField() {
		return textField;
	}

	public void setTextField(ArrayList<JTextField> textField) {
		this.textField = textField;
	}

	public ArrayList<JPanel> getPanels() {
		return panels;
	}

	public void setPanels(ArrayList<JPanel> panels) {
		this.panels = panels;
	}

	// Metodo que genera el campo de texto con el boton para mostrar y ocultar
	public void generateTextField(Data data) {

		panels.add(new JPanel());

		textField.add(new JTextField(10));

		panels.get(1).add(textField.get(0));

		buttons.add(new JButton(data.getTexts().get(2)));

		panels.get(1).add(buttons.get(1));

		this.add(panels.get(1));

		pack();

	}

	// Metodo que hace que se oculte la caja de texto o se muestre
	public void hideShow(Data data) {

		boolean visible = textField.get(0).isVisible();
		textField.get(0).setVisible(!visible);

	}

	// Metodo para crear botones y añadilos al panel
	private void createButtons(Data data) {

		panels.add(new JPanel());
		panels.get(0).setLayout(new FlowLayout());

		buttons.add(new JButton(data.getTexts().get(1)));
		panels.get(0).add(buttons.get(0));

		this.add(panels.get(0));

	}

	// Configuracioin de la ventana
	private void setProperties() {
		setLayout(new FlowLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
