package com.company;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Tortuga tortuga = new Tortuga("Tortuga");

        Liebre liebre = new Liebre("Liebre");

        tortuga.start();
        liebre.start();


        long time = 0;
        long timeTortuga = 0;
        long timeLiebre = 0;

        while (tortuga.isAlive() || liebre.isAlive()) {

            time = System.currentTimeMillis() - startTime;


            if (tortuga.isAlive()){
                timeTortuga = time;
            }
            if (liebre.isAlive()){
                timeLiebre = time;
            }
        }

        if (timeTortuga +1 == timeLiebre){
            System.out.println("RESULTADO = EMPATE");
        }
        if (timeTortuga + 1 < timeLiebre){
            System.out.println("HA GANADO LA TORTUGA");
        }
        if (timeLiebre < timeTortuga + 1) {
            System.out.println("HA GANADO LA LIEBRE");
        }

    }
}
