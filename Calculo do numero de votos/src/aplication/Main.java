package aplication;

import votos.Votos;

public class Main {
    public static void main(String[] args) {
        Votos v = new Votos();
        v.percentual_validos();
        v.percentual_brancos();
        v.percentual_nulos();
    }
}
