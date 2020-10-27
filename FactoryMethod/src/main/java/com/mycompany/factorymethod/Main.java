package com.mycompany.factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus vauva = new Vauva();
        vauva.aterioi();
        
        AterioivaOtus aiti = new Aiti();
        aiti.aterioi();
    }
}