package conversorMonedas;

import javax.swing.*;

public class Prueva {
	
	public static void main(String[] args) {
		 
		
		String[] list = new String[] {"conversor de Moneda", "conversor de Temperatura"};
		String[] listgrados = new String[] 
				{"°Celsius a °Fahrenheit", 
				"°Fahrenheit a °Celsius", 
				"°Fahrenheit a °Ranquine", 
				"°Ranquine a °Fahrenheit", 
				"°Kelvin a °Celsius", 
				"°Celsius a °Kelvin", 
				"°Kelvin a °Fahrenheit",
				"°Fahrenheit a °Kelvin", 
				"°Reaumurs a °Celsius",
				"°Celsius a °Reaumur", 
				"°Celsius a °Reaumur", 
				"°Reaumur a °Celsius", 
				"°Fahrenheit a °Reaumur", 
				"°Reaumur a °Fahrenheit"};
		
		String[] listMoneda = new String[] {
				"Pesos Arg a Dolar UUEE", 
				"Dolar UUEE a Pesos Arg", 
				"Bolivar a Dolar",
				"Dolar UUEE a Bolivar", 
				"Soles a Dolar UUEE", 
				"Dolar UUEE a Soles", 
				"Pesos chl a Dolar UUEE",
				"Dolar UUEE a Pesos Chl"};

		Object obj = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, list, list[0]);
	 
		
		switch (obj.toString()) {
		case "conversor de Moneda":
			System.out.println("conversor de Moneda");
			Object tipoDeMoneda = JOptionPane.showInputDialog(null, "Seleccione  Moneda a Convertir", "Menu", JOptionPane.PLAIN_MESSAGE, null, listMoneda, listMoneda[0]);
		  
		    String montoIngresado=JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir");
		    convertirMoneda(Double.parseDouble(montoIngresado), tipoDeMoneda.toString());
		    System.out.println(montoIngresado);
			
			break;
		case "conversor de Temperatura":
			System.out.println("conversor de Temperatura");
			Object temp = JOptionPane.showInputDialog(null, "Temperatura a Convertir", "Menu", JOptionPane.PLAIN_MESSAGE, null, listgrados, listgrados[0]);
		    
		    String temperaturaIngresada=JOptionPane.showInputDialog(null,"Ingresa temperatura que deseas convertir");
		    System.out.println(temperaturaIngresada);
			System.out.println(temp); 
			break;

		default:
			break;
		}
		 
		
		 
		 
	}
	public static double convertirMoneda(Double monto, String tipoDeConversion) {
	double resultado = 0.0 ;
		switch (tipoDeConversion) {
	case  "Pesos Arg a Dolar UUEE" :
		resultado = monto * 380; 
		break;

		
	default:
		break;
	}
		return resultado;	
	
	}
}

	


 