import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GestorMontes {
    private String url = "jdbc:mysql://localhost:3306/montes";
    private String user = "root";
    private String pass = "test";
    private ArrayList<Monte> montes = new ArrayList<Monte>();

    public void addMonte(Monte monte) {
        montes.add(monte);
    }

    public void removeMonte(Monte monte) {
        montes.remove(monte);
    }

    public void showMontes() {
        System.out.println("\t\t\tListado de montes");
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre\tProvincia\tAltura\tCoordenadas\tMacizo\tRuta");
        System.out.println("------------------------------------------------------------"); 
        for (Monte monte : montes) {
            System.out.println(monte);
        }
    }

    public Monte getMonteByName(String name) {
        for (Monte monte : montes) {
            if (monte.getNombre().equals(name)) {
                return monte;
            }
        }
        return null;
    }

    public void loadMontesFromTxt() {
        montes.clear();
        try(FileReader montesFile = new FileReader("txt/Mendiak.txt");){
            BufferedReader bf = new BufferedReader(montesFile);
            String line;
            int partCount = 0;
            String monteTemp[] = new String[6];

            while((line = bf.readLine())!=null) {
                if(line.equals("----------------")) {
                    partCount = 0;
                    Monte monte = new Monte(monteTemp);
                    montes.add(monte);
                    System.err.println("Monte añadido: " + monte.getNombre());
                } else { 
                        monteTemp[partCount] = line.split(":")[1];
                        partCount++;
                    }            
            }

        } catch (Exception e) {
            System.err.println("Error al leer el archivo" + e.getMessage());
        }
    }
    public void loadMontesFromBd() {
        montes.clear();     
        try(Connection conn = DriverManager.getConnection(url, user, pass)){
            String query = "SELECT * FROM montes";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                String nombre = rs.getString("nombre");
                String provincia = rs.getString("provincia");
                int altura = rs.getInt("altura");
                String coordenadas = rs.getString("coordenadas");
                String macizo = rs.getString("cordillera");
                String ruta = rs.getString("ruta");
                Monte monte = new Monte(nombre, provincia, altura, coordenadas, macizo, ruta);
                montes.add(monte);
            }
        }catch (Exception e) {
            System.err.println("Error al conectar con la base de datos" + e.getMessage());
        }

    }
    public void saveMontes() {
            try(Connection conn = DriverManager.getConnection(url, user, pass)){
                String truncate = "TRUNCATE TABLE montes";
                PreparedStatement stmt = conn.prepareStatement(truncate);
                stmt.executeUpdate();

                String query = "INSERT INTO montes (nombre, provincia, altura, coordenadas, cordillera, ruta) VALUES (?, ?, ?, ?, ?, ?)";
                stmt = conn.prepareStatement(query);
                for (Monte monte : montes) {
                    stmt.setString(1, monte.getNombre());
                    stmt.setString(2, monte.getProvincia());
                    stmt.setInt(3, monte.getAltura());
                    stmt.setString(4, monte.getCoordenadas());
                    stmt.setString(5, monte.getMacizo());
                    stmt.setString(6, monte.getRuta());
                    stmt.executeUpdate();
                }
        }
        catch (Exception e) {
            System.err.println("Error al conectar con la base de datos" + e.getMessage());
        }
    }
}
