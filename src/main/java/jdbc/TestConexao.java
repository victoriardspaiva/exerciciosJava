package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexao {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306"; // stringDeConexao
        String usuario = "root";
        String senha = "Vick1993!";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Servidor up!");
        conexao.close();
    }
}
