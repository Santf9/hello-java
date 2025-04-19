<<<<<<< HEAD:basic/c00_helloworld/HelloWorldExercises.java
package basic.c00_helloworld;

=======
>>>>>>> main:basic/helloworld/HelloWorldExercises.java
/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Santiago");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // Este programa imprime un saludo en la consola.

        // 4. Crea un comentario en varias líneas.
        /*Este es un comentario de varias líneas
        que explica el propósito del programa.
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 25");
        System.out.println("Color favorito: Negro");
        System.out.println("Ciudad: Córdoba");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Este es un mensaje de error.");

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Estoy practicando Java");
        System.out.println("y aprendiendo a programar.");
        System.out.println("Esto es muy divertido!");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("  ^_^  ");

        // 9. Intenta ejecutar el programa sin el méto do principal y observa el error.
        // El programa no se ejecutará porque no hay un méto do main definido. Se rompe la ejecución.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // El nombre del archivo debe coincidir con el nombre de la clase pública. Se ejecuta igualmente

    }
}