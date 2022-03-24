package com.company;

public class Hora {

    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        do {
            System.out.println("Inserte una hora entre 0 y 23");
            this.hora = hora;
        }while (this.hora <= 0 || this.hora >23);
        do {
            System.out.println("Inserte minutos entre 0 y 60");
            this.minuto = minuto;
        }while (this.minuto <= 0 ||this.minuto >60);

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

    public int inc(){

        if (this.minuto > -1 && this.minuto < 60){
            this.minuto++;
        }
        if (this.minuto == 60){
            this.minuto = 0;
            if (this.hora != 23) {
                this.hora++;
            }
            else {
                this.hora = 0;
            }
        }

        return this.minuto;
    }

    @Override
    public String toString() {
        return " Son las " + hora + ":" + minuto;
    }
}

