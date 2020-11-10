package com.designPattern.Adapter;

import com.designPattern.Adapter.player.Foreign_Player;
import com.designPattern.Adapter.player.NBA_player;
import com.designPattern.Adapter.player.Native_Player;

public class Adapter_Translator implements Native_Player {

    private Foreign_Player foreign_player;


    public Adapter_Translator(Foreign_Player foreign_player) {
        this.foreign_player = foreign_player;
    }

    public String getName() {
        return foreign_player.getName()+" 的翻译人员";
    }

    @Override
    public void speak_English() {
        System.out.println("翻译人员翻译中文战术成英语给队友-------");
    }
}
