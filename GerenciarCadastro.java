import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCadastro {


    private List<Cadastro> usuario = new ArrayList<>();

    Scanner ler = new Scanner(System.in);

    TelaPrincipal telaPrincipal;

    public boolean salvarCadastro(String email, String senha, String nome, String telefone ){

        // como nao esta implementado banco de dados fiz dessa forma pra nao deixar criar mais de um cadastro.
        if(usuario.size() != 0){
            System.out.println("Usuario ja cadastrado");
            return false;
        }

       var cadastro = new Cadastro(email, senha, nome, telefone);
       usuario.add(cadastro);

        return true;
    }

       
    public boolean atualizarCadastro(Cadastro atualizar){
        
       usuario.set(0, atualizar);
               
        return true;
    }

    public boolean atualizarSenha(String email){

        if(usuario.get(0).getEmail().equals(email)){

            System.out.println("Digite a nova senha.");
            String senha = ler.nextLine();
            usuario.get(0).setSenha(senha);
            System.out.println("Senha atualizada com sucesso");
            return true;
        }
        else{

            System.out.println("Email incorreto");
            return false;
        }

        
        
    }

    public boolean efetuarLogin(String email, String senha){

        for(Cadastro c : usuario){
            if(c.getEmail().equals(email) && c.getSenha().equals(senha)){

                               
                telaPrincipal.MenuPrincipal();

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
