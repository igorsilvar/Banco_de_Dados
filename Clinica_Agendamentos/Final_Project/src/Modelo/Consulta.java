package Modelo;

import java.sql.Time;
import java.util.Date;

public class Consulta {

    private int idConsulta;
    private Date dataConsulta;
    private Time horaConsulta;
    private int fkIdUsuario;
    private int fkidPaciente;
    private int fkidMedico;

    public Consulta() {

    }

    public  Consulta(int idConsulta, Date dataConsulta, Time horaConsulta, int fkIdUsuario, int fkidPaciente, int fkidMedico){

        this.idConsulta = idConsulta;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.fkIdUsuario = fkIdUsuario;
        this.fkidPaciente = fkidPaciente;
        this.fkidMedico = fkidMedico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Time getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(Time horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public int getFkIdUsuario() {
        return fkIdUsuario;
    }

    public void setFkIdUsuario(int fkIdUsuario) {
        this.fkIdUsuario = fkIdUsuario;
    }

    public int getFkidPaciente() {
        return fkidPaciente;
    }

    public void setFkidPaciente(int fkidPaciente) {
        this.fkidPaciente = fkidPaciente;
    }

    public int getFkidMedico() {
        return fkidMedico;
    }

    public void setFkidMedico(int fkidMedico) {
        this.fkidMedico = fkidMedico;
    }
}
