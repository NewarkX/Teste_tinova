package votos;

public class Votos {

    private Double total_eleitores = 1000.00;
    private Double votos_validos = 800.00;
    private Double votos_brancos = 150.00;
    private Double votos_nulos = 50.00;

    public void percentual_validos(){
        double percentual_validos = votos_validos / total_eleitores;
        System.out.println("O percentual de votos válidos em relacao ao total é: " + percentual_validos);
    }

    public void percentual_brancos(){
        double percentual_brancos = votos_brancos / total_eleitores;
        System.out.println("O percentual de votos válidos em relacao ao total é: " + percentual_brancos);
    }

    public void percentual_nulos(){
        double percentual_nulos = votos_nulos / total_eleitores;
        System.out.println("O percentual de votos válidos em relacao ao total é: " + percentual_nulos);
    }

    public Double getTotal_eleitores() {
        return total_eleitores;
    }

    public void setTotal_eleitores(Double total_eleitores) {
        this.total_eleitores = total_eleitores;
    }

    public Double getVotos_validos() {
        return votos_validos;
    }

    public void setVotos_validos(Double votos_validos) {
        this.votos_validos = votos_validos;
    }

    public Double getVotos_brancos() {
        return votos_brancos;
    }

    public void setVotos_brancos(Double votos_brancos) {
        this.votos_brancos = votos_brancos;
    }

    public Double getVotos_nulos() {
        return votos_nulos;
    }

    public void setVotos_nulos(Double votos_nulos) {
        this.votos_nulos = votos_nulos;
    }
}
