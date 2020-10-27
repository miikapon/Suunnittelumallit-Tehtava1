package com.mycompany.factorymethod;


public class Vauva extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Maito();
    }
    
}
