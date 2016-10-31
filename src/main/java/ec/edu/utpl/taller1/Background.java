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
public abstract class Background extends Figura{
    protected Figura objetoColor; 

    public Background(Figura objetoColor) {
        this.objetoColor = objetoColor;
    }
    
    public String dibujar(){
        return objetoColor.dibujar();
    }
}
