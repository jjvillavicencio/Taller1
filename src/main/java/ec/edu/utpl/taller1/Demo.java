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
public class Demo {
    public static void main(String[] args) {
        CrearObjetoFactory factory = new CrearObjetoFactory();
        Cuadrado c = factory.crearCuadrado(5);
        Circulo cir = factory.crearCirculo(3);
        
        Objeto cuadradoRojo = new Rojo(c);
        Objeto circuloRojo = new Azul(cir);
        System.out.println(cuadradoRojo.dibujar());
        System.out.println(circuloRojo.dibujar());
    }
    
}
