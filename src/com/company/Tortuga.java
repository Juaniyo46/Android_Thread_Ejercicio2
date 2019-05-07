package com.company;

public class Tortuga extends Thread {

    private int pasos;

    public Tortuga(String name) {
        super(name);
        pasos = 0;
    }



    @Override
    public void run() {

        int tiempoEspera = 1;

        while (pasos < 70){

            int aleatorio = (int) (Math.random() * 100) + 1;

            if (aleatorio > 0 && aleatorio <=50){
                pasos += 3;
            } else if (aleatorio > 50 && aleatorio <= 70){
                if (pasos > 6){

                    pasos -= 6;
                } else {
                    pasos = 0;
                }

            } else if (aleatorio > 70 && aleatorio <=100) {
                pasos += 1;
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
