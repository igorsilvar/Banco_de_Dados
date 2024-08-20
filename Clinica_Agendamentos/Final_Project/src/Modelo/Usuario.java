package Modelo;public class Usuario {
    private String idUsuario;
    private String nomeUsuario;
    private String senha;

    public Usuario(){

    }

    public Usuario(String idUsuario, String nomeUsuario, String senha) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nome) {
        this.nomeUsuario = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
