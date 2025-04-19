<<<<<<< HEAD:basic/c01_beginner/BeginnerExercises.java
package basic.c01_beginner;

=======
>>>>>>> main:basic/beginner/BeginnerExercises.java
/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String miNombre = "Santiago";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int miEdad = 26;

        // 3. Crea una variable double con tu altura en metros.
        double miAltura = 1.75;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;

        // 5. Declara una constante con tu email.
        final String MY_EMAIL = "santiandresfer@hotmail.com";
        System.out.println(MY_EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char miInicial = 'S';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String miLocalidad = "Córdoba";
        System.out.println(miLocalidad);
        System.out.println("******************");
        miLocalidad = "Buenos Aires";
        System.out.println(miLocalidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b = 10;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Tipo de a y b: " + ((Object)a).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int sinInicializar;
        sinInicializar = 20;
        System.out.println(sinInicializar);
    }
}
