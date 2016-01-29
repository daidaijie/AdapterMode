package com.net.first;

import com.net.first.adapter.Adapter;
import com.net.first.adapter.Target;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Target target = new Adapter();
        target.request();
    }
}
