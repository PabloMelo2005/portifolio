import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica("Lucas Amoedo Marques", "030.566.877-95", "15-05-1990");

        pf.impressao();

        sc.close();

        
    }
    
}
