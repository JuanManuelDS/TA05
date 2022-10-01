import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		String numVentas = JOptionPane.showInputDialog("Por favor, introduzca el número de ventas");
		int parsedNumVentas = Integer.parseInt(numVentas);
		
		int valorTotalVentas = 0;
		
		for(int i = 1; i<=parsedNumVentas; i++) {
			String valorVenta = JOptionPane.showInputDialog("Por favor, introduzca el monto de la venta número " + i);
			int parsedValorVenta = Integer.parseInt(valorVenta);
			valorTotalVentas += parsedValorVenta;
		}
		
		JOptionPane.showMessageDialog(null, "El valor total de las ventas es de " + valorTotalVentas);
	}

}
