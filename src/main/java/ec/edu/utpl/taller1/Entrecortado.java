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
public class Entrecortado extends Borde{
    
    public Entrecortado(Figura objetoBorde) {
        super(objetoBorde);
    }
    
    public String dibujar(){
        return objetoBorde.dibujar() + " Borde: Entrecortado";
    }
}
