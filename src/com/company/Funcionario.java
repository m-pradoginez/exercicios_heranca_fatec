package com.company;

public class Funcionario {
    private int Idfunc;
    private String nome;
    private String email;
    private String documento;

    public int getIdfunc() {
        return Idfunc;
    }

    public void setIdfunc(int idfunc) {
        Idfunc = idfunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
