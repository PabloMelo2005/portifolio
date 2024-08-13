package principios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Double num1 = 	Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
		String operacao = JOptionPane.showInputDialog(null, "Informe o sinal da operacao: ");
		Double num2 = 	Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
		Double divisao = num1 / num2;
		Double multiplicacao = num1 * num2;
		Double adicao = num1 + num2;
		Double subtracao = num1 - num2;
		
		//Definição de condições para cada operação:
		String resultado = "/".equals(operacao) ? "O resultado da sua operação é " + divisao.toString() : "INVALIDO"; //Condição ? Ação
		resultado = "+".equals(operacao) ? adicao.toString() : resultado;
		resultado = "-".equals(operacao) ? subtracao.toString() : resultado;
		resultado = "*".equals(operacao) ? multiplicacao.toString() : resultado;
		
		JOptionPane.showMessageDialog(null, num1 + " " + operacao + " " + num2 + " = " + resultado);

	

	}

}
