Descripción del código

Ejercicio I: Método para recuperar un carácter de una Cadena
Clase CadenaCa:
Esta clase contiene un método estático llamado caracterEn.
Método caracterEn(String cadena, int posicion):
-Recibe como parámetros una cadena de texto (String) y un entero (int) que indica la posición del carácter a recuperar.
-Si la posición está dentro del rango válido (entre 0 y la longitud de la cadena menos uno), el método devuelve el carácter correspondiente utilizando el método charAt de la clase String.
-Si la posición está fuera del rango, el método lanza una Exception con un mensaje que indica el error.

Ejercicio II: Programa principal usando el método de recuperación de carácter
Clase Main:
-Este programa principal demuestra cómo usar el método caracterEn para recuperar un carácter de una cadena ingresada por el usuario.

Ejercicio III: Excepción personalizada para números negativos
Clase NumeroNegativoExcepcion:
-Esta clase define una excepción personalizada que se lanza cuando se intenta calcular la raíz cuadrada de un número negativo.

Clase MainException:
-Este programa solicita al usuario un número.
-Si el número es positivo, calcula y muestra la raíz cuadrada.
-Si el número es negativo, lanza la excepción NumeroNegativoExcepcion y muestra un mensaje de error.
