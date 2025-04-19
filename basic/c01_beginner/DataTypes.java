<<<<<<< HEAD:basic/c01_beginner/DataTypes.java
package basic.c01_beginner;

=======
>>>>>>> main:basic/beginner/DataTypes.java
/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class DataTypes {

    public static void main(String[] args) {

        // Tipos de datos primitivos
        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.77;
        System.out.println(myDouble);

        // float, long, byte

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        // Ver el tipo de dato en tiempo de compilación
        System.out.println(myString.getClass().getSimpleName());
    }
}
