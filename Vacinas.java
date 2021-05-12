import java.util.Date;

public class Vacinas {

    private String nomeVacina;
    private Date dataVacina;
    private Date proximaVacina;


    public Vacinas(String nomeVacina, Date dataVacina, Date proximaVacina) {
        this.nomeVacina = nomeVacina;
        this.dataVacina = dataVacina;
        this.proximaVacina = proximaVacina;
    }


    public String getNomeVacina() {
        return nomeVacina;
    }


    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }


    public Date getDataVacina() {
        return dataVacina;
    }


    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
    }


    public Date getProximaVacina() {
        return proximaVacina;
    }


    public void setProximaVacina(Date proximaVacina) {
        this.proximaVacina = proximaVacina;
    }


    @Override
    public String toString() {
        return "Vacinas [dataVacina=" + dataVacina + ", nomeVacina=" + nomeVacina + ", proximaVacina=" + proximaVacina
                + "]";
    }

    


    
    
}
