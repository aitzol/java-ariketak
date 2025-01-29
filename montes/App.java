import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static int getMenuOption() {
        int selectedOption = 0;
        boolean validOption = false;
        String options [] = {"Cargar montes (txt)",
                              "Cargar montes (bd)",
                              "Añadir monte",
                              "Mostrar montes",
                              "Mostrar monte por nombre",
                              "Eliminar monte",
                              "Guardar montes (bd)" };
        do {
            System.out.println("Seleccione una opción: ");
            for (int i=0;i<options.length; i++) {
                System.out.println(i+1 + ". " + options[i]);
            }
            System.err.println("0. Fin");
            selectedOption = scanner.nextInt();
            scanner.nextLine();
            if (selectedOption >= 0 && selectedOption <= options.length) {
                validOption = true;
            } else {
                System.out.println("Opción no válida");
        }
        } while (!validOption);
        return selectedOption;
    }
    public static void main(String[] args) throws Exception {
        GestorMontes gestor = new GestorMontes();
        int selectedOption = 0;
        Monte monte = null;
        do {    
            selectedOption = getMenuOption();
            switch (selectedOption) {
                case 1:
                    gestor.loadMontesFromTxt();
                    break;
                case 2:
                    gestor.loadMontesFromBd();
                    break;
                case 3:
                    System.out.println("Introduce el nombre del monte: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce la provincia: ");
                    String provincia = scanner.nextLine();
                    System.out.println("Introduce la altura: ");
                    int altura = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce las coordenadas: ");
                    String coordenadas = scanner.nextLine();
                    System.out.println("Introduce el macizo: ");
                    String macizo = scanner.nextLine();
                    System.out.println("Introduce la ruta: ");
                    String ruta = scanner.nextLine();
                    Monte monteTemp = new Monte(nombre, provincia, altura, coordenadas, macizo, ruta);
                    gestor.addMonte(monteTemp);
                    break;
                case 4:
                    gestor.showMontes();
                    break;
                case 5:
                    System.out.println("Introduce el nombre del monte: ");
                    String monteBusqueda = scanner.nextLine();
                    monte = gestor.getMonteByName(monteBusqueda);
                    if (monte != null) {
                        System.out.println(monte);
                    } else {
                        System.out.println("Monte no encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Introduce el nombre del monte: ");
                    String monteBorrado = scanner.nextLine();
                    monte = gestor.getMonteByName(monteBorrado);
                    if (monte != null) {
                        gestor.removeMonte(monte);
                        System.out.println("Monte eliminado");
                    } else {
                        System.out.println("Monte no encontrado");
                    }
                    
                    break;
                case 7:
                    gestor.saveMontes();
                    break;
                default:
                    break;
            }
        } while (selectedOption != 0);
    }
}
