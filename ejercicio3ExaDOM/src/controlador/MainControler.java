package controlador;

import modelo.Data;
import vista.MainView;

public class MainControler {

	
	public MainControler() {
		
	
	Data data = new Data();
	
	MainView mainView = new MainView(data);
	
	Listener listener = new Listener(data, mainView);
	
	mainView.getButtons().get(0).addActionListener(listener);
	
	mainView.getButtons().get(1).addActionListener(listener);
	
	}
}
