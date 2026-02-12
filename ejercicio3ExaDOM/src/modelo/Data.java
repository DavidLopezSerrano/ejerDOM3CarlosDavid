/*
 * Ejercicio DOM-3 hecho por Carlos Michelena y David López
 * Programa que genera mediante un evento un boton una textbox, y al darle a un boton se vuelve visible o invisible
 * 11/02/2026
 */
package modelo;

import java.util.ArrayList;

public class Data {
	// Atributos
	private ArrayList<String> texts = new ArrayList<>();
	private ArrayList<Integer> numbers = new ArrayList<>();

	// Constructor de data
	public Data() {

		createTexts();
		createNumbers();

	}

	// Metodos
	private void createNumbers() {
		numbers.add(3);// 0 - Numero de botones
		numbers.add(5);// 1 - Numero de labels info clientes
		numbers.add(5); // 2 - Numero clientes

	}

	private void createTexts() {
		texts.add("ProgramaDOM3");// 0
		texts.add("Generar Caja Texto");// 1
		texts.add("Ocultar");// 2
		texts.add("Visualizar");// 3
		texts.add("Info Cliente");// 4
		texts.add("Nombre");// 5
		texts.add("Cargo");// 6
		texts.add("Salario");// 7
		texts.add("Marca");// 8
		texts.add("Color");// 9
		texts.add("Borrar usuario : ");// 10
		texts.add("Borrar");// 11
	}

	// Getters & Setters
	public ArrayList<String> getTexts() {
		return texts;
	}

	public void setTexts(ArrayList<String> texts) {
		this.texts = texts;
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

}
