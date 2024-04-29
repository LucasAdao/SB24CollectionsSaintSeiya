package models;

public class Saint {
	private String nome;
	private String tipoDaArmadura;
	private String titulo;
	
	public Saint(String nome, String tipoDaArmadura, String titulo) {
		this.nome = nome;
		this.tipoDaArmadura = tipoDaArmadura;
		this.titulo = titulo;
	}
	public String getNome() {
		return nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getTipoDaArmadura() {
		return tipoDaArmadura;
	}
	@Override
	public String toString() {
		return "\n nome: " + nome +
				"\n tipo da Armadura: " + tipoDaArmadura +
				"\n titulo: " + titulo + "\n";
	}
	
	
}


