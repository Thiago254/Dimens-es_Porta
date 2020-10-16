package com.claudino;

public class PortaPrincipal {

    public static void main(String[] args) {
        Porta madeira = new Porta();
        madeira.cor = "Azul";
        madeira.dimensaoX = 10;
        madeira.dimensaoY = 10;
        madeira.dimensaoZ = 30;

        System.out.println("A dimensão: " + madeira.cor);
        System.out.println("A dimensão: " + madeira.dimensaoX);
        System.out.println("A dimensão: " + madeira.dimensaoY);
        System.out.println("A dimensão: " + madeira.dimensaoZ);
        System.out.println("A dimensão: " + madeira.aberta);
    }


    }