package com.example;

import java.util.Arrays;
import java.util.List;

public class Player implements  IPlayer{

    private String nome;
    private String cidade;
    private String celular;
    private String telefone;
    private String cpf;

    public Player(String cpf) {
        this.cpf = cpf;
        Player objeto = BD.getPlayer(cpf);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.celular = objeto.celular;
        this.telefone = objeto.telefone;
        this.cpf = objeto.cpf;
    }

    public Player(String nome, String cidade, String celular, String telefone, String cpf) {

        this.nome = nome;
        this.cidade = cidade;
        this.celular = celular;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade, this.cpf);
    }

    @Override
    public List<String> obterContatos(GM gameMaster) {
        return Arrays.asList(this.celular, this.telefone);
    }
}