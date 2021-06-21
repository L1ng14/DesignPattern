package com.designPattern.Adapter.player;

public class NBA_player implements Native_Player {
    private String name;

    public NBA_player(String name) {
        this.name =name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak_English() {
        System.out.println(name+"Talk about  Tactics in English。。。。");
    }
}
