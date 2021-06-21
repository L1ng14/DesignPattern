package com.designPattern.Adapter.player;

public class CHN_player implements Foreign_Player {

    private String name;

    public CHN_player(String name) {
        this.name =name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Speak_Foreign_Language() {
        System.out.println("用中文说战术。。。。");
    }
}
