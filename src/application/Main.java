package application;
import java.util.Scanner;
import models.ListOfSaints;


public class Main {

	public static void main(String[] args) {
		ListOfSaints listaDeCavaleiros = new ListOfSaints(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos cavaleiros você deseja adicionar?");
		int quantidade = sc.nextInt();
		for(int i = 0; quantidade > i; i++) {
			listaDeCavaleiros.adicionarCavaleiro();
		}
		System.out.println("Você adicionou " + listaDeCavaleiros.numeroDeCavaleirosRegistrados() + " Cavaleiros!");
		listaDeCavaleiros.mostrarCavaleirosRegistrados();
		listaDeCavaleiros.removerCavaleiroPorTipoDaArmadura();
		listaDeCavaleiros.mostrarCavaleirosRegistrados();
		System.out.println("Quantidade atual de cavaleiros: " + listaDeCavaleiros.numeroDeCavaleirosRegistrados());
		sc.close();
	}
}
