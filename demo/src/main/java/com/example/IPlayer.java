package com.example;


import java.util.List;

public interface IPlayer {

    List<String> obterDadosPessoais();
    List<String> obterContatos(GM gameMaster);
}