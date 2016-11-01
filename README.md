# Taller1
Factory Method &amp; Decorator

##Documentación:

* El archivo [Figura.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Figura.java) contiene la clase abstracta Figura con un método dibujar el cual va estar presente en todas las subclases que lo hereden.

* Los archivos [Cuadrado.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Cuadrado.java), [Rectangulo.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Rectangulo.java), [Circulo.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Circulo.java) contienen subclases que extienden de la clase abstracta Figura, en estas subclases se definen el tamaño de los lados de cada figura y también se sobrescribe el método dibujar para que retorne que tipo de figura es y el tamaño de los lados que han sido asignados.

* El archivo [CrearFigurasFactoryMethod.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/CearFigurasFactoryMethod.java) contiene una interface en las que se establece los métodos predefinidos para crear los distintos tipos de figuras (Rectángulo, Cuadrado, Circulo)

* El archivo [CrearFiguraFactory.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/CrearFiguraFactory.java) contiene una clase que implementa la interfaz creada y sobrescribe los métodos para crear cada figura con los tamaños de los lados que defina el usuario.

* Los archivos [Background.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Background.java) y [Borde.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Borde.java) son clases abstractas que extienden de figura que nos servirán para agregar las características como que tipo de borde y que color de fondo van a tener las figuras ya creadas.

* Los archivos [Azul.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Azul.java) y [Rojo.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Rojo.java) son clases que extienden de Background estas nos permiten añadirle un color de fondo a la figura que ya se haya creado con anterioridad.

* Los archivos [Solido.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Solido.java) y [Entrecortado.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Entrecortado.java) son clases que extienden de Borde estas nos permiten añadirle un tipo de borde a la figura que ya se haya creado con anterioridad.

* En el archivo [Demo.java](https://github.com/jjvillavicencio/Taller1/blob/master/src/main/java/ec/edu/utpl/taller1/Demo.java) se realiza la prueba del programa creando dos objetos y agregándole diferentes características a cada uno.

##Resultado:

![alt tag](http://i.imgur.com/4Td3Kks.png)
