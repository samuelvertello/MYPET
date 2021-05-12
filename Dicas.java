public class Dicas {

    GerenciarAnimal gerenciar = new GerenciarAnimal();

    public void obterDicas(String raca){

        for(int i = 0; i < gerenciar.getPet().size(); i++){
            if(gerenciar.getPet().get(i).getRaca().equals(raca)){
                System.out.println("https://www.google.com.br/search?q=dicas"+gerenciar.getPet().get(i).getRaca());

            }
        }


    }
    
}
