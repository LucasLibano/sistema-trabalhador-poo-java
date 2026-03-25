package entidade;

import java.util.Date;

public class HorasContrato {
    private Date date;
    private Double ValorPorHoras;
    private Integer Horas;

    public void ValorPorHoras (Date date, Double ValorPorHoras, Integer Horas){
    }

    public HorasContrato(Date date, Double valorPorHoras, Integer horas) {
        this.date = date;
        ValorPorHoras = valorPorHoras;
        Horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPorHoras() {
        return ValorPorHoras;
    }

    public void setValorPorHoras(Double valorPorHoras) {
        ValorPorHoras = valorPorHoras;
    }

    public Integer getHoras() {
        return Horas;
    }

    public void setHoras(Integer horas) {
        Horas = horas;
    }

    public void add(HorasContrato contrato) {
    }

    public void remove(HorasContrato contrato) {
    }

    public double ValorTotal(){
        return ValorPorHoras * Horas;
    }
}
