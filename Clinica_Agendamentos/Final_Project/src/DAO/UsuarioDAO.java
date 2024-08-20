package DAO;

import Conexao.DriverMySQL;
import Modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserirUsuario(Usuario usuario){

        Connection con = DriverMySQL.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement("insert into usuario(nomeUsuario,senha) values(?,?)");
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getSenha());

            stmt.execute();
            System.out.println("usuário inserido com sucesso!");
            con.close();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuario" + e.getMessage());
        }
    }
}
