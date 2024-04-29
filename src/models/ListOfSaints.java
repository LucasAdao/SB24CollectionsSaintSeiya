package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ListOfSaints {
	private List<Saint> listaDeCavaleiros;
	Scanner sc = new Scanner(System.in);
	
	public ListOfSaints() {
		this.listaDeCavaleiros = new ArrayList<>();
	}
	public void adicionarCavaleiro() {
		System.out.println("Digite o nome do Cavaleiro:");
		
		String nome = sc.nextLine();
		System.out.println("Digite o grau da sua armadura:");
		String tipoDeArmadura = sc.nextLine();
		System.out.println("Digite o titulo dele: (Exemplo, -de Fenix-)");
		String titulo = sc.nextLine();
		listaDeCavaleiros.add(new Saint(nome, tipoDeArmadura, titulo));
	}
	public void removerCavaleiroPorNome() {
		System.out.println("Digite o nome do Cavaleiro que você quer remover:");
		String nome = sc.nextLine();
		List<Saint> cavaleiroParaSerRemovido = new ArrayList<>();
		for(Saint t : listaDeCavaleiros) {
			if(t.getNome().equalsIgnoreCase(nome));
			cavaleiroParaSerRemovido.add(t);
		}
		listaDeCavaleiros.removeAll(cavaleiroParaSerRemovido);
	}
	public void removerCavaleiroPorTipoDaArmadura() {
	    System.out.println("Digite o tipo da armadura do Cavaleiro que você quer remover:");
	    String tipoDaArmadura = sc.nextLine();
	 
	    List<Saint> cavaleirosParaSeremRemovidos = new ArrayList<>();
	    for (Saint cavaleiro : listaDeCavaleiros) {
	        if (cavaleiro.getTipoDaArmadura().equalsIgnoreCase(tipoDaArmadura)) {
	            cavaleirosParaSeremRemovidos.add(cavaleiro);
	        }
	    }
	    listaDeCavaleiros.removeAll(cavaleirosParaSeremRemovidos);
	}
	public void removerCavaleiroPorTitulo() {
		System.out.println("Digite o titulo do Cavaleiro que você quer remover:");
		String titulo = sc.nextLine();
		
		List<Saint> cavaleiroParaSerRemovido = new ArrayList<>();
		
		for(Saint t : listaDeCavaleiros) {
			if(t.getTitulo().equalsIgnoreCase(titulo));
			cavaleiroParaSerRemovido.add(t);
		}
		listaDeCavaleiros.removeAll(cavaleiroParaSerRemovido);
	}
	public List<Saint> pesquisarCavaleiroPorNome() {
		System.out.println("Digite o nome do cavaleiros que você quer pesquisar:");
		String nome = sc.nextLine();
		List<Saint> pesquisarCavaleirosPorNome = new ArrayList<>();
		if(listaDeCavaleiros.isEmpty()) {
			for(Saint s: listaDeCavaleiros) {
				if(s.getNome().equalsIgnoreCase(nome)) {
				pesquisarCavaleirosPorNome.add(s);
				}
			}	
		}	
		return pesquisarCavaleirosPorNome;
	}
	public List<Saint> pesquisarCavaleiroPorTipoDaArmadura() {
		System.out.println("Digite o tipo da armadura dos cavaleiros que você quer pesquisar:");
		String tipoDaArmadura = sc.nextLine();
		List<Saint> pesquisarCavaleirosPorTipoDaArmadura = new ArrayList<>();
		if(listaDeCavaleiros.isEmpty()) {
			for(Saint s: listaDeCavaleiros) {
				if(s.getNome().equalsIgnoreCase(tipoDaArmadura)) {
				pesquisarCavaleirosPorTipoDaArmadura.add(s);
				}
			}	
		}	
		return pesquisarCavaleirosPorTipoDaArmadura;
	}
	public List<Saint> pesquisarCavaleiroPorTitulo() {
		System.out.println("Digite o titulo do cavaleiro que você quer pesquisar:");
		String titulo = sc.nextLine();
		List<Saint> pesquisarCavaleirosPorTitulo = new ArrayList<>();
		if(listaDeCavaleiros.isEmpty()) {
			for(Saint s: listaDeCavaleiros) {
				if(s.getNome().equalsIgnoreCase(titulo)) {
				pesquisarCavaleirosPorTitulo.add(s);
				}
			}	
		}	
		return pesquisarCavaleirosPorTitulo;
	}
	public void mostrarCavaleirosRegistrados() {
		System.out.println("--- Saints ---");
		System.out.println(listaDeCavaleiros);
	}
	public int numeroDeCavaleirosRegistrados() {
		return listaDeCavaleiros.size();
	}
	
	
	
}
