package DAO;

import Conexao.DriverMySQL;
import Modelo.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDAO {
    public int inserirEndereco(Endereco endereco){
        Connection con = DriverMySQL.getConnection();
        PreparedStatement stmt = null;
        int id_inserted = 0;

        try {
            stmt = con.prepareStatement("INSERT INTO endereco(cidade, bairro, rua, numero) VALUES(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, endereco.getCidade());
            stmt.setString(2, endereco.getBairro());
            stmt.setString(3, endereco.getRua());
            stmt.setInt(4, endereco.getNumero());

            stmt.execute();

            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()) {
                System.out.println(rs.getInt(1));
                id_inserted = rs.getInt(1);
            }

            System.out.println("Endereco inserido com sucesso!");
            con.close();

            return id_inserted;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir endereco!" + e.getMessage());
        }
        return id_inserted;
    }
}
