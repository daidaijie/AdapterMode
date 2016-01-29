package com.net.second.player;

/**
 * Created by daidaijie on 2016/1/29.
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
