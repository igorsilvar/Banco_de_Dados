import Conexao.DriverMySQL;
import DAO.EnderecoDAO;
import DAO.MedicoDAO;
import DAO.UsuarioDAO;
import Modelo.Endereco;
import Modelo.Medico;
import Modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        //Teste de conexão com o banco de dados;
        Connection con = DriverMySQL.getConnection();
        PreparedStatement ps = null;
/*
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        usuario.setNomeUsuario("Mary jane");
        usuario.setSenha("4321");

        dao.inserirUsuario(usuario);

*/
        EnderecoDAO dao = new EnderecoDAO();
        Endereco endereco = new Endereco();
        int idEndereco;

        endereco.setCidade("Corrente");
        endereco.setBairro("Nova Corrente");
        endereco.setRua("Rua do Corrente");
        endereco.setNumero(123);
        idEndereco = dao.inserirEndereco(endereco);
        System.out.println("ID: "+idEndereco);

//        MedicoDAO dao = new MedicoDAO();
//        Medico medico = new Medico();
//
//        medico.setNomeMedico("João Cardoso");
//        medico.setCRM("12345678");
//        medico.setFK_idEndereco(2);
//
//        dao.cadastrarMedico(medico);


    }
}
