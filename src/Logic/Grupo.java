package Logic;


import java.sql.Date;

public class Grupo {

    private String codGrupo;
    private String codAsignatura;
    private int NumGrupo;
    private int CupoGrupo;
    private Date Horario;

    public Grupo(String codGrupo, String codAsignatura, int numGrupo, int cupoGrupo, Date horario) {
        this.codGrupo = codGrupo;
        this.codAsignatura = codAsignatura;
        NumGrupo = numGrupo;
        CupoGrupo = cupoGrupo;
        Horario = horario;
    }

    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public int getNumGrupo() {
        return NumGrupo;
    }

    public void setNumGrupo(int numGrupo) {
        NumGrupo = numGrupo;
    }

    public int getCupoGrupo() {
        return CupoGrupo;
    }

    public void setCupoGrupo(int cupoGrupo) {
        CupoGrupo = cupoGrupo;
    }

    public Date getHorario() {
        return Horario;
    }

    public void setHorario(Date horario) {
        Horario = horario;
    }
}
