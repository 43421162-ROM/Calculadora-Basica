import java.util.Scanner;

/**
 * Clase principal de la Calculadora
 */

public class Main {

    public static void main(String[] args) {
        // Creacion del objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos de entrada al usuario
        System.out.println("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();

        // Creamos un objeto de tipo Calculadora
        Calculadora calculadora = new Calculadora();

        // Realizamos las operaciones correspondientes
        int suma = calculadora.suma(num1, num2);
        int resta = calculadora.resta(num1, num2);
        int multiplicacion = calculadora.multiplicacion(num1, num2);
        int division = calculadora.division(num1, num2);

        // Impresión de resultados
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
    }
}
