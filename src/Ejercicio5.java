import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Por favor, introduzca un número para saber si es divisible por dos o no  ");
		int parsedNum = Integer.parseInt(numero);
		if(parsedNum%2 == 0)
			JOptionPane.showMessageDialog(null, parsedNum + " es divisible por 2");
		else
			JOptionPane.showMessageDialog(null, parsedNum + " no es divisible por 2");
	}

}
