package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverMySQL {

    public static Connection getConnection() {
        Connection conexao = null;

        try {
            String driver = "com.mysql.jdbc.Driver";
            String usuario = "root";
            String senha = "root";
            String url = "jdbc:mysql://localhost:3306/clinicaagendamentos";
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso!");

        } catch (SQLException e) {

            System.out.println("Erro ao conectar ao Banco de Dados: " + e.getMessage());
        }

        return conexao;
    }
}
