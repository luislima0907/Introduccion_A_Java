import javax.swing.*;
import java.util.*;
public class PracticaDeCondicionalesParte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner decisionScanner = new Scanner(System.in);
		System.out.println("Ingresa una de las siguientes opciones\n"
				+ "1. Area de un cuadrado.\n"
				+ "2. Area de un triangulo.\n"
				+ "3. Area de un rectangulo.\n"
				+ "4. Area de un circulo.\n");
		
		int decisionUsuario = decisionScanner.nextInt();
		
		// un switch evalua una variable que lea el programa por medio de lo que
		// ingreso el usuario en el, los switchs tienen diferentes casos, dependiendo
		// que caso escribamos ejecutara el codigo de ese caso y al finalizar el codigo
		// del caso ejecutado se rompera la condicional switch con break
		// y seguira con el flujo de ejecucion
		switch (decisionUsuario) 
		{
		case 1: 
			String ladoUno = JOptionPane.showInputDialog("Introduce el primer lado");
			int conversionLadoUno = Integer.parseInt(ladoUno);
			String ladoDos = JOptionPane.showInputDialog("Introduce el segundo lado");
			int conversionLadoDos = Integer.parseInt(ladoDos);
			int areaCuadrado = conversionLadoUno * conversionLadoDos;
			System.out.println("El area del cuadrado es: " + areaCuadrado);
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triangulo es: " + (base * altura)/2);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es: " + (base * altura));
			break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio"));
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("La opcion no es correcta");
			break;
		}
	}
}
