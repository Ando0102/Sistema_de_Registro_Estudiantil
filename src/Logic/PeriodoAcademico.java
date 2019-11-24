package Logic;

import java.util.Date;

public class PeriodoAcademico {

    private String codPeriodoAcad;
    private String Descripcion;
    private Date FechaInicio;
    private Date FechaFin;
    private Date FechaIncioClases;
    private Date FechaFinClases;
    private Date FechaLimitePago;
    private Date FechaLimitePrematricula;
    private Date FechaLimiteRetiro;
    private Date FechaLimitePublicacion;

    public PeriodoAcademico(String codPeriodoAcad, String descripcion, Date fechaInicio, Date fechaFin, Date fechaIncioClases, Date fechaFinClases, Date fechaLimitePago, Date fechaLimitePrematricula, Date fechaLimiteRetiro, Date fechaLimitePublicacion) {
        this.codPeriodoAcad = codPeriodoAcad;
        Descripcion = descripcion;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        FechaIncioClases = fechaIncioClases;
        FechaFinClases = fechaFinClases;
        FechaLimitePago = fechaLimitePago;
        FechaLimitePrematricula = fechaLimitePrematricula;
        FechaLimiteRetiro = fechaLimiteRetiro;
        FechaLimitePublicacion = fechaLimitePublicacion;
    }

    public String getCodPeriodoAcad() {
        return codPeriodoAcad;
    }

    public void setCodPeriodoAcad(String codPeriodoAcad) {
        this.codPeriodoAcad = codPeriodoAcad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }

    public Date getFechaIncioClases() {
        return FechaIncioClases;
    }

    public void setFechaIncioClases(Date fechaIncioClases) {
        FechaIncioClases = fechaIncioClases;
    }

    public Date getFechaFinClases() {
        return FechaFinClases;
    }

    public void setFechaFinClases(Date fechaFinClases) {
        FechaFinClases = fechaFinClases;
    }

    public Date getFechaLimitePago() {
        return FechaLimitePago;
    }

    public void setFechaLimitePago(Date fechaLimitePago) {
        FechaLimitePago = fechaLimitePago;
    }

    public Date getFechaLimitePrematricula() {
        return FechaLimitePrematricula;
    }

    public void setFechaLimitePrematricula(Date fechaLimitePrematricula) {
        FechaLimitePrematricula = fechaLimitePrematricula;
    }

    public Date getFechaLimiteRetiro() {
        return FechaLimiteRetiro;
    }

    public void setFechaLimiteRetiro(Date fechaLimiteRetiro) {
        FechaLimiteRetiro = fechaLimiteRetiro;
    }

    public Date getFechaLimitePublicacion() {
        return FechaLimitePublicacion;
    }

    public void setFechaLimitePublicacion(Date fechaLimitePublicacion) {
        FechaLimitePublicacion = fechaLimitePublicacion;
    }
}
