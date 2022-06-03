import java.sql.*;

public class ConsultaBases {

    public static void main(String[] args) {
        String consulta = "SELECT count(*) as total FROM Cliente";
        String connectionLink = "jdbc:mysql://192.168.204.160/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conection = DriverManager.getConnection(connectionLink, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conection.prepareStatement(consulta);
                ResultSet resultado = ps.executeQuery()) {

            while (resultado.next()) {
                int total = resultado.getInt("total");
                System.out.println("Total = " + total);
            }
        } catch (SQLException e) {
           System.out.println(e.printStackTrace());
        }
    }
}
