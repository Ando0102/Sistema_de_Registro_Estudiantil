package Logic;

public class Asignatura {

    private String codAsignatura;
    private String nombre;
    private int creditos;
    private int HorasTeoricas;
    private int HorasPracticas;

    public Asignatura(String codAsignatura, String nombre, int creditos, int horasTeoricas, int horasPracticas) {
        this.codAsignatura = codAsignatura;
        this.nombre = nombre;
        this.creditos = creditos;
        HorasTeoricas = horasTeoricas;
        HorasPracticas = horasPracticas;
    }

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHorasTeoricas() {
        return HorasTeoricas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        HorasTeoricas = horasTeoricas;
    }

    public int getHorasPracticas() {
        return HorasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        HorasPracticas = horasPracticas;
    }
}
