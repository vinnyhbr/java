package conta_banco;
import java.util.Scanner;
public class BancoMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double saldoDaConta = 25;
		double valorSolicitado = 18;
		
		if (valorSolicitado > saldoDaConta){
			System.out.print("Saldo insuficiente");
		}
		else {
			saldoDaConta -= valorSolicitado	
		}
		
		System.out.printf("Transacao realizada com sucesso! Seu salto agora e " + saldoDaConta);
		
	}

}
