public class Localizacao {
    

    public void obterLocalizacao(int codigo){

        for(int i = 0; i < GerenciarAnimal.pet.size(); i++){
            if(GerenciarAnimal.pet.get(i).getCodigoPet() == codigo){
                //amostra superficial de como funcionaria a busca
                System.out.println("https://localizacion.com/"+GerenciarAnimal.pet.get(i).getCodigoPet());
            }
        }
    }
    
}
