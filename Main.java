import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agrega una cadena:");
        String lectTeclado = scanner.nextLine();

        try {
            char Resultados = CadenaCa.caracterEn(lectTeclado, 6);
            System.out.println("El carácter en la posición número 7 es: " + Resultados);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
    }
}
