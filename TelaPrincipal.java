import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

import jdk.internal.jshell.tool.Feedback.FormatErrors;

public class TelaPrincipal {

    GerenciarAnimal animal;

    Login login;

    Dicas dica;

    Localizacao buscar;

    public void obterMenuPrincipal(){

        System.out.println("\n************************************");
        System.out.println("* 1 - Cadastrar pet                *");
        System.out.println("* 2 - Obter lista de pet           *");
        System.out.println("* 3 - Atualizar dados de um pet    *");
        System.out.println("* 4 - Excluir cadastro de um pet   *");
        System.out.println("* 5 - Obter dicas de raça          *");
        System.out.println("* 6 - Buscar localização de um pet *");
        System.out.println("* 7 - Historico do pet             *");
        System.out.println("* 0 - Sair da aplicação            *");
        System.out.println("************************************");
    }

    public void MenuPrincipal(){

    int opcao = 9;

    Scanner ler = new Scanner(System.in);

    while(opcao != 0){

        obterMenuPrincipal();
        System.out.println("\nQual operação deseja realizar?");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1: // Cadastrar pet 
                System.out.print("Nome do pet: "); 
                String nome = ler.nextLine();
                System.out.print("Tipo do pet: "); 
                String tipo = ler.nextLine();
                System.out.print("Peso: "); 
                double peso = ler.nextDouble();
                System.out.print("Idade: "); 
                String formatoIdade = "05/12/2021";
                Date iadade = 
                System.out.print("Porte: ");
                String porte = ler.nextLine(); 
                System.out.print("Raça: "); 
                String raca = ler.nextLine();
                System.out.print("Tipo de pelo: ");  
                String pelagem = ler.nextLine();
                
                animal.adicionarAnimal(nome, tipo, peso, idade, porte, raca, pelagem);
                
                break;

            case 2: // obter lista de pet(s) cadastrados

                animal.exibirAnimal();

                break;

            case 3: // atualizar dados de um pet
                System.out.print("Nome do pet que quer atualizar os dados: ");
                String nomePet = ler.nextLine();

                animal.atualizarAnimal(nomePet);

                break;

            case 4: // excluir cadastro de um pet
                System.out.print("Nome do pet que quer atualizar os dados: ");
                String removerPet = ler.nextLine();

                animal.removerAnimal(removerPet);

                break;

            case 5: // obter dicas de pet
                System.out.print("Gostaria de dicas para qual raça: ");
                String dicaRaca = ler.nextLine();

                dica.obterDicas(dicaRaca);
                break;

            case 6: // buscar localização de pet
                System.out.print("Gostaria de localizar qual pet: ");
                int localizacao = ler.nextInt();

                buscar.obterLocalizacao(localizacao);
                break;

            case 7: // historico do pet


                break;

            case 0: // sair 

                login.menuInicial();

                break;

        
            default: 
                break;
        }



    }

}
    
}
