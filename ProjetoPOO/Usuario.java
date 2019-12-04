public class Usuario extends Pessoa{
    private String login;
    private String senha;

    public String logar(String email){
        if (this.login == email){
            return  " ";
        }else{
            return "Email incorreto, tente novamente!";
        }
    }

    public String cadastrar(String email, String senha){
        this.login = email;
        this.setSenha(senha);
        return "Cadastro completo";
    }

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
