package com.claudino;

public class Porta {
    public Boolean aberta;
    public String cor;
    public int dimensaoX;
    public int dimensaoY;
    public int dimensaoZ;

    void abre(){
        aberta = true;
    }

    void fecha(){
        aberta = false;
    }

    void pinta(String novaCor){
        cor = novaCor;
    }

    boolean estaAberta(){
        if (aberta){
            return true;
        }
        else{
            return false;
        }
    }

}