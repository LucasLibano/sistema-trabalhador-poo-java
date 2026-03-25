package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
    private String name;
    private NivelTrabalho level;
    private Double baseSalarial;

    private Departamento departamento;
    private List<HorasContrato> contrato = new ArrayList<>();

    public Trabalho(){

    }

    public Trabalho(String name, NivelTrabalho level, Double baseSalarial, Departamento departamento) {
        this.name = name;
        this.level = level;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalho getLevel() {
        return level;
    }

    public void setLevel(NivelTrabalho level) {
        this.level = level;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContrato> getContracts() {
        return contrato;
    }

    public void adicionarContrato(HorasContrato contrato) {
        contrato.add(contrato);
    }

    public void removerContrato(HorasContrato contrato){
        contrato.remove(contrato);
    }

    public double renda(int ano, int mes){

        double soma = baseSalarial;

        Calendar cal = Calendar.getInstance();

        for(HorasContrato c : contrato){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);

            if(ano == c_ano && mes == c_mes) {
                soma += c.ValorTotal();
            }


        }

        return soma;


    }
}

