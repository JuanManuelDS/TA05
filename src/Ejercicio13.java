import javax.swing.JOptionPane;

public class Ejercicio13 {
	public static void main(String[] args) {
		String operandoA = JOptionPane.showInputDialog("Introduzca un número");
		String signoAritmetico = JOptionPane.showInputDialog("Introduzca el signo de la operación que desee realizar");
		String operandoB = JOptionPane.showInputDialog("Introduzca un número");
		double resultado = 0;
		
		boolean esOperacionValida = true;
		
		double opA = Double.parseDouble(operandoA);
		double opB = Double.parseDouble(operandoB);
		
		switch(signoAritmetico) {
		case "+":
			resultado = opA + opB;
			break;
		case "-":
			resultado = opA - opB;
			break;
		case "*":
			resultado = opA*opB;
			break;
		case "/":
			resultado = opA/opB;
			break;
		case "^": 
			resultado = Math.pow(opA, opB);
			break;
		case "%":
			resultado = opA%opB;
			break;
		default:
			esOperacionValida = false;
		}
		
		if(esOperacionValida) {
			JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
		} else
			JOptionPane.showMessageDialog(null, "La operacion no es válida");
	}
}
