package conversorMonedas;

import java.awt.HeadlessException;

import javax.swing.*;

public class Prueva {
	
	public static void main(String[] args) throws NumberFormatException, HeadlessException, Exception {
		 
		
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
				"Pesos arg a Euro",
				"Euro a Peso Arg",
				"Bolivar a Dolar",
				"Dolar UUEE a Bolivar", 
				"Sol Peru a Dolar UUEE", 
				"Dolar UUEE a Sol Peru", 
				"Pesos chl a Dolar UUEE",
				"Dolar UUEE a Pesos Chl"};

		Object obj = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, list, list[0]);
	 
		
		switch (obj.toString()) {
		case "conversor de Moneda":
			System.out.println("conversor de Moneda");
			Object tipoDeMoneda = JOptionPane.showInputDialog(null, "Seleccione  Moneda a Convertir", "Tipo de Moneda", JOptionPane.PLAIN_MESSAGE, null, listMoneda, listMoneda[0]);
		  
		    String montoIngresado=JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir");
		    
		    if (elValorIngresadoEsValido(montoIngresado)){
		    String resultadoConversion = convertirMoneda(Double.parseDouble(montoIngresado), tipoDeMoneda.toString());
		    JOptionPane.showMessageDialog(null, resultadoConversion);	
		    }
		    
			
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
	public static String convertirMoneda(Double monto, String tipoDeConversion) {
	double resultado = monto;
	String cadena = "Tienes ";
		switch (tipoDeConversion) {
	case  "Pesos Arg a Dolar UUEE" :
		resultado *= 380; 
		cadena += "$" + resultado + " Dolar uuee";
		break;
	case "Dolar UUEE a Pesos Arg" :
		resultado *= 380; 
		cadena += "$" + resultado + " Pesos Arg";
		break;
	case  "Pesos Arg a Euro" :
		resultado *= 257; 
		cadena += "$" + resultado + " Pesos Arg";
		break;
	case "Euro a Pesos Arg" :
		resultado *= 257; 
		cadena += "$" + resultado + " Euros";
		break;
	case "Bolivar a Dolar"  :
		resultado *= 29; 
		cadena += "$" + resultado + " Dolar uuee";
		break;
	case "Dolar UUEE a Bolivar"  :
		resultado *= 29; 
		cadena += "$" + resultado + " Bolivares";
		break;
	case  "Soles a Dolar UUEE" :
		resultado *= 0.26; 
		cadena += "$" + resultado + " Dolar uuee";
		break;
	case  "Dolar UUEE a Sol Peru" :
		resultado *= 0.26; 
		cadena += "$" + resultado + " Sol Peru";
		break;
	case  "Pesos chl a Dolar UUEE" :
		resultado *= 803; 
		cadena += "$" + resultado + " Dolar uuee";
		break;
	case  "Dolar UUEE a Pesos Chl" :
		resultado *= 803; 
		cadena += "$" + resultado + " Dolar uuee";
		break;
	 
	default:
		break;
	}
		return cadena;	
	
	}

	
	public static boolean elValorIngresadoEsValido(String monto) throws Exception {
		if (monto==null) {
			System.out.println("ingrese monto valido");
		 return false;
			
		}
		
		try {
			Double.parseDouble(monto);
		} catch (Exception e) {
			System.out.println("el valor debe ser numerico");
			throw new Exception(e.getMessage());
		}
		return true;
		
	}
}



	


 