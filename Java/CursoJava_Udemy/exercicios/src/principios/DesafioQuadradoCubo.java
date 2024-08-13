package principios;

import javax.swing.JOptionPane;

public class DesafioQuadradoCubo {

	public static void main(String[] args) {
		
		Double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: ")), quadrado = Math.pow(num, 2), cubo = Math.pow(num, 3);
		
		JOptionPane.showMessageDialog(null, "[ " + num + " ] \nElevado ao quadrado: " + quadrado + "\nElevado ao cubo: " + cubo);

	}

}
