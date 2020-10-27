package com.mycompany.factorymethod;

public class Aiti extends AterioivaOtus {
    
    public Juoma createJuoma() {
        return new Mehu();
    }
}
