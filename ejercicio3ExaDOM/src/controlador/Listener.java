package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modelo.Data;
import vista.MainView;

public class Listener implements ActionListener {

	private MainView mainView;

	private Data data;

	public Listener(Data data, MainView mainView) {
		this.data = data;
		this.mainView = mainView;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == mainView.getButtons().get(0)) {

			mainView.generateTextField(data);
			mainView.getPanels().get(0).setVisible(false);
			mainView.getPanels().get(1).setVisible(true);

		}
		
		else if(e.getSource() == mainView.getButtons().get(1)) {
			
			mainView.hideShow(data);
			
		}

	}

}
