import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class App {
    public static void main(String[] args) throws IOException {
        final int INDICE_TELEFONO = 7;
        String[] linea;
        File restaurantes = new File("restaurantes.csv");
        FileReader f = new FileReader(restaurantes);
        ;

        try(BufferedReader b = new BufferedReader(f)){
        System.out.println("Leyendo archivo restaurantes.csv");
        String data;
        while ((data = b.readLine())!=null) {
            linea = data.split(",");
            if(linea[INDICE_TELEFONO].trim().isEmpty() || linea[INDICE_TELEFONO].trim().isBlank()){
                System.out.println("El restaurante "+linea[1]+" no tiene telefono");
            }
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}   
