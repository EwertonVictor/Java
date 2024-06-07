package testes;

public class CarroTestar {
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.modelo = "City";
        c1.marca = "Honda";
        c1.ano = 2024;

        c1.velocidadeInicial = 10;
        c1.acelerar(24.5);

        System.out.println("Velocidade " + c1.velocidadeInicial + " Km/h");

        c1.freiar(10);

        System.out.println("O carro esta freiando " + c1.velocidadeInicial + " Km/h");

    }
}
