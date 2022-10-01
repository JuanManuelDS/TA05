import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		String dia = JOptionPane
				.showInputDialog("Por favor, introduzca un día de la semena y le diremos si es laboral o no")
				.toLowerCase();
		System.out.println(dia);
		boolean esDia = true;
		boolean esDiaLaborable = false;
		switch (dia) {
		case "lunes":
			esDiaLaborable = true;
			break;
		case "martes":
			esDiaLaborable = true;
			break;
		case "miércoles":
			esDiaLaborable = true;
			break;
		case "jueves":
			esDiaLaborable = true;
			break;
		case "viernes":
			esDiaLaborable = true;
			break;
		case "sábado":
			esDiaLaborable = false;
			break;
		case "domingo":
			esDiaLaborable = false;
			break;
		default:
			esDia = false;
		}
		if (esDiaLaborable == true && esDia == true)
			JOptionPane.showMessageDialog(null, "El " + dia + " es un día laborable");
		else if(esDiaLaborable == false && esDia == true)
			JOptionPane.showMessageDialog(null, "El " + dia + " no es un día laborable");
		else
			JOptionPane.showMessageDialog(null, dia + " no es un día de la semana");
	}

}
