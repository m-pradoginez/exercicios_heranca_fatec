package com.company;

import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setIdfunc(1);
        gerente.setNome("Luis Alberto");
        gerente.setEmail("luis@email.com");
        gerente.setDocumento("46214434434");
        gerente.setLogin("luis_alberto");
        gerente.setSenha("12345");

        System.out.println("==========================================");
        RegistroPonto entradaGerente = new RegistroPonto();
        entradaGerente.setIdRegPonto(1494945832L);
        entradaGerente.setFunc(gerente);
        entradaGerente.setDataRegistro(entradaGerente.getDataRegistro());
        entradaGerente.setHoraEntrada(entradaGerente.getHoraEntrada());
        entradaGerente.apresentarRegistroPonto(gerente, entradaGerente);
        System.out.println("==========================================");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdfunc(2);
        secretaria.setNome("Joyce Ribeiro");
        secretaria.setEmail("joyce@email.com");
        secretaria.setDocumento("46214434555");
        secretaria.setTelefone("19996239999");
        secretaria.setRamal("55");

        RegistroPonto entradaSecretaria = new RegistroPonto();
        entradaSecretaria.setIdRegPonto(1494945555L);
        entradaSecretaria.setFunc(secretaria);
        entradaSecretaria.setDataRegistro(entradaSecretaria.getDataRegistro());
        entradaSecretaria.setHoraEntrada(entradaSecretaria.getHoraEntrada());
        entradaSecretaria.apresentarRegistroPonto(secretaria, entradaSecretaria);
        System.out.println("==========================================");

        Operador operador = new Operador();
        operador.setIdfunc(3);
        operador.setNome("Lucas Ribeiro");
        operador.setEmail("lucas@email.com");
        operador.setDocumento("46214434444");
        operador.setValorHora(5.99);

        RegistroPonto entradaOperador = new RegistroPonto();
        entradaOperador.setIdRegPonto(344456L);
        entradaOperador.setFunc(operador);
        entradaOperador.setDataRegistro(entradaOperador.getDataRegistro());
        entradaOperador.setHoraEntrada(entradaOperador.getHoraEntrada());
        entradaSecretaria.apresentarRegistroPonto(operador, entradaSecretaria);
        System.out.println("==========================================");

        RegistroPonto saidaGerente = new RegistroPonto();
        saidaGerente.setIdRegPonto(1235945832L);
        saidaGerente.setFunc(gerente);
        saidaGerente.setDataRegistro(saidaGerente.getDataRegistro());
        saidaGerente.setHoraEntrada(saidaGerente.getHoraEntrada());
        saidaGerente.setHoraSaida(saidaGerente.getHoraSaida());
        saidaGerente.apresentarRegistroPonto(gerente, saidaGerente);
        System.out.println("==========================================");

        RegistroPonto saidaSecretaria = new RegistroPonto();
        saidaSecretaria.setIdRegPonto(1235777832L);
        saidaSecretaria.setFunc(secretaria);
        saidaSecretaria.setDataRegistro(saidaSecretaria.getDataRegistro());
        saidaSecretaria.setHoraEntrada(saidaSecretaria.getHoraEntrada());
        saidaSecretaria.setHoraSaida(saidaSecretaria.getHoraSaida());
        saidaSecretaria.apresentarRegistroPonto(secretaria, saidaSecretaria);
        System.out.println("==========================================");

        RegistroPonto saidaOperador = new RegistroPonto();
        saidaOperador.setIdRegPonto(1235111832L);
        saidaOperador.setFunc(operador);
        saidaOperador.setDataRegistro(saidaOperador.getDataRegistro());
        saidaOperador.setHoraEntrada(saidaOperador.getHoraEntrada());
        saidaOperador.setHoraSaida(saidaOperador.getHoraSaida());
        saidaOperador.apresentarRegistroPonto(operador, saidaOperador);
        System.out.println("==========================================");
    }
}
