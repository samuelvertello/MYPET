import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Vacinas> vacina = new ArrayList<>();
    private List<Vermifugo> vermifugo = new ArrayList<>();

    Animal pet;


    public Historico(Vacinas vac){

        this.vacina.add(vac);
        
    }

    public Historico(Vermifugo vermifugo){

        this.vermifugo.add(vermifugo);
    }

    public void obterConsultas(){
        for(Vacinas v : vacina){
            System.out.println(v);
        }

        for(Vermifugo vg : vermifugo){
            System.out.println(vg);
        }


    }

    public void marcarAtendimento(String tipo){
        
            

        

        



    }


    public List<Vacinas> getVacina() {
        return vacina;
    }


    public void setVacina(List<Vacinas> vacina) {
        this.vacina = vacina;
    }


    public List<Vermifugo> getVermifugo() {
        return vermifugo;
    }


    public void setVermifugo(List<Vermifugo> vermifugo) {
        this.vermifugo = vermifugo;
    }

    
    
}
