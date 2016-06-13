package ru.pelmegov.tilebasedgame;

import ru.pelmegov.tilebasedgame.display.Display;
import ru.pelmegov.tilebasedgame.gfx.Assets;
import ru.pelmegov.tilebasedgame.gfx.GameCamera;
import ru.pelmegov.tilebasedgame.input.KeyManager;
import ru.pelmegov.tilebasedgame.states.GameState;
import ru.pelmegov.tilebasedgame.states.MenuState;
import ru.pelmegov.tilebasedgame.states.State;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class Game implements Runnable {

    public String title;
    private int width, height;
    private Display display;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    // states
    private State gameState;
    private State menuState;

    // input
    private KeyManager keyManager;

    // camera
    private GameCamera gameCamera;

    private boolean running = false;

    public Game(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        keyManager = new KeyManager();
    }

    private void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);
        Assets.init();

        gameCamera = new GameCamera(this, 0, 0);
        gameState = new GameState(this);
        menuState = new MenuState(this);
        State.setState(gameState);
    }

    private void tick() {

        keyManager.tick();

        if (State.getState() != null) {
            State.getState().tick();
        }
    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        // Clear scene
        g.clearRect(0, 0, width, height);

        // Start Draw
        if (State.getState() != null) {
            State.getState().render(g);
        }
        // End Draw

        bs.show();
        g.dispose();
    }

    @Override
    public void run() {

        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;


        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;

            lastTime = now;

            if (delta >= 1) {
                tick();
                render();
                ticks++;
                delta--;
            }

            if (timer >= 1000000000) {
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }

        stop();

    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public GameCamera getGameCamera() {
        return gameCamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public synchronized void start() {

        System.out.println("Game started");

        if (running) return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {

        if (!running) return;

        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
