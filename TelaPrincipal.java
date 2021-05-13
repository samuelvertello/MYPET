import java.time.LocalDate;
import java.util.Scanner;

public class TelaPrincipal {

    GerenciarAnimal animal = new GerenciarAnimal();

    Login login;

    Dicas dica = new Dicas();

    Localizacao buscar = new Localizacao();    
    

    public void obterMenuPrincipal(){

        System.out.println("\n************************************");
        System.out.println("* 1 - Cadastrar pet                *");
        System.out.println("* 2 - Obter lista de pet           *");
        System.out.println("* 3 - Dados do pet                 *");
        System.out.println("* 4 - Atualizar dados de um pet    *");
        System.out.println("* 5 - Excluir cadastro de um pet   *");
        System.out.println("* 6 - Obter dicas de raça          *");
        System.out.println("* 7 - Buscar localização de um pet *");
        System.out.println("* 8 - Historico do pet             *");
        System.out.println("* 9 - Registrar consulta           *");
        System.out.println("* 10 - Consultas realizadas        *");
        System.out.println("* 0 - Sair da aplicação            *");
        System.out.println("************************************");
    }

    public void MenuPrincipal(){

    int opcao = 99;
    

    while(opcao != 0){
        Scanner ler = new Scanner(System.in);

        obterMenuPrincipal();
        System.out.println("\nQual operação deseja realizar?");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1: // Cadastrar pet 

                ler = new Scanner(System.in);

                System.out.print("Nome do pet: "); 
                String nome = ler.nextLine();
                System.out.print("Tipo do pet: "); 
                String tipo = ler.nextLine();
                System.out.print("Peso: "); 
                double peso = ler.nextDouble();
                System.out.print("Idade: "); 
                
                ler = new Scanner(System.in);

                String idade = ler.nextLine();
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

            case 3: // Dados do pet
                System.out.print("Codigo do pet: ");
                int codigo = ler.nextInt();

                animal.obterDadosPet(codigo);

                break;


            case 4: // atualizar dados de um pet
                System.out.print("Nome do pet que quer atualizar os dados: ");
                String nomePet = ler.nextLine();

                animal.atualizarAnimal(nomePet);

                break;

            case 5: // excluir cadastro de um pet
                System.out.print("Nome do pet que deseja remover cadastro: ");

                ler = new Scanner(System.in);
                
                String removerPet = ler.nextLine();

                animal.removerAnimal(removerPet);

                break;

            case 6: // obter dicas de pet
                System.out.print("Gostaria de dicas para qual raça: ");
                String dicaRaca = ler.nextLine();

                dica.obterDicas(dicaRaca);
                break;

            case 7: // buscar localização de pet
                System.out.print("Gostaria de localizar qual pet: ");
                int localizacao = ler.nextInt();

                buscar.obterLocalizacao(localizacao);
                break;

            case 8: // historico do pet


                break;

            case 9: // marcar consulta

                ler = new Scanner(System.in);

                System.out.print("Codigo do pet que deseja registrar consulta: ");
                int codig = ler.nextInt();

                String tipoConsulta = null;

                System.out.print("Tipo de consulta: 1 - periodica 2 - vermifugação 3 - outros ");
                int opcaoo = ler.nextInt();
                
                if(opcaoo == 1){
                    tipoConsulta = "periodica";
                }
                if(opcaoo == 2){
                    tipoConsulta = "vermifugacao";
                }
                if(opcaoo == 3){
                    tipoConsulta = "outros";
                }
                System.out.print("Data consulta: ");
                String data = ler.nextLine();
                LocalDate dataConsulta = LocalDate.parse(data);

                System.out.println("Nome clinica: ");
                String nomeClinica = ler.nextLine().toLowerCase();

                Consulta consulta = new Consulta(tipoConsulta, dataConsulta, nomeClinica);

                animal.marcarConsulta(codig, consulta);

                break;

            case 10: //exibir historico consultas

                System.out.print("Codigo pet: ");
                int codigoo = ler.nextInt();

                animal.obterHistoricoConsultas(codigoo);

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
