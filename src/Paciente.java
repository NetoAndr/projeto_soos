package projeto_soos;

public class Paciente {
	
	private String nome;
	private String cpf;
	
	Paciente(String nome, String cpf){
		
		this.nome = nome;
		this.cpf = cpf;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
