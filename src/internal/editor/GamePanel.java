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

    //UI Items
    UI_Panel sceneItems;
    UI_Panel files;
    UI_Panel properties;


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

        sceneItems = new UI_Panel(
                new Vector2(0, 0),
                new Vector2((ORIGINAL_SCREEN_SIZE.x/2) - 400, newScreenSize.y),
                new Color(5, 5, 28),
                g2
        );
        files = new UI_Panel(
                new Vector2(0, 0),
                new Vector2((ORIGINAL_SCREEN_SIZE.x/2) - 400, newScreenSize.y),
                new Color(5, 5, 28),
                g2
        );
        properties = new UI_Panel(
                new Vector2(1345, 0),
                //new Vector2((ORIGINAL_SCREEN_SIZE.x/2) - 400, newScreenSize.y),
                new Vector2(9087, 235497989),
                new Color(5, 5, 28),
                g2
        );

    }
}
