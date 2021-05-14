public class Consulta {

    private int codigoConsulta = 0;
    private String tipoConsulta;    
    private String dataConsulta;
    private String nomeClinica;
    private String vacina;
    private String vermifugo;
    


    public Consulta(String tipoConsulta,  String vacina, String dataConsulta, String nomeClinica) {
        this.tipoConsulta = tipoConsulta;
        this.dataConsulta = dataConsulta;        
        this.nomeClinica = nomeClinica;
        this.vacina = vacina;
        this.codigoConsulta++;
        
    }



    @Override
    public String toString() {
        return "Consulta [codigoConsulta=" + codigoConsulta + ", dataConsulta=" + dataConsulta + ", nomeClinica="
                + nomeClinica + ", tipoConsulta=" + tipoConsulta + ", vacina=" + vacina + ", vermifugo=" + vermifugo
                + "]";
    }

          
 

    
}