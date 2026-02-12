/*
 * Ejercicio DOM-3 hecho por Carlos Michelena y David López
 * Programa que genera mediante un evento un boton una textbox, y al darle a un boton se vuelve visible o invisible
 * 11/02/2026
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Data;
import vista.MainView;

public class Listener implements ActionListener {
//Atributos
	private MainView mainView;

	private Data data;

	// Constructor
	public Listener(Data data, MainView mainView) {
		this.data = data;
		this.mainView = mainView;

	}

	// Metodo actionperfodmed
	@Override
	public void actionPerformed(ActionEvent e) {
		// Si pulsa el boton 0, vuelve invisible el panel principal, visible el
		// secundario y genera la textbox
		if (e.getSource() == mainView.getButtons().get(0)) {

			mainView.generateTextField(data);
			mainView.getPanels().get(0).setVisible(false);
			mainView.getPanels().get(1).setVisible(true);

		}
		// Si se pulsa el boton 1, se oculta o muestra la textbox
		else if (e.getSource() == mainView.getButtons().get(1)) {

			mainView.hideShow(data);

		}

	}

}
