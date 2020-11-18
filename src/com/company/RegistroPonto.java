package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class RegistroPonto {
    private Long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public Long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(Long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = java.time.LocalDate.now();
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.horaEntrada = java.time.LocalDateTime.now();
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = java.time.LocalDateTime.now();
    }

    public void apresentarRegistroPonto(Funcionario func, RegistroPonto ponto) {
        System.out.println("Funcionário: " + func.getNome());
        System.out.println("Data de Registro: " + ponto.getDataRegistro());
        System.out.println("Horário de Entrada: " + ponto.getHoraEntrada());
        if (ponto.getHoraSaida() == null){
            System.out.println("Horário de Saída: Não registrado");
        }else {
            System.out.println("Horário de Saída: " + ponto.getHoraSaida());
        }

    }
}
