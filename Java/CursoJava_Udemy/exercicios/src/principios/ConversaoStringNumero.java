package principios;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Insira o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Insira o segundo número: ");
		
		double num1 = Double.parseDouble(valor1); //COnversão de string para double.
		double num2 = Double.parseDouble(valor2);
		
		JOptionPane.showMessageDialog(null, "A soma destes números é igual a: " + (num1 + num2));
		

	}

}
