import java.util.Scanner;

public class MainException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número:");

        try {
            double numeros = scanner.nextDouble();

            if (numeros < 0) {
                throw new NumeroNegativoExcepcion("No es posible calcular la raíz cuadrada de un número negativo: " + numeros);
            } else {
                System.out.println("La raíz cuadrada de " + numeros + " es igual a: " + Math.sqrt(numeros));
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}

