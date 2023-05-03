package com.example;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<String, Player> players = new HashMap<>();

    public static Player getPlayer(String cpf) {
        return players.get(cpf);
    }

    public static void addPlayer(Player player) {
        players.put(player.getCpf(), player);
    }
}
