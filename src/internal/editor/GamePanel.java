package internal.editor;

import internal.custom.Time;
import internal.input.KeyInput;
import internal.mathX.vectors.Vector2;

import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel implements Runnable{

    public final Vector2 SCREEN_SIZE = new Vector2(1280, 720);
    final int FPS = 100;

    // Instantiate
    Time time = new Time();
    KeyInput input = new KeyInput();

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(Vector2.toDimension(SCREEN_SIZE));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(input);
        this.setFocusable(true);
    }

    public void start() {}
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while (gameThread != null) {
            if (time.deltaTimeAccumulator(FPS, false)) {
                update();
                repaint();

            }
        }

    }

    public void update() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    }
}
