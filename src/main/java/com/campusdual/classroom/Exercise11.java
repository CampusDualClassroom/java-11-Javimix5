package com.campusdual.classroom;

import java.sql.SQLOutput;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        System.out.println("Pruebas con el mando a distancia " + redRemote.getColor());
        System.out.println("Encender TV");
        redRemote.turnOn();
        System.out.println("Subir un canal");
        redRemote.channelUp();
        System.out.println("Bajar un canal");
        redRemote.channelDown();
        System.out.println("Establecer canal en 0, intentar bajar canal");
        redRemote.channelDown();
        System.out.println("Subir volumen");
        redRemote.volumeUp();
        System.out.println("Bajar volumen");
        redRemote.volumeDown();
        System.out.println("Establecer volumen en 0, intentar bajar volumen");
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println("Obtener color del mando y mostrarlo por pantalla");
        System.out.println(redRemote.getColor());
        System.out.println("Apagar TV");
        redRemote.turnOff();

        System.out.println(" ");

        System.out.println("Pruebas con el mando a distancia " + blackRemote.getColor());
        System.out.println("Encender TV");
        blackRemote.turnOn();
        System.out.println("Subir un canal");
        blackRemote.channelUp();
        System.out.println("Bajar un canal");
        blackRemote.channelDown();
        System.out.println("Establecer canal en 0, intentar bajar canal");
        blackRemote.channelDown();
        System.out.println("Subir volumen");
        blackRemote.volumeUp();
        System.out.println("Bajar volumen");
        blackRemote.volumeDown();
        System.out.println("Establecer volumen en 0, intentar bajar volumen");
        blackRemote.volume = 0;
        blackRemote.volumeDown();
        System.out.println("Obtener color del mando y mostrarlo por pantalla");
        System.out.println(blackRemote.getColor());
        System.out.println("Apagar TV");
        blackRemote.turnOff();


    }

}