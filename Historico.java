import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Vacinas> vacina = new ArrayList<>();
    private List<Vermifugo> vermifugo = new ArrayList<>();


    public Historico(Vacinas vac){

        this.vacina.add(vac);
        
    }

    public Historico(Vermifugo vermifugo){

        this.vermifugo.add(vermifugo);
    }

    public void obterConsultas(){


    }

    public void obterAtendimento(){


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
