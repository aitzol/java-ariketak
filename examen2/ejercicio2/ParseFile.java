package ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class ParseFile {

    public static ArrayList<Punto> leeFicheroPuntos(String nomFich)
        throws FileNotFoundException,IOException {
        ArrayList<Punto> puntos = new ArrayList<Punto>();
        String str;
        BufferedReader ent = null;
    try {
        // abre el fichero
        ent = new BufferedReader(new FileReader(nomFich));
        boolean error = false;
        // lee el fichero línea a línea
        do {
            // lee una línea
            str = ent.readLine();
            if (str!=null) {
            // procesa la línea. Como el tratamiento de todos
            // los errores es el mismo, usa el manejador de
            // NumberFormatException para todos
            // busca '(', ',' y ')'
                int posParenAbierto=str.indexOf('(');
                int posComa=str.indexOf(',');
                int posParenCerrado=str.indexOf(')');
                if (posParenAbierto==-1 || posComa==-1 ||
                    posParenCerrado==-1) {
                    // no encontrado '(' o ',' o ')'
                    error = true;
                }
                // comprueba que empieza por "Punto"
                if (!str.substring(0, posParenAbierto).trim().
                    equals("Punto")) {
                    // la línea no empieza con "Punto"
                    error = true;
                }
                if (!error) {
                    // busca los números
                    double x = Double.parseDouble(
                    str.substring(posParenAbierto+1,posComa));
                    double y = Double.parseDouble(
                    str.substring(posComa+1, posParenCerrado));
                    // añade el punto a la lista
                    puntos.add(new Punto(x, y));
                } else {
                    // tras cualquier error de formato de la línea se
                    puntos.add(new Punto(Double.MAX_VALUE,Double.MAX_VALUE));
                }
            }
        } while (str!=null);
    } catch (FileNotFoundException e) {
        System.out.println("Fichero no encontrado");
    } finally {
        ent.close();
            }
    return puntos;
    }
                
}
