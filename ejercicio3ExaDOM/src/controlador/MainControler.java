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
