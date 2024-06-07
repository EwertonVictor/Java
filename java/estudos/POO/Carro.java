package testes;

public class Carro {
    //atributos
    String modelo;
    String marca;
    int ano;
    double velocidadeInicial;


    //métodos
    void acelerar(double aceleracao){
        velocidadeInicial += aceleracao;
    }

    void freiar(double freiando){
        velocidadeInicial -= freiando;
    }
}