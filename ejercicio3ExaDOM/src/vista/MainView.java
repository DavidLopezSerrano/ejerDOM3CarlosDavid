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

	private ArrayList<JButton> buttons = new ArrayList<>();

	private ArrayList<JLabel> labels = new ArrayList<>();

	private ArrayList<JTextField> textField = new ArrayList<>();

	private ArrayList<JPanel> panels = new ArrayList<>();

	public MainView(Data data) {

		super(data.getTexts().get(0));
		setProperties();
		createButtons(data);
		generateTextField(data);
		panels.get(1).setVisible(false);
		pack();
	}

	private void createButtons(Data data) {

		panels.add(new JPanel());
		panels.get(0).setLayout(new FlowLayout());

		buttons.add(new JButton(data.getTexts().get(1)));
		panels.get(0).add(buttons.get(0));

		this.add(panels.get(0));

	}

	private void setProperties() {
		setLayout(new FlowLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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

	public void generateTextField(Data data) {

		panels.add(new JPanel());

		textField.add(new JTextField(10));

		panels.get(1).add(textField.get(0));

		buttons.add(new JButton(data.getTexts().get(2)));

		panels.get(1).add(buttons.get(1));

		this.add(panels.get(1));

		pack();

	}

	public ArrayList<JPanel> getPanels() {
		return panels;
	}

	public void setPanels(ArrayList<JPanel> panels) {
		this.panels = panels;
	}

	public void hideShow(Data data) {

		boolean visible = textField.get(0).isVisible();
		textField.get(0).setVisible(!visible);
		System.out.println(0);
	
	}

}
