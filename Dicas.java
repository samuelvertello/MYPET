public class Dicas {

    GerenciarAnimal gerenciar = new GerenciarAnimal();

    public void obterDicas(String raca){

        for(int i = 0; i < GerenciarAnimal.pet.size(); i++){
            if(GerenciarAnimal.pet.get(i).getRaca().equals(raca)){
                //amostra superficial de como funcionaria a busca
                System.out.println("\nhttps://www.google.com.br/search?q=dicas%20"+GerenciarAnimal.pet.get(i).getRaca());
            }
        }          
        


    }
    
}
