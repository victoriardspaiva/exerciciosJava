package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "Vick1993!";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        System.out.println("banco criado!");
        conexao.close();
}
}
