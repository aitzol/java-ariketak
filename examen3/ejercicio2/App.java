
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> originalList = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        // Pedir los números al usuario y almacenarlos en una lista.
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Inserte numero " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("No es un número válido. Por favor, intente de nuevo.");
                scanner.next(); // Limpiar el scanner
                System.out.print("Inserte numero " + (i + 1) + ": ");
            }
            int number = scanner.nextInt();
            originalList.add(number);
        }

        // 3. Separa los números en dos listas: una con pares y otra con impares.
        for (int number : originalList) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        // 4. Muestra:
        //    La lista original.
        //    La lista de números pares.
        //    La lista de números impares.
        System.out.println("\nOriginal List: " + originalList);
        System.out.println("Even Numbers List: " + evenNumbers);
        System.out.println("Odd Numbers List: " + oddNumbers);

        scanner.close();
    }
}
 