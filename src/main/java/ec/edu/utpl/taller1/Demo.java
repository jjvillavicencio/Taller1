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
        CrearFiguraFactory factory = new CrearFiguraFactory();
        Cuadrado c = factory.crearCuadrado(5);
        Circulo cir = factory.crearCirculo(3);
        
        Figura cuadradoRojo = new Rojo(c);
        Figura cuadradoRojoEntrecortado = new Entrecortado(cuadradoRojo);
        
        Figura circuloRojo = new Azul(cir);
        Figura circuloRojoSolido = new Solido(circuloRojo);
        
        System.out.println(cuadradoRojoEntrecortado.dibujar());
        System.out.println(circuloRojoSolido.dibujar());
    }
    
}
