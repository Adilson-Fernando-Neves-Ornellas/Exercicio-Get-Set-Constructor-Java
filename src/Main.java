import java.util.Scanner; 

public class Main {
	static int opcaoMenu1;
	static int senhaCliente;
	static ClienteBanco Adilson = new ClienteBanco(10,111111, "Adilson", 1000);
	static ClienteBanco Amanda = new ClienteBanco(20,222222, "Amanda", 500);
	
	public static void main(String[] args) {
		menu();
	}
	public static int menu() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------- Qual seu usuario? -----------");
		System.out.println(" 1 - Adilson");
		System.out.println(" 2 - Amanda");
		System.out.print(" Digite sua opção: ");
		opcaoMenu1 = input.nextInt();
		if(opcaoMenu1!=1 && opcaoMenu1 !=2) {
			System.out.println("Opção invalida, tente novamente.");
			menu();
		}
		menu2();
		return opcaoMenu1;
	}
	private static void menu2() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("----Qual a senha do usuario Escolhido?----");
		System.out.print(" Digite sua senha: ");
		senhaCliente = input.nextInt();
		if(opcaoMenu1==1) {
			if(senhaCliente == 111111) {
				menu3(opcaoMenu1);
			}else{
				System.out.println("Senha Invalida, tente novamente");
				menu2();
			}
		}else {
			if(senhaCliente == 222222) {
				menu3(opcaoMenu1);
			}else{
				System.out.println("Senha Invalida, tente novamente");
				menu2();
			}
		}
	}
	public static void menu3(int opcaoMenu1){
		Scanner input = new Scanner(System.in);
		int opcaoMenu2;
		System.out.println("-------- MENU -----------");
		System.out.println(" 1 - Fechar conta");
		System.out.println(" 2 - Depositar");
		System.out.println(" 3 - Sacar conta");
		System.out.println(" 4 - Retorna ao menu inicial");
		System.out.print(" Digite sua opção: ");
		opcaoMenu2 = input.nextInt();
		switch(opcaoMenu2) {
		case 1:
			if(opcaoMenu1 == 1) {
				Adilson.fecharConta();
			}else {
				Amanda.fecharConta();
			}
			break;
		case 2:
			int valorDeposito;
			System.out.print(" Qual valor você deseja depositar: ");
			valorDeposito = input.nextInt();
			if(opcaoMenu1 == 1) {
				Adilson.depositarConta(valorDeposito);
			}else {
				Amanda.depositarConta(valorDeposito);
			}
			break;
		case 3:
			int valorSaque;
			System.out.print(" Qual valor você deseja sacar: ");
			valorSaque = input.nextInt();
			if(opcaoMenu1 == 1) {
				Adilson.sacarConta(valorSaque);
			}else {
				Amanda.sacarConta(valorSaque);
			}
			break;
		case 4:
			menu();
			break;
		default:
			System.out.println("    Opção Invalida, tente novamente.");
			break;
		};
		menu3(opcaoMenu1);
	};
}
