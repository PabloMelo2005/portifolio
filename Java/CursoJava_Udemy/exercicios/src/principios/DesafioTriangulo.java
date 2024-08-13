package principios;

import javax.swing.JOptionPane;

public class DesafioTriangulo {

	public static void main(String[] args) {
		
		Double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da base: "));
		Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da altura: "));
		
		Double area = (base * altura) / 2;
		
		JOptionPane.showMessageDialog(null, "[ Área do Triângulo ]\n(" + base + " * " + altura + ") / 2 = " + area);

	}

}
