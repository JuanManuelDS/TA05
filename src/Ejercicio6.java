import javax.swing.JOptionPane;

public class Ejercicio6 {
	public static void main(String[] args) {
		final double IVA = 0.21;
		String precioSinIVA = JOptionPane.showInputDialog("Introduzca el precio del producto");
		double parsedPrecioSinIVA = Double.parseDouble(precioSinIVA);
		double precioFinal = parsedPrecioSinIVA*IVA + parsedPrecioSinIVA;
		JOptionPane.showMessageDialog(null, "El precio final del producto es de " + precioFinal);
	}
}
