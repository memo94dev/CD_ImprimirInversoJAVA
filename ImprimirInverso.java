import java.util.Scanner;

public class ImprimirInverso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Por favor ingresa una cadena de texto: ");
        String texto = sc.nextLine();

        // Mostrar la cadena ingresada por el usuario
        System.out.println("La cadena que ingresaste es: " + texto);

        // Invertir la cadena ingresada por el usuario con un bucle for
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        // Mostrar la cadena invertida
        System.out.println("La cadena invertida es: " + textoInvertido);
    }
}
