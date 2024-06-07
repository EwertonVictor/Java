package Desafios;

public class SystemSmartTv {
    boolean ligada;
    int canal = 1;
    int volume = 25;

    void mudarCanal(int escolhaCanal){
        canal = escolhaCanal;
    }

    void aumentarCanal(){
        canal++;
    }

    void diminuirCanal(){
        canal--;
    }

    void diminuirVolume(){
        volume--;
    }

    void aumentarVolume(){
        volume++;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}