package com.net.second.player;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋" + name + "防守");
    }
}
