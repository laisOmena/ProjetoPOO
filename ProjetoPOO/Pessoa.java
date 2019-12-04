
public class Pessoa {	//para o teste tirei o abstract de pessoa
	private long id;
    private String nome;
    private String dataNasc;
    private String sexo;
    private int cpf;
    private String email;
    
    public Pessoa(String nome, String dataNasc, String sexo, int cpf, String email) {
        this.nome = nome;
        this.setDataNasc(dataNasc);
        this.setSexo(sexo);
        this.cpf = cpf;
        this.email = email;
    }
    
    public Pessoa() {    	
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
