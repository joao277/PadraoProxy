package com.example;

import java.util.List;

public class PlayerProxy implements IPlayer{

    private Player player;

    private String cpf;

    public PlayerProxy(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.player == null) {
            this.player = new Player(this.cpf);
        }
        return this.player.obterDadosPessoais();
    }

    @Override
    public List<String> obterContatos(GM gameMaster) {
        if (!gameMaster.isValidado()) {
            throw new IllegalArgumentException("Faça login no sistema");
        }
        if (this.player == null) {
            this.player = new Player(this.cpf);
        }
        return this.player.obterContatos(gameMaster);
    }
}