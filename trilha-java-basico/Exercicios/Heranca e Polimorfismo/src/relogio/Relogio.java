package relogio;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundos;

    public Relogio(int hora, int minuto, int segundos) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void formataHora(){

    }
}
