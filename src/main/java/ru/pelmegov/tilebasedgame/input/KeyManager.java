package ru.pelmegov.tilebasedgame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys;
    public boolean up, down, left, right;

    public KeyManager() {
        keys = new boolean[256];
    }

    public void tick() {
//        up = keys[KeyEvent.VK_W];
//        down = keys[KeyEvent.VK_S];
//        left = keys[KeyEvent.VK_A];
//        right = keys[KeyEvent.VK_D];
        up = keys[119];
        down = keys[115];
        left = keys[97];
        right = keys[100];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyChar()] = true;
//        System.out.println("Pressed! " + e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyChar()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
