package com.net.second.player;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫" + name + "防守");
    }
}
