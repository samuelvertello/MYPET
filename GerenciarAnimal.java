import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GerenciarAnimal {

    static List<Animal> pet = new ArrayList<>();
    

    Scanner ler = new Scanner(System.in);

    public void adicionarAnimal(String nome, String tipo, double peso, String idade, String porte, String raca, String pelagem){

        Animal animal = new Animal(nome, tipo, peso, idade, porte, raca, pelagem);
        pet.add(animal);

        System.out.println("Novo pet cadastrado com sucesso.");

    }

    
    public void exibirAnimal(){

        for(Animal a : pet){

            System.out.print("\nCodigo: "+a.getCodigoPet()+"  Tipo: "+a.getTipo()+"   Nome: "+a.getNome());
            
        }
        
        }

    public boolean obterDadosPet(int codigo){

        if(pet.size() == 0){
            System.out.println("Nenhum pet cadastrado");
            return false;

        }

        for(Animal a : pet){
            if(a.getCodigoPet() == codigo){
                System.out.println(a.toString());
            }
        }
        return true;
    }


    public boolean atualizarAnimal(String nome){
        
        if(pet.size() == 0){
            System.out.println("Nenhum pet cadastrado");
            return false;

        }


        for(int i = 0; i < pet.size(); i++){
            if(pet.get(i).getNome().equals(nome)){

                int codigo = pet.get(i).getCodigoPet();
                String atualizarNome;
                String tipo = pet.get(i).getTipo();
                double atualizarPeso;
                String data = pet.get(i).getIdade();
                String porte = pet.get(i).getPorte();
                String atualizarRaca = pet.get(i).getRaca();
                String pelagem = pet.get(i).getPelagem();
                

                System.out.println(pet.get(i).toString()+"\n");
                
                System.out.println("Digite novamente o nome do pet ou o novo nome.");
                atualizarNome = ler.nextLine();

                System.out.println("Digite o novo peso do pet.");
                atualizarPeso = ler.nextDouble();

                System.out.println("Errou a idade do pet? 1 - sim   2 - nao");
                int opcao = ler.nextInt();
                if(opcao == 1){
                    System.out.println("Digite a idade do pet.");
                    String idade = ler.nextLine();  
                    pet.get(i).setIdade(idade);                                       
                    
                }
                else if(opcao == 2){

                    data = pet.get(i).getIdade();

                }

                System.out.println("Atualizar ra??a? 1 - sim  2 - n??o");
                opcao = ler.nextInt();
                if(opcao == 1){
                    System.out.println("Digite a ra??a do pet.");
                    atualizarRaca = ler.nextLine();
                }
                else if(opcao == 2){
                    atualizarRaca = pet.get(i).getRaca();
                }

                var animal = new Animal(codigo, atualizarNome, tipo, atualizarPeso, data, porte, atualizarRaca, pelagem);
                pet.set(i, animal);             
                

            }
        }
        return true;
    }

    public boolean removerAnimal(String nome){
        
        if(pet.size() == 0){
            System.out.println("Nenhum pet cadastrado");
            return false;

        }

        for(Animal a : pet){
            if(a.getNome().equals(nome)){
                pet.remove(a);
                System.out.println("Opera????o realiza com sucesso.");
                return true;
            }

            else{
                System.out.println("ERRO!!! Pet nao encontrado, por favor tente novamente.");
                return false;
            }
        }
        return false;
    }

    public boolean cadastrarConsulta(int codigo, Consulta consulta){
        
        if(pet.size() == 0){
            System.out.println("Nenhum pet cadastrado");
            return false;

        }
        for(int i = 0; i < pet.size(); i++){
            if(pet.get(i).getCodigoPet() == codigo){
                int codigoPet = pet.get(i).getCodigoPet();
                String nome = pet.get(i).getNome();
                String tipo = pet.get(i).getTipo();
                double peso = pet.get(i).getPeso();
                String idade = pet.get(i).getIdade();               
                String porte = pet.get(i).getPorte();
                String raca = pet.get(i).getRaca();
                String pelagem = pet.get(i).getPelagem();

                
                Animal animal = new Animal(codigoPet, nome, tipo, peso, idade, porte, raca, pelagem, consulta);
                pet.set(i, animal);
                return true;                
                

            }
        }
        return false;
    }

    public void obterHistoricoConsultas(int codigo){
        for(Animal a : pet){
            if(a.getCodigoPet() == codigo){
                System.out.println(a.getConsulta().toString());
            }
        }

    }

    

    public List<Animal> getPet() {
        return pet;
    }
   

    
}
