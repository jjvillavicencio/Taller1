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
public class Rojo extends Background{
    
    public Rojo(Figura objetoColor) {
        super(objetoColor);
    }
    
    public String dibujar(){
        return objetoColor.dibujar() + "Color: Rojo";
    }
    
}
