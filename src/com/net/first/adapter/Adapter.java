package com.net.first.adapter;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
