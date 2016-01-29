package com.net.second;

import com.net.second.player.ForeignCenter;
import com.net.second.player.Player;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
