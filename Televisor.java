public class Televisor {
    // Atributos
    private int canal;
    private int volume;
    private boolean ligado;

    // Construtor
    public Televisor(int canal, int volume, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    // Getters e Setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Métodos
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("TV ligada!");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("TV desligada!");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }

    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Ligue a TV primeiro!");
        }
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo ou TV está desligada.");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligado) {
            canal = novoCanal;
            System.out.println("Canal trocado para: " + canal);
        } else {
            System.out.println("Ligue a TV primeiro!");
        }
    }

    @Override
    public String toString() {
        return "Televisor [Canal: " + canal + ", Volume: " + volume + ", Ligado: " + ligado + "]";
    }
}
