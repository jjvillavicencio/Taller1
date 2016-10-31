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
public  class Circulo extends Objeto{

    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String dibujar() {
        return "Circulo, Tamaño radio "+radio+" ";
    }
    
    
    
}
