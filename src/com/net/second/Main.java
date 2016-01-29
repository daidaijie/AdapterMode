package com.net.second;

import com.net.second.player.Forwards;
import com.net.second.player.Player;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Main {
    public static void main(String[] args) {
        Player player1 = new Forwards("戴杰");
        player1.attack();

        Player player2 = new Translator("姚明");
        player2.attack();
        player2.defense();

    }
}
