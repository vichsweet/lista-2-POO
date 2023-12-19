package com.mycompany.atividadeanimal;

import Animal.Cachorro;
import Animal.cavalo;
import Animal.Preguica;
import Animal.Veterinario;

public class Main {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();
        Veterinario veterinario = new Veterinario();
        
        cachorro.emiteSom();
        cavalo.emiteSom();
        preguica.emiteSom();
        veterinario.examinar(cavalo);
    }
}