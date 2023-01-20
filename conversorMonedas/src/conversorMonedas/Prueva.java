package conversorMonedas;

import javax.swing.*;

public class Prueva {
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		String[] list = new String[] {"conversor de Moneda", "conversor de Temperatura"};
		 
		JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, null, list, list[0]);

	}

}
