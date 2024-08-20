package Modelo;

public class Medico {
    private int idMedico;
    private String nomeMedico;
    private String CRM;
    private int FK_idEndereco;

    public Medico() {

    }

    public Medico(int idMedico, String nomeMedico, String CRM, int FK_idEndereco) {
        this.idMedico = idMedico;
        this.nomeMedico = nomeMedico;
        this.CRM = CRM;
        this.FK_idEndereco = FK_idEndereco;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public int getFK_idEndereco() {
        return FK_idEndereco;
    }

    public void setFK_idEndereco(int FK_idEndereco) {
        this.FK_idEndereco = FK_idEndereco;
    }
}
