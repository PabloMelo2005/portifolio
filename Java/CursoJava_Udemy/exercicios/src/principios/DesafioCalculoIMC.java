package principios;

import javax.swing.JOptionPane;

public class DesafioCalculoIMC {

	public static void main(String[] args) {
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu peso: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua altura "));
		
		double imc = peso / Math.pow(altura, 2);
		
		JOptionPane.showMessageDialog(null, "O seu IMC(Índice de Massa Corporal) é de " + imc);
		
		
	}

}
