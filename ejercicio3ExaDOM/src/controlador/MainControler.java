/*
 * Ejercicio DOM-3 hecho por Carlos Michelena y David López
 * Programa que genera mediante un evento un boton una textbox, y al darle a un boton se vuelve visible o invisible
 * 11/02/2026
 */
package controlador;

import modelo.Data;
import vista.MainView;

public class MainControler {

	
	public MainControler() {
		
	
	Data data = new Data();
	
	MainView mainView = new MainView(data);
	
	Listener listener = new Listener(data, mainView);
	
	for (int i = 0; i < 2; i++)
		mainView.getButtons().get(i).addActionListener(listener);
	}
}
