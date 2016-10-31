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
public interface CearObjetosFactoryMethod {
    public Rectangulo crearRectangulo(int ladoA, int ladoB);
    public Circulo crearCirculo(int radio);
    public Cuadrado crearCuadrado(int lado);
    
}
