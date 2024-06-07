package Desafios;

public class ControleSmatTv {
    public static void main(String[] args){
        SystemSmartTv smartTv = new SystemSmartTv();

        //aumentando volume do sistema da tv
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        //mudando o canal do sistema da tv
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}