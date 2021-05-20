import java.util.Scanner;

public class Login {

    GerenciarCadastro cadastro = new GerenciarCadastro();

    Scanner ler = new Scanner(System.in);

    public void exibirMenuInicial(){

        
        System.out.println("\n\n    >>  * MY PET *  <<");
        System.out.println("\n*************************");
        System.out.println("* 1 - Cadastrar         *");
        System.out.println("* 2 - Login             *");
        System.out.println("* 3 - Esqueceu a senha? *");
        System.out.println("* 0 - Fechar            *");
        System.out.println("*************************");
    }

    public void menuInicial(){
        
        int opcao = 9;        

        while(opcao != 0){

            exibirMenuInicial();
            

        System.out.println("\nQual operação deseja realizar?");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1: // Cadastrar 

                ler = new Scanner(System.in);

                System.out.print("Nome: ");
                String nome = ler.nextLine();

                System.out.print("E-mail: "); 
                String email = ler.nextLine();

                System.out.print("Numero telefone: "); 
                String telefone = ler.nextLine();                
               
                System.out.print("Criar senha: "); 
                String senha = ler.nextLine();
                
                cadastro.salvarCadastro(email, senha, nome, telefone);                
                
                break;

            case 2: // login
                ler = new Scanner(System.in);

                System.out.print("Email: ");
                String loginEmail = ler.nextLine();

                System.out.print("Senha: ");
                String loginSenha = ler.nextLine();

                cadastro.efetuarLogin(loginEmail, loginSenha);

                break;

            case 3: // redefinir senha

                System.out.println("** Redefinir senha **");
                System.out.print("\nDigite seu email para que possamos redefinir a senha.\nEmail: ");
                String redefinirSenha = ler.nextLine();
                cadastro.atualizarSenha(redefinirSenha);

                break;

            case 0: // fechando aplicaçao

                System.out.println("Saindo...");

                break;

                   
            default: 

                System.out.println("ATENÇÃO!!! Opção invalida...");
                break;
        }



    }
    }

   
    
}
