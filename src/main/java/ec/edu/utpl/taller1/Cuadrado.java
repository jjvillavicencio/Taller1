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
public class Cuadrado extends Objeto{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String dibujar() {
        return "Cuadrado, Tamaño lado "+lado+" ";
    }
    
    
}
