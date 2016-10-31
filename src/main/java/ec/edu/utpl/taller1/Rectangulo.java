/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.taller1;

/**
 *
 * @author jjvillavicencio
 */
public  class Rectangulo extends Figura{
    private final int ladoA;
    private final int ladoB;

    public Rectangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }    

    @Override
    public String dibujar() {
         return "Rectangulo, Tamaño lado1: "+ladoA+" lado2: "+ladoB+" ";
    }
    
}
