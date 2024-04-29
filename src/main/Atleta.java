package main;

public class Atleta extends Pessoa {
   private String pais;
   private double tempo;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public Atleta(String nome, String Sexo, String pais, double tempo) {
        super.setNome(nome);
        super.setSexo(Sexo);
        this.pais = pais;
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Atleta{ " + "nome=" + super.getNome() + ", sexo=" + super.getSexo() + ", pais=" + pais + ", tempo=" + tempo + '}';
    }
    
    

}
