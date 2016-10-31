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
public class CrearFiguraFactory implements CearFigurasFactoryMethod{

    @Override
    public Rectangulo crearRectangulo(int ladoA, int ladoB) {
        return new Rectangulo(ladoA, ladoB);
    }

    @Override
    public Circulo crearCirculo(int radio) {
        return new Circulo(radio);
    }

    @Override
    public Cuadrado crearCuadrado(int lado) {
        return new Cuadrado(lado);
    }
    
}
