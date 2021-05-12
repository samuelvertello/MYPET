public class Cadastro {

    private String email;
    private String senha;
    private String nome;
    private String telefone;



    public Cadastro(String email, String senha, String nome, String telefone) {
        this.email = email.toLowerCase();
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        
        System.out.println("Cadastro realizado com sucesso.");
        
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }


    


  
    

    

    
    
    
}
