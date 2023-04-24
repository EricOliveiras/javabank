import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Bank bank = new Bank();

		Scanner input = new Scanner(System.in);

		System.out.println("Crie sua conta conosco!");
		System.out.println("-----------------------------");

		System.out.println("Digite o número da conta: ");
		bank.setAccountNumber(input.nextInt());

		System.out.println("Digite o número da agência: ");
		bank.setAgency(input.next());

		System.out.println("Digite o seu nome: ");
		bank.setClientName(input.next());

		System.out.println("Digite o seu saldo: ");
		bank.setBalance(input.nextDouble());

		System.out.println("Aqui está suas informações: ");
		System.out.println(bank.toString());

		input.close();
	}
}
