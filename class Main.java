public class Main {
    public static void main(String[] args) {
        Televisor minhaTV = new Televisor(5, 10, false);
        ControleRemoto controle = new ControleRemoto(minhaTV);

        controle.ligar();
        controle.aumentarVolume();
        controle.trocarCanal(12);
        controle.diminuirVolume();
        controle.mostrarEstado();
        controle.desligar();
    }
}
