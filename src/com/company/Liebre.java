package com.company;


public class Liebre extends Thread {

    private int pasos;

    public Liebre(String name) {
        super(name);
        pasos = 0;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    @Override
    public void run() {

        int tiempoEspera = 1;

        while (pasos < 70){

            int aleatorio = (int) (Math.random() * 100) + 1;

            if (aleatorio > 0 && aleatorio <= 20){

            } else if (aleatorio > 20 && aleatorio <= 40){
                pasos += 9;
            } else if (aleatorio > 40 && aleatorio <= 50){
                if (pasos > 9){
                    pasos -= 9;
                } else {
                    pasos = 0;
                }
            } else if (aleatorio > 50 && aleatorio <= 80) {
                pasos += 1;
            } else if (aleatorio > 80 && aleatorio <=100) {
                if (pasos > 2) {
                    pasos -= 2;
                } else {
                    pasos = 0;
                }
            }

            this.esperarXsegundos(tiempoEspera);
            System.out.println(this.getName() + " : " + pasos + " pasos");
        }

        System.out.println(this.getName() + " HA TERMINADO LA CARRERA!!");
    }

    private void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
