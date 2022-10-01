import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		String contraseña = "1234";
		int intentos = 3;
		boolean coincidencia = false;
		
		do {
			String input = JOptionPane.showInputDialog("Por favor, introduzca la contraseña. \nPosee " + intentos + " intentos más");
			
			if(input.equals(contraseña)) {
				coincidencia = true;
				System.out.println("Entré a la coincidencia");
			}
				
			intentos--;
		} while(coincidencia == false && intentos >0);
		
		if(coincidencia == true)
			JOptionPane.showMessageDialog(null, "Bienvenido!");
		else 
			JOptionPane.showMessageDialog(null, "Lo siento, vuelva a intentarlo luego");
	}

}
