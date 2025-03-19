package ejercicio3;

import java.sql.Driver;

public class ProductDB {

    private String url = "jdbc:mysql://localhost:3306/inventario";
    private String username = "usuario1";
    private String password = "p4ssW0rd";

    public void insertarProductp(Producto p) {
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO productos (nombre, precio) VALUES (?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, p.getNombre());
        statement.setDouble(2, p.getPrecio());
        statement.executeUpdate();
        statement.close();
        conn.close();   
    }

    public ArrayList<Producto> obtenerProductos(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM productos";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            String nombre = result.getString("nombre");
            double precio = result.getDouble("precio");
            productos.add(new Producto(nombre, precio));
        }
        result.close();
        statement.close();
        conn.close();
        return productos;
    }
    public void actualizarProducto(int id, String nombre, double precio) {
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "UPDATE productos SET nombre = ?, precio = ? WHERE id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, nombre);
        statement.setDouble(2, precio);
        statement.setInt(3, id);
        statement.executeUpdate();
        statement.close();
        conn.close();
    }
    
    public void eliminarProducto(String nombre) {
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "DELETE FROM productos WHERE nombre = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, nombre);
        statement.executeUpdate();
        statement.close();
        conn.close();
    }
}
