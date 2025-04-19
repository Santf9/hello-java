<<<<<<< HEAD:basic/c02_operators/OperatorsExercises.java
package basic.c02_operators;

=======
>>>>>>> main:basic/operators/OperatorsExercises.java
/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int suma = 5 + 3;
        int resta = 5 - 3;
        int multiplicacion = 5 * 3;
        int division = 5 / 3;
        int modulo = 5 % 3;

        // 2. Crea una variable para cada tipo de operación de asignación.
        var a = 10;
        var b = 2;

        System.out.println(a);
        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        b+= 1;
        System.out.println(b);
        b-= 2;
        System.out.println(b);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a != b);
        System.out.println(a == 4);
        System.out.println(a > b);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a == b);
        System.out.println(a != 4);
        System.out.println(a < b);

        // 5. Utiliza el operador lógico and.
        System.out.println(a > b && b < 5);
        System.out.println(a < b && b > 5);
        System.out.println(true && false);

        // 6. Utiliza el operador lógico or.
        System.out.println(true || false);
        System.out.println(false || false);

        // 7. Combina ambos operadores lógicos.
        System.out.println(true && false || false);
        System.out.println(a > b && b < 5 || a == 4);

        // 8. Añade alguna negación.
        System.out.println(!(a > b));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(-a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println((a + b) > 10 && (a - b) < 5);
    }
}
