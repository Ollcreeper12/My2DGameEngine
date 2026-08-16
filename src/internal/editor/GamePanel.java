package internal.editor;

import internal.custom.Time;
import internal.input.KeyInput;
import internal.mathX.vectors.Vector2;
import internal.ui.types.UI_Panel;

import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel implements Runnable{

    public final Vector2 ORIGINAL_SCREEN_SIZE = new Vector2(1280, 720);

    public Vector2 newScreenSize = Vector2.zero();

    final int FPS = 100;

    // Instantiate
    Time time = new Time();
    KeyInput input = new KeyInput();


    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(Vector2.toDimension(ORIGINAL_SCREEN_SIZE));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(input);
        this.setFocusable(true);



    }

    public void start() {

    }
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
        newScreenSize = new Vector2(this.getSize().width, this.getSize().height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        UI_Panel sceneItems = new UI_Panel(
                new Vector2(0, 0),
                new Vector2((ORIGINAL_SCREEN_SIZE.x/2) - 400, newScreenSize.y),
                Color.WHITE,
                g2
        );

    }
}
