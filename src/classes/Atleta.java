package classes;

public class Atleta extends Pessoa {
   private String pais;
   private double tempo;
   public Atleta(String nome, String Sexo){
       super.setNome(nome);
       super.setSexo(Sexo);
   }

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

}
