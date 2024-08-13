package principios;

import javax.swing.JOptionPane;

public class DesafioBhaskara {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de b: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de c: "));
		
		int delta = (int) (Math.pow(b, 2)) - (4 * a * c);
		
		int X1 = (int) (-b + Math.sqrt(delta)) / (2 * a);
		int X2 = (int) (-b - Math.sqrt(delta)) / (2 * a);
		
		JOptionPane.showMessageDialog(null, "[ Equação - " + a + "x² + " + b + "x + " + c + " ] \n X (+): " + X1 + "\n X (-): " + X2);
		
	}

}
