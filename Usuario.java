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
        this.senha = senha;
        return "Cadastro completo";
    }
}
