public class Animal {
    private int codigoPet = 0;
    private String nome;
    private String tipo;
    private double peso;
    private String idade;
    private String porte;
    private String raca;
    private String pelagem;

    private Consulta consulta;
   
    
    public Animal(String nome, String tipo, double peso, String idade, String porte, String raca, String pelagem) {
        this.codigoPet++;
        this.nome = nome;
        this.tipo = tipo;
        this.peso = peso;
        this.idade = idade;
        this.porte = porte;
        this.raca = raca;
        this.pelagem = pelagem;
        

    }
    


    public Animal(String nome, double peso, String idade, String raca) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.raca = raca;
    }

    




    public Animal(int codigoPet, String nome, String tipo, String idade, String raca, Consulta consulta) {
        this.codigoPet = codigoPet;
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.raca = raca;
        this.consulta = consulta;
    }



    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String getIdade() {
        return idade;
    }


    public void setIdade(String idade) {
        this.idade = idade;
    }


    public String getPorte() {
        return porte;
    }


    public void setPorte(String porte) {
        this.porte = porte;
    }


    public String getRaca() {
        return raca;
    }


    public void setRaca(String raca) {
        this.raca = raca;
    }


    public String getPelagem() {
        return pelagem;
    }


    public void setPelagagem(String pelagem) {
        this.pelagem = pelagem;
    }


    public int getCodigoPet() {
        return codigoPet;
    }

    


    public Consulta getConsulta() {
        return consulta;
    }



    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }



    @Override
    public String toString() {
        return "Animal [codigoPet=" + codigoPet + ", consulta=" + consulta + ", idade=" + idade + ", nome=" + nome
                + ", pelagem=" + pelagem + ", peso=" + peso + ", porte=" + porte + ", raca=" + raca + ", tipo="
                + tipo + "]";
    }

    
    
}
