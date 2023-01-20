package conversorMonedas;

import javax.swing.*;

public class Prueva {
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		String[] list = new String[] {"conversor de Moneda", "conversor de Temperatura"};
		 
		 
		Object obj = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, null, list, list[0]);
		System.out.println(obj);
	}

}
