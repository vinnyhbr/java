package conta_banco;
import java.util.Scanner;
public class BancoMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String cpf;
		String nome;
		System.out.println("Insira seu nome: ");
		nome = scanner.next();
		System.out.printf("Ola", nome,"Insira seu CPF: ");
		cpf = scanner.next();
		System.out.printf("Conta criada com sucesso");
	}

}
