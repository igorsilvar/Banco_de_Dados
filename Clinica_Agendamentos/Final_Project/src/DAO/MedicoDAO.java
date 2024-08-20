package DAO;

import Conexao.DriverMySQL;
import Modelo.Medico;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MedicoDAO {
    public void cadastrarMedico(Medico medico){
        Connection con = DriverMySQL.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement("INSERT medico(nomeMedico, CRM, Fk_idEndereco) VALUES (?,?,?)");
            stmt.setString(1, medico.getNomeMedico());
            stmt.setString(2, medico.getCRM());
            stmt.setInt(3, medico.getFK_idEndereco());

            stmt.execute();
            System.out.println("Medico cadastrado com sucesso!");
            stmt.close();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar medico: " + e.getMessage());
        }
    }
}
