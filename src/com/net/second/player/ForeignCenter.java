package com.net.second.player;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("外籍中锋" + name + "进攻");
    }

    public void 防守() {
        System.out.println("外籍中锋" + name + "防守");
    }
}
