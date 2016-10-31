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
public abstract class Borde extends Figura{
    protected Figura objetoBorde; 

    public Borde(Figura objetoBorde) {
        this.objetoBorde = objetoBorde;
    }
    
    public String dibujar(){
        return objetoBorde.dibujar();
    }
    
}
