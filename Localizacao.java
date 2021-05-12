public class Localizacao {

    GerenciarAnimal gerenciar;

    public void obterLocalizacao(int codigo){

        for(int i = 0; i < gerenciar.getPet().size(); i++){
            if(gerenciar.getPet().get(i).getCodigoPet() == codigo){
                //amostra superficial de como funcionaria a busca
                System.out.println("https://localizacion.com/"+gerenciar.getPet().get(i).getCodigoPet());
            }
        }
    }
    
}
