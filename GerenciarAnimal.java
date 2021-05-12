import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GerenciarAnimal {

    private List<Animal> pet = new ArrayList<>();
    

    Scanner ler = new Scanner(System.in);

    public void adicionarAnimal(String nome, String tipo, double peso, String idade, String porte, String raca, String pelagem){

        Animal animal = new Animal(nome, tipo, peso, idade, porte, raca, pelagem);
        pet.add(animal);

        System.out.println("Novo pet cadastrado com sucesso.");

    }

    
    public void exibirAnimal(){

        for(Animal a : pet){

            System.out.print("Tipo: "+a.getTipo()+" Nome: "+a.getNome());
            
        }
        
        }


    public void atualizarAnimal(String nome){


        for(int i = 0; i < pet.size(); i++){
            if(pet.get(i).getNome().equals(nome)){

                String atualizarNome;
                double atualizarPeso;
                String data = pet.get(i).getIdade();
                String atualizarRaca = pet.get(i).getRaca();

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

                System.out.println("Atualizar raça? 1 - sim  2 - não");
                opcao = ler.nextInt();
                if(opcao == 1){
                    System.out.println("Digite a raça do pet.");
                    atualizarRaca = ler.nextLine();
                }
                else if(opcao == 2){
                    atualizarRaca = pet.get(i).getRaca();
                }

                var animal = new Animal(atualizarNome, atualizarPeso , data, atualizarRaca);
                pet.set(i, animal);             
                

            }
        }
    }

    public boolean removerAnimal(String nome){

        for(Animal a : pet){
            if(a.getNome().equals(nome)){
                pet.remove(a);
                System.out.println("Operação realiza com sucesso.");
                return true;
            }

            else{
                System.out.println("ERRO!!! Pet nao encontrado, por favor tente novamente.");
                return false;
            }
        }
        return false;
    }

    public boolean marcarConsulta(int codigo, Consulta consulta){
        for(int i = 0; i < pet.size(); i++){
            if(pet.get(i).getCodigoPet() == codigo){
                int codigoPet = pet.get(i).getCodigoPet();
                String nome = pet.get(i).getNome();
                String tipo = pet.get(i).getTipo();
                String idade = pet.get(i).getIdade();
                String raca = pet.get(i).getRaca();
                
                Animal animal = new Animal(codigoPet, nome, tipo, idade, raca, consulta);
                pet.set(i, animal);
                return true;                
                

            }
        }
        return false;
    }

    public void obterHistoricoConsultas(int codigo){
        for(Animal a : pet){
            if(a.getCodigoPet() == codigo){
                a.getConsulta();
            }
        }

    }

    

    public List<Animal> getPet() {
        return pet;
    }


    public void setPet(List<Animal> pet) {
        this.pet = pet;
    }
    

    
}
