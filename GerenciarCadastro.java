import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCadastro {


    private List<Cadastro> usuario = new ArrayList<>();

    Scanner ler = new Scanner(System.in);

    TelaPrincipal telaPrincipal = new TelaPrincipal();

    public boolean salvarCadastro(String email, String senha, String nome, String telefone ){

        // como nao esta implementado banco de dados fiz dessa forma pra nao deixar criar mais de um cadastro.
        for(Cadastro c : usuario){
            if(c.getEmail().equals(email)){
                System.out.println("Email ja cadastrado.");
                return false;
            }
        }
        

       var cadastro = new Cadastro(email, senha, nome, telefone);
       usuario.add(cadastro);

        return true;
    }
       
   
    public boolean atualizarSenha(String email){

        for(Cadastro c : usuario){
        if(c.getEmail().equals(email)){
            System.out.println("Digite a nova senha.");
            String senha = ler.nextLine();
            usuario.get(0).setSenha(senha);
            System.out.println("Senha atualizada com sucesso");
            return true;
        }
    }
        System.out.println("Email incorreto");
        return false;    
        
    }
    

    public boolean efetuarLogin(String email, String senha){

        for(Cadastro c : usuario){
            if(c.getEmail().equals(email) && c.getSenha().equals(senha)){

                               
                try {
                    telaPrincipal.MenuPrincipal();
                } catch (ParseException e) {
                    
                    e.printStackTrace();
                }

                return true;                
            }

            else{

                System.out.println("ATENÇÃO::: Login ou senha incorretos. ");
                return false;
            }

        }

        return false;

       
    }

   
    
    
}
