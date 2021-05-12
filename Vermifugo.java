import java.util.Date;

public class Vermifugo {

    private String nomeVermifugo;
    private Date dataVermifugo;
    private Date dataProximoVermifugo;


    public Vermifugo(String nomeVermifugo, Date dataVermifugo, Date dataProximoVermifugo) {
        this.nomeVermifugo = nomeVermifugo;
        this.dataVermifugo = dataVermifugo;
        this.dataProximoVermifugo = dataProximoVermifugo;
    }


    public String getNomeVermifugo() {
        return nomeVermifugo;
    }


    public void setNomeVermifugo(String nomeVermifugo) {
        this.nomeVermifugo = nomeVermifugo;
    }


    public Date getDataVermifugo() {
        return dataVermifugo;
    }


    public void setDataVermifugo(Date dataVermifugo) {
        this.dataVermifugo = dataVermifugo;
    }


    public Date getDataProximoVermifugo() {
        return dataProximoVermifugo;
    }


    public void setDataProximoVermifugo(Date dataProximoVermifugo) {
        this.dataProximoVermifugo = dataProximoVermifugo;
    }


    @Override
    public String toString() {
        return "Vermifugo [dataProximoVermifugo=" + dataProximoVermifugo + ", dataVermifugo=" + dataVermifugo
                + ", nomeVermifugo=" + nomeVermifugo + "]";
    }

    
    

    
    
}
