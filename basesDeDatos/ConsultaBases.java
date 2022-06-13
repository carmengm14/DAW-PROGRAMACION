import java.sql.*;

public class ConsultaBases {

    public static void main(String[] args) {
        String consulta = "SELECT count(*) as total FROM Cliente";
        String connectionLink = "jdbc:mysql://192.168.204.140/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try (Connection conection = DriverManager.getConnection(connectionLink, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conection.prepareStatement(consulta);
                ResultSet resultado = ps.executeQuery()) {

            while (resultado.next()) {
                int total = resultado.getInt("total");
                System.out.println("Total = " + total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getErrorCode());
            System.out.println(e.getLocalizedMessage());
        }
    }
}
