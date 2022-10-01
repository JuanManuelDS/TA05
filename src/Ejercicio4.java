import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		final double pi = 3.14;
		String radio = JOptionPane.showInputDialog("Por favor introduzca el radio del círculo ");
		double parsedRadio = Double.parseDouble(radio);
		double area = pi*Math.pow(parsedRadio, 2);
		JOptionPane.showMessageDialog(null, "El área del círculo es igual a  " + area);
	}

}
