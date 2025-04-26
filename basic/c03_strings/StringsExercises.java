package c03_strings;
/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String firstName = "Santi";
        String lastName = "Ferreira";
        System.out.println(firstName + " " + lastName);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("La longitud de la cadena es: " + firstName.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println("El primer carácter es: " + firstName.charAt(0));
        System.out.println("El último carácter es: " + firstName.charAt(firstName.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("En mayúsculas: " + firstName.toUpperCase());
        System.out.println("En minúsculas: " + firstName.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String sentence = "Hola, soy Santi Ferreira";
        System.out.println("¿La frase contiene la palabra ? " + sentence.contains("Santi"));

        // 6. Formatea un string con un entero.
        String saludo = "Hola";
        int edad = 26;
        System.out.println(String.format("%s, tengo %d años", saludo, edad));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String stringConEspacios = "   Hola, soy Santi Ferreira   ";
        System.out.println("Cadena sin espacios: " + stringConEspacios.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String stringConGuiones = stringConEspacios.replace(" ", "-");
        System.out.println("Cadena con guiones: " + stringConGuiones);

        // 9. Comprueba si dos strings son iguales.
        String string1 = "Hola";
        String string2 = "hola";
        System.out.println("¿String1 es igual a String2? " + string1.equals(string2));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("¿String1 tiene la misma longitud que String2? " + (string1.length() == string2.length()));
    }
}
